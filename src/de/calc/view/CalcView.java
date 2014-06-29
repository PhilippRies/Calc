package de.calc.view;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import de.calc.control.CalcControl;

public class CalcView extends JFrame {
	
	private JTextField txtEingabe;
	private JButton btnPlus;
	private JButton btnMinus;
	private JButton btnMal;
	private JButton btnGeteilt;
	private JButton btnEnter;
	private JPanel pnlEingabe;
	private JPanel pnlZahlen;
	private JPanel pnlOperatoren;
	private String operator;
	private CalcControl c = new CalcControl();
	
	public CalcView(){
		initialise();
	}

	private void initialise() {
		getPnlEingabe().add(getTxtEingabe());
		getPnlZahlen().setLayout(new GridLayout(4, 3));
		for(int i = 1; i <= 9; i++){
			JButton btn = new JButton("" + i);
			final int index = i;
			btn.addActionListener(new ActionListener() {
				
				public void actionPerformed(ActionEvent arg0) {
					getTxtEingabe().setText(getTxtEingabe().getText() + index);
				}
			});
			getPnlZahlen().add(btn);
		}
		
		JButton btnNull = new JButton("" + 0);
		btnNull.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				getTxtEingabe().setText(getTxtEingabe().getText() + 0);
			}
		});
		getPnlZahlen().add(btnNull);
		
		
		getPnlOperatoren().setLayout(new GridLayout(5, 1));
		getPnlOperatoren().add(getBtnPlus());
		getPnlOperatoren().add(getBtnMinus());
		getPnlOperatoren().add(getBtnMal());
		getPnlOperatoren().add(getBtnGeteilt());
		getPnlOperatoren().add(getBtnEnter());
		
		add(getPnlEingabe(), BorderLayout.NORTH);
		add(getPnlZahlen(), BorderLayout.CENTER);
		add(getPnlOperatoren(), BorderLayout.EAST);
		
		pack();
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

	public JPanel getPnlEingabe() {
		if (pnlEingabe == null){
			pnlEingabe = new JPanel();
		}
		return pnlEingabe;
	}

	public JPanel getPnlZahlen() {
		if (pnlZahlen == null){
			pnlZahlen = new JPanel();
		}
		return pnlZahlen;
	}

	public JPanel getPnlOperatoren() {
		if (pnlOperatoren == null){
			pnlOperatoren = new JPanel();
		}
		return pnlOperatoren;
	}

	public void setPnlEingabe(JPanel pnlEingabe) {
		this.pnlEingabe = pnlEingabe;
	}

	public void setPnlZahlen(JPanel pnlZahlen) {
		this.pnlZahlen = pnlZahlen;
	}

	public void setPnlOperatoren(JPanel pnlOperatoren) {
		this.pnlOperatoren = pnlOperatoren;
	}

	public JTextField getTxtEingabe() {
		if(txtEingabe == null){
			txtEingabe = new JTextField(20);
		}
		return txtEingabe;
	}

	public JButton getBtnPlus() {
		if(btnPlus == null){
			btnPlus = new JButton("+");
			btnPlus.addActionListener(new ActionListener() {
				
				public void actionPerformed(ActionEvent arg0) {
					getTxtEingabe().setText(getTxtEingabe().getText() + "+");
					operator = "+";
				}
			});
		}
		return btnPlus;
	}

	public JButton getBtnMinus() {
		if(btnMinus == null){
			btnMinus = new JButton("-");
			btnMinus.addActionListener(new ActionListener() {
				
				public void actionPerformed(ActionEvent e) {
					getTxtEingabe().setText(getTxtEingabe().getText() + "-");
					operator = "-";
				}
			});
		}
		return btnMinus;
	}

	public JButton getBtnMal() {
		if(btnMal == null){
			btnMal = new JButton("x");
			btnMal.addActionListener(new ActionListener() {
				
				public void actionPerformed(ActionEvent e) {
					getTxtEingabe().setText(getTxtEingabe().getText() + "x");
					operator = "x";
				}
			});
		}
		return btnMal;
	}

	public JButton getBtnGeteilt() {
		if(btnGeteilt == null){
			btnGeteilt = new JButton(":");
			btnGeteilt.addActionListener(new ActionListener() {
				
				public void actionPerformed(ActionEvent e) {
					getTxtEingabe().setText(getTxtEingabe().getText() + ":");
					operator = ":";
				}
			});
		}
		return btnGeteilt;
	}

	public JButton getBtnEnter() {
		if(btnEnter == null){
			btnEnter = new JButton("=");
			btnEnter.addActionListener(new ActionListener() {
				
				public void actionPerformed(ActionEvent arg0) {
					String eingabe = getTxtEingabe().getText();
					if (operator == "+")
					{
						String[] a = eingabe.split("\\+");
						double zahl1 = Double.parseDouble(a[0]);
						double zahl2 = Double.parseDouble(a[1]);
						
						getTxtEingabe().setText("" + c.addiere(zahl1, zahl2));
					}
					else if (operator == "-")
					{
						String[] a = eingabe.split("-");
						double zahl1 = Double.parseDouble(a[0]);
						double zahl2 = Double.parseDouble(a[1]);
						
						getTxtEingabe().setText("" + c.subtrahiere(zahl1, zahl2));
					}
					else if (operator == "x")
					{
						String[] a = eingabe.split("x");
						double zahl1 = Double.parseDouble(a[0]);
						double zahl2 = Double.parseDouble(a[1]);
						
						getTxtEingabe().setText("" + c.multipliziere(zahl1, zahl2));
					}
					else
					{
						String[] a = eingabe.split(":");
						double zahl1 = Double.parseDouble(a[0]);
						double zahl2 = Double.parseDouble(a[1]);
						
						getTxtEingabe().setText("" + c.dividiere(zahl1, zahl2));
					}
					
				}
			});
		}
		return btnEnter;
	}

	public void setTxtEingabe(JTextField txtEingabe) {
		this.txtEingabe = txtEingabe;
	}

	public void setBtnPlus(JButton btnPlus) {
		this.btnPlus = btnPlus;
	}

	public void setBtnMinus(JButton btnMinus) {
		this.btnMinus = btnMinus;
	}

	public void setBtnMal(JButton btnMal) {
		this.btnMal = btnMal;
	}

	public void setBtnGeteilt(JButton btnGeteilt) {
		this.btnGeteilt = btnGeteilt;
	}

	public void setBtnEnter(JButton btnEnter) {
		this.btnEnter = btnEnter;
	}

}
