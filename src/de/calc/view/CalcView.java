package de.calc.view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

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
	
	public CalcView(){
		initialise();
	}

	private void initialise() {
		
		
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
			txtEingabe = new JTextField();
		}
		return txtEingabe;
	}

	public JButton getBtnPlus() {
		if(btnPlus == null){
			btnPlus = new JButton("+");
		}
		return btnPlus;
	}

	public JButton getBtnMinus() {
		if(btnMinus == null){
			btnMinus = new JButton("-");
		}
		return btnMinus;
	}

	public JButton getBtnMal() {
		if(btnMal == null){
			btnMal = new JButton("x");
		}
		return btnMal;
	}

	public JButton getBtnGeteilt() {
		if(btnGeteilt == null){
			btnGeteilt = new JButton(":");
		}
		return btnGeteilt;
	}

	public JButton getBtnEnter() {
		if(btnEnter == null){
			btnEnter = new JButton("=");
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
