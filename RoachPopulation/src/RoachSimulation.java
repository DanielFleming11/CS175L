import java.util.Scanner;
import javax.swing.JOptionPane;
import java.text.DecimalFormat;


public class RoachSimulation {
	
	public static void main(String[] args) {

		/* 			Later on fix this code by using a loop instead of being stuck to 
		 			only 4 cycles. Can you use basic ++ counter for print statements that 
		 			say what cycle its running. Later project, not for now. 
		 */
		
		
		
//Forget why this is here but it works so lets not mess with it  
		DecimalFormat decFormat = new DecimalFormat("0.00");
	    DecimalFormat noDecimalsFormat = new DecimalFormat("0");
	      
//Starting new population
	    String inputWindow = JOptionPane.showInputDialog("Enter your starting roach population:");
	    double startPop = Double.parseDouble(inputWindow);	
		RoachPopulation bugs = new RoachPopulation(startPop);
	    JOptionPane.showMessageDialog(null, "The starting roach population is: " + noDecimalsFormat.format(bugs.getRoaches()));
 
//Breed cycle 1
	    bugs.breed();
	    JOptionPane.showMessageDialog(null, "The roach population after cycle 1 breeding is: " + noDecimalsFormat.format(bugs.getRoaches()));
	    
//Spray cycle 1
		inputWindow = JOptionPane.showInputDialog("Enter spray percentage for cycle 1: ");
	    double sprayPct = Double.parseDouble(inputWindow);
	    bugs.spray(sprayPct);
	    JOptionPane.showMessageDialog(null, "The roach population after cycle 1 " + noDecimalsFormat.format(sprayPct) + "% spraying is: " + noDecimalsFormat.format(bugs.getRoaches()));

//Breed cycle 2
	    bugs.breed();
	    JOptionPane.showMessageDialog(null, "The roach population after cycle 2 breeding is: " + noDecimalsFormat.format(bugs.getRoaches()));

//Spray cycle 2
	    inputWindow = JOptionPane.showInputDialog("Enter spray percentage for cycle 2: ");
	    double sprayPc = Double.parseDouble(inputWindow);
	    bugs.spray(sprayPc);
	    JOptionPane.showMessageDialog(null, "The roach population after cycle 2 " + noDecimalsFormat.format(sprayPc) + "% spraying is: " + noDecimalsFormat.format(bugs.getRoaches()));
	    
//Breed cycle 3
	    bugs.breed();
	    JOptionPane.showMessageDialog(null, "The roach population after cycle 3 breeding is: " + noDecimalsFormat.format(bugs.getRoaches()));
	    
//Spray cycle 3
	    inputWindow = JOptionPane.showInputDialog("Enter spray percentage for cycle 3: ");
	    double sprayP = Double.parseDouble(inputWindow);
	    bugs.spray(sprayP);
	    JOptionPane.showMessageDialog(null, "The roach population after cycle 3 " + noDecimalsFormat.format(sprayP) + "% spraying is: " + noDecimalsFormat.format(bugs.getRoaches()));

//Breed cycle 4
	    bugs.breed();
	    JOptionPane.showMessageDialog(null, "The roach population after cycle 4 breeding is: " + noDecimalsFormat.format(bugs.getRoaches()));
	
//Spray cycle 4
	    inputWindow = JOptionPane.showInputDialog("Enter spray percentage for cycle 4: ");
	    double spray= Double.parseDouble(inputWindow);
	    bugs.spray(sprayPct);
	    JOptionPane.showMessageDialog(null, "The roach population after cycle 4 " + noDecimalsFormat.format(spray) + "% spraying is: " + noDecimalsFormat.format(bugs.getRoaches()));

	    
}
	
}