package section3;

import javax.swing.JOptionPane;

public class Greeter {
public static void main(String[] args) {
	JOptionPane.showMessageDialog(null, "Hello Wendy, ");
	String name;
	name = JOptionPane.showInputDialog("What is your name?");
	JOptionPane.showMessageDialog(null, name + " is a name.");
}
}
