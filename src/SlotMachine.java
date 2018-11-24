import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SlotMachine {
	BufferedImage cherry;
	BufferedImage orange;
	BufferedImage lime;

	public static void main(String[] args) {
		SlotMachine slotMachine = new SlotMachine();
		slotMachine.RunCherry();
		slotMachine.RunOrange();
		slotMachine.RunLime();
		slotMachine.Setup();
	}

	public void Setup() {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JLabel label1 = new JLabel();
		JLabel label2 = new JLabel();
		JLabel lable3 = new JLabel();
		JButton button = new JButton();
		label1.add(comp)
		
	}
	public void RunCherry() {

		try {
			cherry = ImageIO.read(getClass().getResource("Cherry.jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void RunOrange() {

		try {
			orange = ImageIO.read(getClass().getResource("Orange.jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void RunLime() {

		try {
			lime = ImageIO.read(getClass().getResource("Lime.jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
