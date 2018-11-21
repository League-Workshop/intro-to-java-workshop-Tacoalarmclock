package section2;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

import com.sun.org.apache.xpath.internal.operations.Variable;

/* Teacher’s note: before beginning, draw a pentagon and have students work out the angle that the robot will have to turn (360/5) */

public class PentagonCrazy {

	private void makePrettyThings() {
		// 1. Create a new Robot
Robot bill = new Robot ();
		// 3. Put the robot's pen down
bill.penDown();
bill.setX(950);
bill.setY(500);
		// 8. Make the robot go at maximum speed (100)
bill.setSpeed(100);
		// 9. Set the pen to a color that you like for the shape
bill.setPenColor(0, 0, 0);
		// 4. Make a variable for the number of sides you want (can’t test this one)
int numSides = 5;
// 5. Make a second variable for the angle you want the robot to turn. Hint: you can divide in Java using "/". Can’t test until step 6
int turnAngle = 360 / 5;
		// 7. Use a for loop to repeat steps #2 to #11, 200 times. When this is done you should see a pentagon
for (int i = 0; i < 20000; i++) {
	
			// 2. Move the robot 200 pixels
	bill.move(i);
			// 10. Change the previous line of code to make the robot move "i" pixels instead of 200 
	
			// 6. Turn the robot the amount in your angle variable
	bill.turn(turnAngle);
			// 11. Turn the robot one more degree
	bill.turn(1);
}
	}

	// Variations:
	// *12. make the pattern really huge
	// *13. randomize the color of the pattern 
	// *14. experiment with different shapes

	public static void main(String[] args) {
		new PentagonCrazy().makePrettyThings();
	}
}
