package day1.robot;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class FourSquare {
	
	// 2. Create a new Robot
	Robot Mini = new Robot();

	void go() {
		// 4. Make the robot move as fast as possible
Mini.setSpeed(10);
		// 5. Set the pen width to 5
Mini.setPenWidth(5);
		// 6. Do steps #7 to #8 four times...
for(int i = 0;i < 4; i++){
			// 7. Set the pen color to random
	Mini.setRandomPenColor();
			// 1. Call the drawSquare() method
		drawSquare();
			// 8. Turn the robot 90 degrees to the right
Mini.turn(90);

}
	}

	/* 3. Fill in the code to draw a square inside the method below. */
	void drawSquare() {
		JOptionPane.showMessageDialog(null, "yay! you called the drawSquare() method!");
		int sides = 4;
		for (int i = 0; i < sides; i++) {
			Mini.setRandomPenColor();	
		    Mini.penDown();	
			Mini.move(100);	
			Mini.turn(360 / sides);	}
		
		
	}

	public static void main(String[] args) {
		new FourSquare().go();
	}

}
