package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		
		// START HERE
Robot tacoTheHut = new Robot ();
tacoTheHut.setPenColor(255, 0, 0);
tacoTheHut.penDown();
tacoTheHut.setSpeed(200);
for (int i = 0; i < 360; i ++) {
		tacoTheHut.move(2);
		tacoTheHut.turn(360/360);
}
	}
}
