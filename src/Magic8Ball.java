
// Copyright Wintriss Technical Schools 2013
import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball {

	// 1. Make a main method that includes all the steps below….
	public static void main(String[] args) {

		// 2. Make a variable that will hold a random number and put a random number
		// into this variable using "new Random().nextInt(4)"
		int RandomNumber = new Random().nextInt(4);

		// 3. Print out this variable
		System.out.println(RandomNumber);

		// 4. Get the user to enter a question for the 8 ball
		String Question = JOptionPane.showInputDialog("Enter a question for the magic 8 ball.(A Yes or No question)");

		// 5. If the random number is 0
		if (RandomNumber == 0) {

			// -- tell the user "Yes"
			JOptionPane.showMessageDialog(null, "The answer for this question is yes.");

			// 6. If the random number is 1
		} else if (RandomNumber == 1) {

			// -- tell the user "No"
			JOptionPane.showMessageDialog(null, "The answer for this question is no.");

			// 7. If the random number is 2
		} else if (RandomNumber == 2) {

			// -- tell the user "Maybe you should ask Google?"
			JOptionPane.showMessageDialog(null, "Maybe you should ask Google?");

			// 8. If the random number is 3
		} else {

			// -- write your own answer
			JOptionPane.showMessageDialog(null, "Think on your own");
		}
	}
}
