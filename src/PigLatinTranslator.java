import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PigLatinTranslator implements ActionListener {
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
		
		button.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Translator Run = new Translator();
		text2.setText(Run.translate(text1.getText()));
	}
	
	
}
