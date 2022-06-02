package br.com.danillo.calculadoraview;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JLabel;

public class MainViewCal extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtresult;

	private String numero1 = "0";
	private String numero2 = "0";
	private String sinal;
	private double numeroum;
	private double numerodois;
	private double numeropotencia;
	private double result;

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
		sinal = "_";

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 446, 570);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.setBackground(new Color(0f, 0f, 0f, 0f));
		contentPane.setOpaque(false);

		JPanel panel = new JPanel();
		panel.setBounds(0, 167, 430, 364);
		contentPane.add(panel);
		panel.setLayout(null);
		panel.setBackground(new Color(0f, 0f, 0f, 0f));
		panel.setOpaque(false);

		JButton btnNewButton = new JButton("%");
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.setOpaque(true);
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setBorder(null);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtresult.setText(txtresult.getText() + "%");
				sinal = "%";
				check = true;
				checkrestart = false;

			}
		});
		btnNewButton.setFont(new Font("Arial Black", Font.PLAIN, 17));
		btnNewButton.setBounds(4, 3, 104, 57);

		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtresult.setText(txtresult.getText() + "%");
				sinal = "%";
				check = true;
				checkrestart = false;
				
			}
		});
		btnNewButton.setFont(new Font("Arial Black", Font.PLAIN, 17));
		btnNewButton.setBounds(4, 0, 104, 60);
		panel.add(btnNewButton);

		JButton btnce = new JButton("CE");
		btnce.setContentAreaFilled(false);
		btnce.setOpaque(true);
		btnce.setBackground(Color.WHITE);
		btnce.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnce.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			   if(sinal != "_") {
				txtresult.setText(numero1 + sinal);
			   }
				numerodois = 0;
			
				
				
				
			}
		});
		btnce.setBounds(110, 3, 104, 57);
		panel.add(btnce);

		JButton btnc = new JButton("C");
		btnc.setContentAreaFilled(false);
		btnc.setOpaque(true);
		btnc.setBackground(Color.WHITE);
		btnc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				delet();
			}
		});
		btnc.setFont(new Font("Arial", Font.PLAIN, 19));
		btnc.setBounds(216, 3, 104, 57);
		panel.add(btnc);

		JButton btndelet = new JButton("");
		btndelet.setContentAreaFilled(false);
		btndelet.setOpaque(true);
		btndelet.setBackground(Color.WHITE);
		btndelet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				

			}
		});
		btndelet.setIcon(new ImageIcon(MainViewCal.class.getResource("/imagens/1632602 (2).png")));
		btndelet.setBounds(322, 3, 104, 57);
		panel.add(btndelet);

		JButton btndivisão = new JButton("/");
		btndivisão.setContentAreaFilled(false);
		btndivisão.setOpaque(true);
		btndivisão.setBackground(Color.WHITE);
		btndivisão.setBorder(null);
		btndivisão.setFont(new Font("Arial Black", Font.PLAIN, 20));
		btndivisão.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtresult.setText(txtresult.getText() + "/");
				sinal = "/";
				check = true;
				checkrestart = false;
			}
		});
		btndivisão.setBounds(322, 63, 104, 57);
		panel.add(btndivisão);

		JButton btnvezes = new JButton("x");
		btnvezes.setContentAreaFilled(false);
		btnvezes.setOpaque(true);
		btnvezes.setBackground(Color.WHITE);
		btnvezes.setBorder(null);
		btnvezes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtresult.setText(txtresult.getText() + "*");
				sinal = "*";
				check = true;
				checkrestart = false;
			}
		});
		btnvezes.setFont(new Font("Arial Black", Font.PLAIN, 17));
		btnvezes.setBounds(322, 123, 104, 57);
		panel.add(btnvezes);

		JButton btnmenos = new JButton("-");
		btnmenos.setContentAreaFilled(false);
		btnmenos.setOpaque(true);
		btnmenos.setBackground(Color.WHITE);
		btnmenos.setBorder(null);
		btnmenos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtresult.setText(txtresult.getText() + "-");
				sinal = "-";
				check = true;
				checkrestart = false;
			}
		});
		btnmenos.setFont(new Font("Arial Black", Font.PLAIN, 25));
		btnmenos.setBounds(322, 183, 104, 57);
		panel.add(btnmenos);

		JButton btnmais = new JButton("+");
		btnmais.setContentAreaFilled(false);
		btnmais.setOpaque(true);
		btnmais.setBackground(Color.WHITE);
		btnmais.setBorder(null);
		btnmais.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtresult.setText(txtresult.getText() + "+");
				sinal = "+";
				check = true;
				checkrestart = false;

			}
		});
		btnmais.setFont(new Font("Arial Black", Font.PLAIN, 20));
		btnmais.setBounds(322, 243, 104, 57);
		panel.add(btnmais);

		JButton btnresult = new JButton("=");
		btnresult.setContentAreaFilled(false);
		btnresult.setOpaque(true);
		btnresult.setBackground(new Color(100, 149, 237));
		btnresult.setBorder(null);
		btnresult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (sinal == "_") {
					sinal = "=";
				}
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
				case "%":
					result = numeroum / 100 * numerodois;
					break;
				case "=":
                    result = numeroum;
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
		btnresult.setFont(new Font("Arial", Font.PLAIN, 40));
		btnresult.setBounds(322, 303, 104, 57);
		panel.add(btnresult);

		JButton btnNewButton_1_1_1_1_2 = new JButton("New button");
		btnNewButton_1_1_1_1_2.setBounds(216, 63, 104, 57);
		panel.add(btnNewButton_1_1_1_1_2);

		JButton btnpotencia = new JButton("");
		btnpotencia.setContentAreaFilled(false);
		btnpotencia.setOpaque(true);
		btnpotencia.setBackground(Color.WHITE);
		btnpotencia.setBorder(null);
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
		btnpotencia.setBounds(110, 63, 104, 57);
		panel.add(btnpotencia);

		JButton btnNewButton_1_1_1_1_4 = new JButton("New button");
		btnNewButton_1_1_1_1_4.setBounds(4, 63, 104, 57);
		panel.add(btnNewButton_1_1_1_1_4);

		JButton btnmn = new JButton("+");
		btnmn.setContentAreaFilled(false);
		btnmn.setOpaque(true);
		btnmn.setBackground(Color.WHITE);
		btnmn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		btnmn.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 20));
		btnmn.setBounds(4, 303, 104, 57);
		panel.add(btnmn);

		JButton btnzero = new JButton("0");
		btnzero.setContentAreaFilled(false);
		btnzero.setOpaque(true);
		btnzero.setBackground(Color.WHITE);
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
		btnzero.setBounds(110, 303, 104, 57);
		panel.add(btnzero);

		JButton btndois = new JButton("2");
		btndois.setContentAreaFilled(false);
		btndois.setOpaque(true);
		btndois.setBackground(Color.WHITE);
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
		btndois.setBounds(110, 243, 104, 57);
		panel.add(btndois);

		JButton btnum = new JButton("1");
		btnum.setContentAreaFilled(false);
		btnum.setOpaque(true);
		btnum.setBackground(Color.WHITE);
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
		btnum.setBounds(4, 243, 104, 57);
		panel.add(btnum);

		JButton btntres = new JButton("3");
		btntres.setContentAreaFilled(false);
		btntres.setOpaque(true);
		btntres.setBackground(Color.WHITE);
		btntres.addActionListener(new ActionListener() {
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
		btntres.setFont(new Font("Arial", Font.PLAIN, 20));
		btntres.setBounds(216, 243, 104, 57);
		panel.add(btntres);

		JButton btnvirgula = new JButton(",");
		btnvirgula.setContentAreaFilled(false);
		btnvirgula.setOpaque(true);
		btnvirgula.setBackground(Color.WHITE);
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
		btnvirgula.setBounds(216, 303, 104, 57);
		panel.add(btnvirgula);

		JButton btncinco = new JButton("5");
		btncinco.setContentAreaFilled(false);
		btncinco.setOpaque(true);
		btncinco.setBackground(Color.WHITE);
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
		btncinco.setBounds(110, 183, 104, 57);
		panel.add(btncinco);

		JButton btnoito = new JButton("8");
		btnoito.setContentAreaFilled(false);
		btnoito.setOpaque(true);
		btnoito.setBackground(Color.WHITE);
		btnoito.addActionListener(new ActionListener() {
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
		btnoito.setFont(new Font("Arial", Font.PLAIN, 20));
		btnoito.setBounds(110, 123, 104, 57);
		panel.add(btnoito);

		JButton btnquatro = new JButton("4");
		btnquatro.setContentAreaFilled(false);
		btnquatro.setOpaque(true);
		btnquatro.setBackground(Color.WHITE);
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
		btnquatro.setBounds(4, 183, 104, 57);
		panel.add(btnquatro);

		JButton btnsete = new JButton("7");
		btnsete.setContentAreaFilled(false);
		btnsete.setOpaque(true);
		btnsete.setBackground(Color.WHITE);
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
		btnsete.setBounds(4, 123, 104, 57);
		panel.add(btnsete);

		JButton btnnove = new JButton("9");
		btnnove.setContentAreaFilled(false);
		btnnove.setOpaque(true);
		btnnove.setBackground(Color.WHITE);
		btnnove.addActionListener(new ActionListener() {
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
		btnnove.setFont(new Font("Arial", Font.PLAIN, 20));
		btnnove.setBounds(216, 123, 104, 57);
		panel.add(btnnove);

		JButton btnseis = new JButton("6");
		btnseis.setContentAreaFilled(false);
		btnseis.setOpaque(true);
		btnseis.setBackground(Color.WHITE);
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
		btnseis.setBounds(216, 183, 104, 57);
		panel.add(btnseis);

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 0, 430, 166);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		panel_1.setBackground(new Color(0f, 0f, 0f, 0f));
		panel_1.setOpaque(false);

		txtresult = new JTextField();
		txtresult.setDisabledTextColor(Color.WHITE);
		txtresult.setOpaque(false);
		txtresult.setVerifyInputWhenFocusTarget(false);
		txtresult.setBackground(new Color(0f, 0f, 0f, 0f));
		txtresult.setBorder(null);
		txtresult.setBackground(new Color(0f,0f, 0f, 0f));
		txtresult.setHorizontalAlignment(SwingConstants.RIGHT);
		txtresult.setBounds(0, 88, 430, 78);
		txtresult.setBounds(0, 128, 420, 38);
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

