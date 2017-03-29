package day3;

import javax.swing.JOptionPane;

public class QuizGame {

	public static void main(String[] args) {
		String one = JOptionPane.showInputDialog(null,
				" I am going to tell you five questions if you get one wrong you lose if you get all of them correct you will get One Trillion Dollars! Do you agree with the rules?");

		if (one.equalsIgnoreCase("yes")) {

			JOptionPane.showMessageDialog(null, "Great");

		}

		else {
			JOptionPane.showMessageDialog(null, "Good bye");
		}
		String two = JOptionPane.showInputDialog("First question who made the Great Pyrimad of Giza?");

		if (two.equalsIgnoreCase("egyptians")) {

			JOptionPane.showMessageDialog(null, "Correct");

		}

		else {
			JOptionPane.showMessageDialog(null, "Worng Bye bye");

		}

	
	
	
	
	
	
	
		String three = JOptionPane.showInputDialog("Secoand question how old is Mlk?");

		if (three.equalsIgnoreCase("36")) {

			JOptionPane.showMessageDialog(null, "Correct");

		}

		else {
			JOptionPane.showMessageDialog(null, "Worng Bye bye");

		}
	
		String four = JOptionPane.showInputDialog("Third question how old is Mickey mouse?");

		if (four.equalsIgnoreCase("89")) {

			JOptionPane.showMessageDialog(null, "Correct");

		}

		else {
			JOptionPane.showMessageDialog(null, "Worng Bye bye");

		}
		String five = JOptionPane.showInputDialog("Fourth question how did the Civil War end?");

		if (five.equalsIgnoreCase("North won south")) {

			JOptionPane.showMessageDialog(null, "Correct");

		}

		else {
			JOptionPane.showMessageDialog(null, "Worng Bye bye");

		}
		
		String ten = JOptionPane.showInputDialog("Last question how old am I?");

		if (ten.equalsIgnoreCase("0")) {

			JOptionPane.showMessageDialog(null, "You win Ya");

		}

		else {
			JOptionPane.showMessageDialog(null, "So close Bye bye");

		}
	}
}
