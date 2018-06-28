package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		
		// START HERE
		Robot robName = new Robot();
		
		robName.penDown();
		robName.setSpeed(100);
		robName.move(100);
		robName.turn(90);
		
		//This is a for loop
		// it will repeat code 5 times
		for(int i = 0; i < 5; i++) {
			robName.move(100);
			robName.turn(360/5);
		}
		
	}
}
