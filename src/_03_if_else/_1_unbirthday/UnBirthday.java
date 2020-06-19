package _03_if_else._1_unbirthday;

import javax.swing.JOptionPane;

public class UnBirthday {
	public static void main(String[] args) {
		String kinderEgg = JOptionPane.showInputDialog("What is your birthday?");
		if (kinderEgg.equals("6/19")) { 
			JOptionPane.showMessageDialog(null, "Happy Birthday!");}
		else {
			JOptionPane.showMessageDialog(null, "Happy UnBirthday!");}

		}
	}

