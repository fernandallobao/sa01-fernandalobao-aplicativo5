package br.com.senaitagua.sa01.app5;

import javax.swing.JOptionPane;

import br.com.senaitagua.sa01.bo.MediaFatBO;
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String resp1 = JOptionPane.showInputDialog("Informe o faturamento do primeiro mes:");
		String resp2 = JOptionPane.showInputDialog("Informe o faturamento do segundo mes:");
		String resp3 = JOptionPane.showInputDialog("Informe o faturamento do terceiro mes:");
		
		double primMes = Double.parseDouble(resp1);
		double segMes = Double.parseDouble(resp2);
		double terMes = Double.parseDouble(resp3);
		
		MediaFatBO mbo = new MediaFatBO();
		JOptionPane.showMessageDialog(null, "A média de faturamento trimestral é de: " + mbo.medFat(primMes, segMes, terMes));
		
	}

}
