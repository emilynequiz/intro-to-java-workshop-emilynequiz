package section2;

import org.jointheleague.graphical.robot.Robot;

public class TriangleShell {

	// 1. Create a new Robot
Robot crusty = new Robot();


	void go() {
		 // 3. delete this line (used only for testing)
		
		// 6. Make the robot go as fast as possible
crusty.setSpeed(100);
		// 4. make a variable to hold the length of the triangle and set it to 50
int length = 50 ;
		// 7. Use a for loop to repeat steps #9 to #10, 60 time
for (int i = 0; i <60; i++) {
	

			// 9. Change the color of the pen to a random color
	crusty.setRandomPenColor();
			// 8. Increase the length variable by 10
	length = length + 10;
			// 5. call your drawTriangle() method using your length variable
	drawTriangle(length);
			// 10. Turn the robot 6 degrees to the right
	crusty.turn(6);
	
}
	}

	
	private void drawTriangle(int length) {
		/* 2. fill in the method below to draw a triangle. Use the length variable when you call move(). */
		crusty.penDown();
		crusty.setSpeed(100);
		for(int i = 0; i < 3; i++) {
			crusty.move(length);
			crusty.turn(360/3);
		}
		
	}

	
	public static void main(String[] args) {
		new TriangleShell().go();
	}
}
