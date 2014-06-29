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
	
	public CalcView() {
		initialize();
	}

	private void initialize() {
		
	}

	public JPanel getPnlEingabe() {
		return pnlEingabe;
	}

	public JPanel getPnlZahlen() {
		return pnlZahlen;
	}

	public JPanel getPnlOperatoren() {
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
		if(txtEingabe == null) {
			txtEingabe = new JTextField();
		}
		return txtEingabe;
	}

	public JButton getBtnPlus() {
		return btnPlus;
	}

	public JButton getBtnMinus() {
		return btnMinus;
	}

	public JButton getBtnMal() {
		return btnMal;
	}

	public JButton getBtnGeteilt() {
		return btnGeteilt;
	}

	public JButton getBtnEnter() {
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
