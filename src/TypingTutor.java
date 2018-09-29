import java.util.Random;

import javax.swing.JFrame;

public class TypingTutor {
	JFrame frame = new JFrame();
	char currentLetter;

	public static void main(String[] args) {
		TypingTutor typingtutor = new TypingTutor();
		typingtutor.setup();
	}

	public void setup() {
		frame.setVisible(true);
		frame.setTitle("Type or Die");
		frame.setSize(300, 100);
		currentLetter = generateRandomLetter();
	}

	char generateRandomLetter() {
		Random r = new Random();
		return (char) (r.nextInt(26) + 'a');
	}
}
