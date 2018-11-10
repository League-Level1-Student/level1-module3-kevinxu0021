import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PigLatinTranslator {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JTextField text1 = new JTextField();
	JTextField text2 = new JTextField();
	JButton button = new JButton("Translate");

	public static void main(String[] args) {
		PigLatinTranslator translator = new PigLatinTranslator();
		translator.run();
		
	}

	public void run() {
		frame.add(panel);
		panel.add(text1);
		text1.setPreferredSize(new Dimension(200, 25));
		panel.add(button);
		panel.add(text2);
		text2.setPreferredSize(new Dimension(200, 25));
		frame.setTitle("Pig Latin Translator");
		frame.setVisible(true);
		frame.setSize(550, 100);
	}
	
	
}
