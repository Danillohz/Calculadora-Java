package br.com.danillo.calculadoraview;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JSpinner;
import java.awt.Color;

public class MainViewCal extends JFrame {

	private JPanel contentPane;
	private JTextField txtresult;
	private JLabel lbresult;

	private String numero1 = "0";
	private String numero2 = "0";
	private double numeroum;
	private double numerodois;
	private double numeropotencia;
	private double result;
	private String sinal;

	public boolean check;
	public boolean checkrestart;
	public boolean checkpoten;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Windows".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| javax.swing.UnsupportedLookAndFeelException ex) {
			System.err.println(ex);
		}
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainViewCal frame = new MainViewCal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainViewCal() {

		check = false;
		checkrestart = false;
		checkpoten = false;
		numerodois = 0;
		System.out.println(checkrestart);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 446, 570);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(0, 167, 430, 364);
		contentPane.add(panel);
		panel.setLayout(null);

		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(4, 0, 104, 60);
		panel.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setBounds(110, 0, 104, 60);
		panel.add(btnNewButton_1);

		JButton btnNewButton_1_1 = new JButton("New button");
		btnNewButton_1_1.setBounds(216, 0, 104, 60);
		panel.add(btnNewButton_1_1);

		JButton btndelet = new JButton("");
		btndelet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				delet();

			}
		});
		btndelet.setIcon(new ImageIcon(MainViewCal.class.getResource("/imagens/1632602 (2).png")));
		btndelet.setBounds(322, 0, 104, 60);
		panel.add(btndelet);

		JButton btndivisão = new JButton("/");
		btndivisão.setFont(new Font("Arial Black", Font.BOLD, 20));
		btndivisão.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtresult.setText(txtresult.getText() + "/");
				sinal = "/";
				check = true;
				checkrestart = false;
			}
		});
		btndivisão.setBounds(322, 60, 104, 60);
		panel.add(btndivisão);

		JButton btnvezes = new JButton("x");
		btnvezes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtresult.setText(txtresult.getText() + "*");
				sinal = "*";
				check = true;
				checkrestart = false;
			}
		});
		btnvezes.setFont(new Font("Arial Black", Font.BOLD, 17));
		btnvezes.setBounds(322, 120, 104, 60);
		panel.add(btnvezes);

		JButton btnmenos = new JButton("-");
		btnmenos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtresult.setText(txtresult.getText() + "-");
				sinal = "-";
				check = true;
				checkrestart = false;
			}
		});
		btnmenos.setFont(new Font("Arial Black", Font.BOLD, 25));
		btnmenos.setBounds(322, 180, 104, 60);
		panel.add(btnmenos);

		JButton btnmais = new JButton("+");
		btnmais.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtresult.setText(txtresult.getText() + "+");
				sinal = "+";
				check = true;
				checkrestart = false;

			}
		});
		btnmais.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 20));
		btnmais.setBounds(322, 240, 104, 60);
		panel.add(btnmais);

		JButton btnresult = new JButton("=");
		btnresult.setBackground(Color.BLUE);
		btnresult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				switch (sinal) {
				case "+":
					result = numeroum + numerodois;
					break;
				case "-":
					result = numeroum - numerodois;
					break;
				case "/":
					result = numeroum / numerodois;
					break;
				case "*":
					result = numeroum * numerodois;
					break;
				case "^":
					result = Math.pow(numeroum, numeropotencia);
					break;
				}
				String resultS = String.valueOf(result);
				txtresult.setText(resultS);
				check = false;
				checkrestart = true;
				checkpoten = false;
				numeroum = result;
				numero2 = "0";
				System.out.println(checkrestart);

			}
		});
		btnresult.setFont(new Font("Arial", Font.BOLD, 43));
		btnresult.setBounds(322, 300, 104, 60);
		panel.add(btnresult);

		JButton btnNewButton_1_1_1_1_2 = new JButton("New button");
		btnNewButton_1_1_1_1_2.setBounds(216, 60, 104, 60);
		panel.add(btnNewButton_1_1_1_1_2);

		JButton btnpotencia = new JButton("");
		btnpotencia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sinal = "^";
				txtresult.setText(txtresult.getText() + "^");
				checkpoten = true;
				check = true;
				checkrestart = false;

			}
		});
		btnpotencia.setIcon(
				new ImageIcon(MainViewCal.class.getResource("/imagens/maxresdefault-removebg-preview (1).png")));
		btnpotencia.setBounds(110, 60, 104, 60);
		panel.add(btnpotencia);

		JButton btnNewButton_1_1_1_1_4 = new JButton("New button");
		btnNewButton_1_1_1_1_4.setBounds(4, 60, 104, 60);
		panel.add(btnNewButton_1_1_1_1_4);

		JButton btnNewButton_1_1_1_1_1_1_1_1 = new JButton("+");
		btnNewButton_1_1_1_1_1_1_1_1.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 20));
		btnNewButton_1_1_1_1_1_1_1_1.setBounds(4, 300, 104, 60);
		panel.add(btnNewButton_1_1_1_1_1_1_1_1);

		JButton btnzero = new JButton("0");
		btnzero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (checkrestart == true) {
					delet();
					checkrestart = false;
				} else if (checkpoten == true) {
					numeropotencia = 0;
					System.out.println(checkpoten);

				}
				if (check == false) {
					txtresult.setText(txtresult.getText() + "0");
					numero1 = numero1 + "0";
					numeroum = Double.parseDouble(numero1);

				} else if (check == true) {
					txtresult.setText(txtresult.getText() + "0");
					numero2 = numero2 + "0";
					numerodois = Double.parseDouble(numero2);

				}
			}
		});
		btnzero.setFont(new Font("Arial", Font.PLAIN, 20));
		btnzero.setBounds(110, 300, 104, 60);
		panel.add(btnzero);

		JButton btndois = new JButton("2");
		btndois.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (checkrestart == true) {
					delet();
					checkrestart = false;
				} else if (checkpoten == true) {
					numeropotencia = 2;
					System.out.println(checkpoten);

				}
				if (check == false) {
					txtresult.setText(txtresult.getText() + "2");
					numero1 = numero1 + "2";
					numeroum = Double.parseDouble(numero1);

				} else if (check == true) {
					txtresult.setText(txtresult.getText() + "2");
					numero2 = numero2 + "2";
					numerodois = Double.parseDouble(numero2);

				}
			}
		});
		btndois.setFont(new Font("Arial", Font.PLAIN, 20));
		btndois.setBounds(110, 240, 104, 60);
		panel.add(btndois);

		JButton btnum = new JButton("1");
		btnum.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (checkrestart == true) {
					delet();
					checkrestart = false;
				} else if (checkpoten == true) {
					numeropotencia = 1;
					System.out.println(checkpoten);

				}
				if (check == false) {
					txtresult.setText(txtresult.getText() + "1");
					numero1 = numero1 + "1";
					numeroum = Double.parseDouble(numero1);

				} else if (check == true) {
					txtresult.setText(txtresult.getText() + "1");
					numero2 = numero2 + "1";
					numerodois = Double.parseDouble(numero2);

				}
			}
		});
		btnum.setFont(new Font("Arial", Font.PLAIN, 20));
		btnum.setBounds(4, 240, 104, 60);
		panel.add(btnum);

		JButton btntrês = new JButton("3");
		btntrês.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (checkrestart == true) {
					delet();
					checkrestart = false;
				} else if (checkpoten == true) {
					numeropotencia = 2;
					System.out.println(checkpoten);

				}
				if (check == false) {
					txtresult.setText(txtresult.getText() + "3");
					numero1 = numero1 + "3";
					numeroum = Double.parseDouble(numero1);

				} else if (check == true) {
					txtresult.setText(txtresult.getText() + "3");
					numero2 = numero2 + "3";
					numerodois = Double.parseDouble(numero2);

				}
			}
		});
		btntrês.setFont(new Font("Arial", Font.PLAIN, 20));
		btntrês.setBounds(216, 240, 104, 60);
		panel.add(btntrês);

		JButton btnvirgula = new JButton(",");
		btnvirgula.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (checkrestart == true) {
					delet();
					checkrestart = false;
				}

				if (check == false) {
					txtresult.setText(txtresult.getText() + ",");
					numero1 = numero1 + ".";
					numeroum = Double.parseDouble(numero1);
				}

			}
		});
		btnvirgula.setVerticalAlignment(SwingConstants.TOP);
		btnvirgula.setFont(new Font("Arial", Font.BOLD, 40));
		btnvirgula.setBounds(216, 300, 104, 60);
		panel.add(btnvirgula);

		JButton btncinco = new JButton("5");
		btncinco.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (checkrestart == true) {
					delet();
					checkrestart = false;
				} else if (checkpoten == true) {
					numeropotencia = 5;
					System.out.println(checkpoten);

				}
				if (check == false) {
					txtresult.setText(txtresult.getText() + "5");
					numero1 = numero1 + "5";
					numeroum = Double.parseDouble(numero1);

				} else if (check == true) {
					txtresult.setText(txtresult.getText() + "5");
					numero2 = numero2 + "5";
					numerodois = Double.parseDouble(numero2);

				}
			}
		});
		btncinco.setFont(new Font("Arial", Font.PLAIN, 20));
		btncinco.setBounds(110, 180, 104, 60);
		panel.add(btncinco);

		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (checkrestart == true) {
					delet();
					checkrestart = false;
				} else if (checkpoten == true) {
					numeropotencia = 8;
					System.out.println(checkpoten);

				}
				if (check == false) {
					txtresult.setText(txtresult.getText() + "8");
					numero1 = numero1 + "8";
					numeroum = Double.parseDouble(numero1);

				} else if (check == true) {
					txtresult.setText(txtresult.getText() + "8");
					numero2 = numero2 + "8";
					numerodois = Double.parseDouble(numero2);

				}
			}
		});
		btn8.setFont(new Font("Arial", Font.PLAIN, 20));
		btn8.setBounds(110, 120, 104, 60);
		panel.add(btn8);

		JButton btnquatro = new JButton("4");
		btnquatro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (checkrestart == true) {
					delet();
					checkrestart = false;
				} else if (checkpoten == true) {
					numeropotencia = 4;
					System.out.println(checkpoten);

				}
				if (check == false) {
					txtresult.setText(txtresult.getText() + "4");
					numero1 = numero1 + "4";
					numeroum = Double.parseDouble(numero1);

				} else if (check == true) {
					txtresult.setText(txtresult.getText() + "4");
					numero2 = numero2 + "4";
					numerodois = Double.parseDouble(numero2);

				}
			}
		});
		btnquatro.setFont(new Font("Arial", Font.PLAIN, 20));
		btnquatro.setBounds(4, 180, 104, 60);
		panel.add(btnquatro);

		JButton btnsete = new JButton("7");
		btnsete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (checkrestart == true) {
					delet();
					checkrestart = false;
				} else if (checkpoten == true) {
					numeropotencia = 7;
					System.out.println(checkpoten);

				}
				if (check == false) {
					txtresult.setText(txtresult.getText() + "7");
					numero1 = numero1 + "7";
					numeroum = Double.parseDouble(numero1);

				} else if (check == true) {
					txtresult.setText(txtresult.getText() + "7");
					numero2 = numero2 + "7";
					numerodois = Double.parseDouble(numero2);

				}
			}
		});
		btnsete.setFont(new Font("Arial", Font.PLAIN, 20));
		btnsete.setBounds(4, 120, 104, 60);
		panel.add(btnsete);

		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (checkrestart == true) {
					delet();
					checkrestart = false;
				} else if (checkpoten == true) {
					numeropotencia = 9;
					System.out.println(checkpoten);

				}
				if (check == false) {
					txtresult.setText(txtresult.getText() + "9");
					numero1 = numero1 + "9";
					numeroum = Double.parseDouble(numero1);

				} else if (check == true) {
					txtresult.setText(txtresult.getText() + "9");
					numero2 = numero2 + "9";
					numerodois = Double.parseDouble(numero2);

				}
			}
		});
		btn9.setFont(new Font("Arial", Font.PLAIN, 20));
		btn9.setBounds(216, 120, 104, 60);
		panel.add(btn9);

		JButton btnseis = new JButton("6");
		btnseis.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (checkrestart == true) {
					delet();
					checkrestart = false;
				} else if (checkpoten == true) {
					numeropotencia = 6;
					System.out.println(checkpoten);

				}
				if (check == false) {
					txtresult.setText(txtresult.getText() + "6");
					numero1 = numero1 + "6";
					numeroum = Double.parseDouble(numero1);

				} else if (check == true) {
					txtresult.setText(txtresult.getText() + "6");
					numero2 = numero2 + "6";
					numerodois = Double.parseDouble(numero2);

				}
			}
		});
		btnseis.setFont(new Font("Arial", Font.PLAIN, 20));
		btnseis.setBounds(216, 180, 104, 60);
		panel.add(btnseis);

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 0, 430, 166);
		contentPane.add(panel_1);
		panel_1.setLayout(null);

		txtresult = new JTextField();
		txtresult.setHorizontalAlignment(SwingConstants.RIGHT);
		txtresult.setBounds(70, 128, 350, 27);
		panel_1.add(txtresult);
		txtresult.setColumns(10);
	}

	public void delet() {
		numero1 = "0";
		numero2 = "0";
		numeroum = 0;
		numerodois = 0;
		txtresult.setText(null);

	}

}
