package Calculator;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalculatorRunner implements ActionListener {
	Calculator calculator = new Calculator();
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button1 = new JButton("Add");
	JButton button2 = new JButton("Subtract");
	JButton button3 = new JButton("Multiply");
	JButton button4 = new JButton("Divide");
	JTextField input1 = new JTextField(15);
	JTextField input2 = new JTextField(15);
	JLabel label = new JLabel();
	Font font = new Font("Ariel", Font.BOLD, 50);

	public static void main(String[] args) {
		CalculatorRunner Calculator = new CalculatorRunner();
		Calculator.run();

	}

	public void run() {
		frame.add(panel);
		panel.add(input1);
		panel.add(input2);
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
		label.setPreferredSize(new Dimension(76, 50));
		panel.add(label);
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);
		frame.setVisible(true);
		frame.setSize(450, 250);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		label.setFont(font);
		// TODO Auto-generated method stub
		int number1 = Integer.parseInt(input1.getText());
		int number2 = Integer.parseInt(input2.getText());
		JButton buttonPressed = (JButton) e.getSource();
		if (buttonPressed == button1) {
			label.setText(calculator.add(number1, number2) + "");
		} else if (buttonPressed == button2) {
			label.setText(calculator.subtract(number1, number2) + "");
		} else if (buttonPressed == button3) {
			label.setText(calculator.multiply(number1, number2) + "");
		} else {
			label.setText(calculator.divide(number1, number2) + "");
		}

	}

}
