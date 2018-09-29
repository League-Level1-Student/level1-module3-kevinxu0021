
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChuckleClicker implements ActionListener {
	JButton button1 = new JButton("Joke");
	JButton button2 = new JButton("Punchline");

	public static void main(String[] args) {
		ChuckleClicker chuckleClicker = new ChuckleClicker();
		chuckleClicker.makeButtons();
	}

	public void makeButtons() {
		JOptionPane.showMessageDialog(null, "Make Buttons");
		JFrame frame = new JFrame();
		frame.setVisible(true);
		JPanel panel = new JPanel();
		frame.add(panel);
		panel.add(button1);
		panel.add(button2);
		frame.pack();
		button1.addActionListener(this);
		button2.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton buttonPressed = (JButton) e.getSource();
		if (buttonPressed == button1 || buttonPressed == button2) {
			JOptionPane.showMessageDialog(null, "Hi");
		}
		if (e.getSource() == button1) {
			JOptionPane.showMessageDialog(null, "Joke");
		} else {
			JOptionPane.showMessageDialog(null, "Punchline");
		}
	}
}
