import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class WhackAMole implements ActionListener {
	static Random a = new Random();
	static int random = a.nextInt(24);
	JFrame frame;
	int right = 0;
	int total = 0;
	Date timeAtStart = new Date();

	public static void main(String[] args) {
		WhackAMole whackamole = new WhackAMole();
		whackamole.drawButtons(random);
	}

	public void drawButtons(int random) {
		frame = new JFrame();
		JPanel panel = new JPanel();
		frame.add(panel);
		for (int i = 0; i < 24; i++) {
			JButton button = new JButton();
			panel.add(button);
			button.addActionListener(this);
			if (i == random) {
				button.setText("mole!");
			}
		}
		frame.setSize(250, 300);
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton buttonPressed = (JButton) e.getSource();
		String text = buttonPressed.getText();
		if (text.equals("mole!")) {
			right++;
			total++;
			playSound("Pong.wav");
		} else {
			total++;
			if (total - right == 5) {
				speak("You Lost!");
				endGame(timeAtStart, right);
			} else {
				speak("You missed!");
			}
		}
		if (total < 10) {
			frame.dispose();
			drawButtons(a.nextInt(24));
		} else {
			endGame(timeAtStart, right);
		}
	}

	void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void endGame(Date timeAtStart, int molesWhacked) {
		Date timeAtEnd = new Date();
		JOptionPane.showMessageDialog(null, "Your whack rate is "
				+ molesWhacked / ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00) + " moles per second.");
	}

	private void playSound(String fileName) {
		AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
		sound.play();
	}
}
