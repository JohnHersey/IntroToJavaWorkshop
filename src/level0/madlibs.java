package level0;

import javax.swing.JOptionPane;

public class madlibs {
	public static void main(String[] args) {

		// Put this sentence in a pop up:
		// If you find yourself having to cross a piranha-infested river, here's how to do it...
	  JOptionPane.showMessageDialog(null, "you find yourself dead on the ground how will you get out of this");
		// Get the user to enter an adjective
	String pyro= JOptionPane.showInputDialog("GIVE ME A AGITIVE NOW");
		// Get the user to enter a type of liquid
		String leafy= JOptionPane.showInputDialog("IF YOU DONT GIVE ME A LIQUID RIGHT NOW IMA BLOW THIS PLACE TO THE GROUND UNDERSTAND");
		// Get the user to enter a body part
		String keemstar= JOptionPane.showInputDialog("WHAT IS THE NAME OF YOUR HAND");
		// Get the user to enter a verb
		String scarce= JOptionPane.showInputDialog("what is a verb do you know (i dont)");
	
	
		// Fit the user's words into this sentence, and save it in a String:
		// Piranhas are more [adjective] during the day, so cross the river at
		// night. Piranhas are attracted to fresh [type of liquid] and will most
		// likely take a bite out of your [body part] if you [verb]. Whatever
		// you do, if you have an open wound, your going to die lol
		// b
		
		// Make a pop-up for the final story. You can use \n to go to the next line.
		
		JOptionPane.showMessageDialog(null, "Piranhas are more " + pyro+   " during the day, so cross the river at"+
		"night. Piranhas are attracted to fresh [type of liquid] and will most"+
		 "likely take a bite out of your " + keemstar+  " if you " + leafy+   ". Whatever"+
	     "you do, if you have an open wound, your going to die lol");
	
	}
}

