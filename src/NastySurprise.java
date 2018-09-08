import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class NastySurprise implements ActionListener {
	JFrame jframe = new JFrame();
	JPanel jpanel = new JPanel();
	JButton jbutton1 = new JButton("Trick");
	JButton jbutton2 = new JButton("Treat");
	JLabel jlabel = new JLabel();

	NastySurprise() {
		jpanel.add(jbutton1);
		jpanel.add(jbutton2);
		
		jframe.add(jpanel);
		jframe.setVisible(true);
		jframe.pack();
		
	}

	public static void main(String[] args) {
		NastySurprise a = new NastySurprise();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton buttonPressed = (JButton) (e.getSource());
		if (jbutton1 == buttonPressed) {
			jlabel = loadImage("Puppy.jpg");
		} else if (jbutton2 == buttonPressed) {
			jlabel = loadImage("Clown.jpg");
		}
		jpanel.add(jlabel);
		jframe.pack();
	}

	private JLabel loadImage(String fileName) {
		URL imageURL = getClass().getResource(fileName);
		Icon icon = new ImageIcon(imageURL);
		return new JLabel(icon);
	}
}
