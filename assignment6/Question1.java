package assignment6;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Question1 extends JFrame {

	/**
	 * @param args
	 */

	private static JFrame frame = new JFrame();
	private static JButton countLettersBtn = new JButton("Count Letters");
	private static JButton reverseLettersBtn = new JButton("Reverse Letters");
	private static JButton removeDuplicateBtn = new JButton("Remove Duplicates");
	private static JTextField outputTextField = new JTextField("");
	private static JTextField inputTextField = new JTextField("");
	private static JLabel inputLabel = new JLabel("Input");
	private static JLabel outputLabel = new JLabel("Output");

	public static void main(String[] args) {
		 initialize();
	}

	static void initialize() {
		frame.setTitle("String Utility");
		frame.setLayout(null);
		frame.setSize(400, 200);

		inputComponentInitialize();
		labelComponentInitialize();
		buttonComponentInitialize();

		frame.setVisible(true);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	static void buttonComponentInitialize() {
		countLettersBtn.setBounds(10, 20, 150, 30);
		frame.add(countLettersBtn);

		reverseLettersBtn.setBounds(10, 55, 150, 30);
		frame.add(reverseLettersBtn);

		removeDuplicateBtn.setBounds(10, 90, 150, 30);
		frame.add(removeDuplicateBtn);

		// Count Button on button click
		countLettersBtn.addActionListener(e -> {
			JButton source = (JButton) e.getSource();
			if (!inputTextField.getText().toString().isEmpty()) {
				outputTextField.setText(String.valueOf(inputTextField.getText().toString().length()));
			} else {
				JOptionPane.showMessageDialog(source, "You must enter a value");
			}

		});

		// Reverse button on click
		reverseLettersBtn.addActionListener(e -> {
			JButton source = (JButton) e.getSource();
			if (!inputTextField.getText().toString().isEmpty()) {
				outputTextField.setText(reverse(inputTextField.getText().toString(), 0));
			} else {
				JOptionPane.showMessageDialog(source, "You must enter a value");
			}
		});

		// remove duplicate button on click
		removeDuplicateBtn.addActionListener(e -> {
			JButton source = (JButton) e.getSource();
			if (!inputTextField.getText().toString().isEmpty()) {
				outputTextField.setText(removeDuplicate(inputTextField.getText().toString()));
			} else {
				JOptionPane.showMessageDialog(source, "You must enter a value");
			}
		});
	}

	static void inputComponentInitialize() {
		inputTextField.setBounds(180, 50, 180, 25);
		frame.add(inputTextField);

		outputTextField.setBounds(180, 95, 180, 25);
		frame.add(outputTextField);
	}

	static void labelComponentInitialize() {
		inputLabel.setBounds(180, 27, 180, 25);
		frame.add(inputLabel);

		outputLabel.setBounds(180, 75, 180, 25);
		frame.add(outputLabel);
	}

	static String reverse(String value, int count) {
		if (value.length() == count) {
			return value;
		}
		count++;
		return value.charAt(value.length() - 1) + reverse(value.substring(0, value.length() - 1), count);
	}

	/**
	 * Method removes duplicates from string
	 * @param value
	 **/
	static String removeDuplicate(String value) {
		char[] values = value.toCharArray();
		char[] tempArr = new char[values.length];
		tempArr[0] = values[0];
		for (int i = 0; i < values.length; i++) {
			for (int j = i + 1; j < values.length; j++) {
				if (values[i] != values[j]) {
					if (!inspectTempArr(tempArr, values[j])) {
						tempArr[j] = values[j];
					}
				} else {
					if (!inspectTempArr(tempArr, values[j])) {
						tempArr[j] = values[j];
					}
				}
			}
		}
		String filteredString = "";
		for (Character k : tempArr) {
			if (k > 0) {
				filteredString += k;
			}
		}

		return filteredString;
	}

	/**
	 *  Method Checks array if {@keyValue} exists in array
	 *  @param char[] temp
	 *  @param char keyValue
	 *   */
	static Boolean inspectTempArr(char[] temp, char keyValue) {
		for (char c : temp) {
			if (c == keyValue)
				return true;
		}
		return false;
	}

}
