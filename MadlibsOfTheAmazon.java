package day3;

import javax.swing.JOptionPane;

public class MadlibsOfTheAmazon {
	public static void main(String[] args) {

		// Put this sentence in a pop up:
 JOptionPane.showMessageDialog(null,"If you find yourself having to cross a piranha-infested river, here's how to do it");

		// If you find yourself having to cross a piranha-infested river, here's how to do it...

		// Get the user to enter an adjective
 String one = JOptionPane.showInputDialog("Enter an adjective");

		// Get the user to enter a type of liquid
 String b = JOptionPane.showInputDialog("enter a type of liquid");

		// Get the user to enter a body part
 String a = JOptionPane.showInputDialog("Enter a body part");

		// Get the user to enter a verb
 String c = JOptionPane.showInputDialog("Enter a Verb");

		// Get the user to enter a place
 String d = JOptionPane.showInputDialog("Enter a place");

		// Fit the user's words into this sentence, and save it in a String:
		
 String story = JOptionPane.showInputDialog(" Piranhas are more " +one+ "during the day, so cross the river at \n night. Piranhas are attracted to fresh " +b+
		 "and will most likely take a bite out of your" +a+ "if you . \n Whatever you do, if you have an open wound, try to find another way to get"+
		"back to the  " +d+ "Good luck!");
		
		// Make a pop-up for the final story. You can use \n to go to the next line.
		

	}
}

