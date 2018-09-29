import java.applet.AudioClip;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.swing.BoxLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/* Check out the Jeopardy Handout to see what the end result should look like: http://bit.ly/1bvnvd4 */

public class Jeopardy implements ActionListener {
	private JButton firstButton;
	private JButton secondButton;
	private JButton thirdButton, fourthButton;
	private JButton fifthButton;
	private JButton sixthButton;
	private JPanel quizPanel;
	private int score = 0;
	private JLabel scoreBox = new JLabel("0");
	private int buttonCount = 0;
	private AudioClip sound;

	public static void main(String[] args) {
		new Jeopardy().start();
	}

	private void start() {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		quizPanel = new JPanel();
		frame.setLayout(new BorderLayout());

		// 1. Make the frame show up
		frame.setVisible(true);
		// 2. Give your frame a title
		frame.setTitle("Jeopardy");
		// 3. Create a JPanel variable to hold the header using the createHeader method
		JPanel panel = createHeader("Technology");
		// 4. Add the header component to the quizPanel
		quizPanel.add(panel);
		// 5. Add the quizPanel to the frame
		frame.add(quizPanel);
		// 6. Use the createButton method to set the value of firstButton
		firstButton = createButton("$100");
		thirdButton = createButton("$400");
		fifthButton = createButton("$800");
		// 7. Add the firstButton to the quizPanel

		// 8. Write the code to complete the createButton() method below. Check that
		// your
		// game looks like Figure 1 in the Jeopardy Handout - http://bit.ly/1bvnvd4.

		// 9. Use the secondButton variable to hold a button using the createButton
		// method
		secondButton = createButton("$200");
		fourthButton = createButton("$600");
		sixthButton = createButton("$1000");
		// 10. Add the secondButton to the quizPanel
		quizPanel.add(firstButton);
		quizPanel.add(secondButton);
		quizPanel.add(thirdButton);
		quizPanel.add(fourthButton);
		quizPanel.add(fifthButton);
		quizPanel.add(sixthButton);
		// 11. Add action listeners to the buttons (2 lines of code)
		firstButton.addActionListener(this);
		secondButton.addActionListener(this);
		thirdButton.addActionListener(this);
		fourthButton.addActionListener(this);
		fifthButton.addActionListener(this);
		sixthButton.addActionListener(this);
		// 12. Write the code to complete the actionPerformed() method below

		// 13. Add buttons so that you have $200, $400, $600, $800 and $1000 questions

		/*
		 * [optional] Use the showImage or playSound methods when the user answers a
		 * question
		 */

		frame.pack();
		quizPanel.setLayout(new GridLayout(buttonCount + 1, 3));
		frame.add(makeScorePanel(), BorderLayout.NORTH);
		frame.setSize(Toolkit.getDefaultToolkit().getScreenSize().height,
				Toolkit.getDefaultToolkit().getScreenSize().width);
	}

	private JButton createButton(String dollarAmount) {

		// Create a new JButton
		JButton button = new JButton();
		// Set the text of the button to the dollarAmount
		button.setText(dollarAmount);
		// Increment the buttonCount (this should make the layout vertical)
		buttonCount++;
		// Return your new button instead of the temporary button
		return new JButton(dollarAmount);
	}

	public void actionPerformed(ActionEvent e) {

		// Remove this temporary message after testing:

		JButton buttonPressed = (JButton) e.getSource();
		// If the buttonPressed was the firstButton
		if (buttonPressed == firstButton) {
			// Call the askQuestion() method
			askQuestion("What are the two main companies that make processors?", "Intel and AMD", 100);
			// Complete the code in the askQuestion() method. When you play the game, the
			// score should change.
			firstButton.setText(null);
		} else if (buttonPressed == secondButton) {
			// If the buttonPressed was the secondButton

			// Call the askQuestion() method with a harder question
			askQuestion("What is generation of 7980XE", "6th generation", 200);
			secondButton.setText(null);
		} else if (buttonPressed == thirdButton) {
			askQuestion("How many cores does the 7980XE have?", "18cores", 400);
			thirdButton.setText(null);
		} else if (buttonPressed == fourthButton) {
			askQuestion("How many thread does 79980XE have?", "16thread", 600);
			fourthButton.setText(null);
		} else if (buttonPressed == fifthButton) {
			askQuestion("What is the base clock of 7980XE", "2.6GHz", 800);
			fifthButton.setText(null);
		} else {
			askQuestion("What do you type for syso in Java?", "System.out.println();", 1000);
			sixthButton.setText(null);
		}
		// Clear the text on the button that was pressed (set the button text to
		// nothing)

	}

	private void askQuestion(String question, String correctAnswer, int prizeMoney) {

		// Use the playJeopardyTheme() method to play music while the user thinks of an
		// answer
		playJeopardyTheme();
		// Remove this temporary message and replace it with a pop-up that asks the user
		// the question
		String userInput = JOptionPane.showInputDialog(null, question);
		// Stop the theme music when they have entered their response. Hint: use the
		// sound variable
		sound.stop();
		// If the answer is correct
		if (userInput.equals(correctAnswer)) {
			// Increase the score by the prizeMoney
			score += prizeMoney;
			// Pop up a message to tell the user they were correct
			JOptionPane.showMessageDialog(null, "You were correct");

		} else {
			// Otherwise

			// Decrement the score by the prizeMoney
			score -= prizeMoney;
			// Pop up a message to tell the user they were wrong and give them the correct
			// answer
			JOptionPane.showMessageDialog(null, "You were wrong. The correct answer is " + correctAnswer + ". ");

		}
		// Call the updateScore() method
		updateScore();
	}

	public void playJeopardyTheme() {
		try {
			sound = JApplet.newAudioClip(getClass().getResource("jeopardy.wav"));
			sound.play();
			Thread.sleep(3400);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	private Component makeScorePanel() {
		JPanel panel = new JPanel();
		panel.add(new JLabel("score:"));
		panel.add(scoreBox);
		panel.setBackground(Color.CYAN);
		return panel;
	}

	private void updateScore() {
		scoreBox.setText("" + score);
	}

	private JPanel createHeader(String topicName) {
		JPanel panelj = new JPanel();
		panelj.setLayout(new BoxLayout(panelj, BoxLayout.PAGE_AXIS));
		JLabel l1 = new JLabel(topicName);
		l1.setAlignmentX(Component.CENTER_ALIGNMENT);
		panelj.add(l1);
		return panelj;
	}

	void showCorrectImage() {
		showImage("correct.jpg");
	}

	void showIncorrectImage() {
		showImage("incorrect.jpg");
	}

	private void showImage(String fileName) {
		JFrame frame = new JFrame();
		URL imageURL = getClass().getResource(fileName);
		Icon icon = new ImageIcon(imageURL);
		JLabel image = new JLabel(icon);
		frame.add(image);
		frame.setVisible(true);
		frame.pack();
	}
}
