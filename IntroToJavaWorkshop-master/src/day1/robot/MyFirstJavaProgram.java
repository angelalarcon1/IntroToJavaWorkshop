package day1.robot;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	public static void main(String[] args) {
		
		// START HERE
Robot Potato = new Robot();

//Potato.setPenColor(Color.blue);	
//Potato.penDown();	
//Potato.move(100);		
//Potato.turn(90);		
//Potato.setPenColor(Color.blue);	
//Potato.penDown();	
//Potato.move(100);	
//Potato.turn(90);		
//Potato.setPenColor(Color.blue);	
//Potato.penDown();	
//Potato.move(100);
//Potato.turn(90);		
//Potato.setPenColor(Color.blue);	
//Potato.penDown();	
//Potato.move(110);

int sides = 360;
for (int i = 0; i < sides; i++) {
	Potato.setPenColor(Color.blue);	
    Potato.penDown();	
	Potato.move(1);	
	Potato.turn(360 / sides);	}

	
	
	
	
	
	
	
	}
}
