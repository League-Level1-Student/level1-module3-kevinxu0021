import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class SlotMachine implements ActionListener {
	BufferedImage cherry;
	BufferedImage orange;
	BufferedImage lime;
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel label1 = new JLabel();
	JLabel label2 = new JLabel();
	JLabel label3 = new JLabel();
	Random rand = new Random();
	String f;
	JButton button = new JButton("SPIN");

	public static void main(String[] args) {
		SlotMachine slotMachine = new SlotMachine();

		slotMachine.Setup();
	}

	public void Setup() {

		try {
			cherry = ImageIO.read(getClass().getResource("Cherry.jpg"));
			orange = ImageIO.read(getClass().getResource("Orange.jpg"));
			lime = ImageIO.read(getClass().getResource("Lime.jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		label1.setIcon(new ImageIcon(cherry));
		label2.setIcon(new ImageIcon(orange));
		label3.setIcon(new ImageIcon(lime));
		panel.add(label1);
		panel.add(label2);
		panel.add(label3);
		panel.add(button);
		frame.add(panel);
		frame.setVisible(true);
		frame.setSize(1850, 700);
		button.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton buttonPressed = (JButton) e.getSource();
		if (buttonPressed == button) {
			int rand1 = rand.nextInt(3);
			int rand2 = rand.nextInt(3);
			int rand3 = rand.nextInt(3);
			if (rand1 == 0) {
				label1.setIcon(new ImageIcon(cherry));
			} else if (rand1 == 1) {
				label1.setIcon(new ImageIcon(orange));
			} else {
				label1.setIcon(new ImageIcon(lime));
			}
			if (rand2 == 0) {
				label2.setIcon(new ImageIcon(cherry));
			} else if (rand2 == 1) {
				label2.setIcon(new ImageIcon(orange));
			} else {
				label2.setIcon(new ImageIcon(lime));
			}
			if (rand3 == 0) {
				label3.setIcon(new ImageIcon(cherry));
			} else if (rand3 == 1) {
				label3.setIcon(new ImageIcon(orange));
			} else {
				label3.setIcon(new ImageIcon(lime));
			}
			if (rand1 == rand2 && rand2 == rand3) {
				JOptionPane.showMessageDialog(null, "YOU WIN!");
			}

		}

	}

}
