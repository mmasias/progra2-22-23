


import org.junit.Test;

import javax.swing.text.html.Option;

import static org.junit.Assert.assertEquals;

public class OptionTest {

	public static void main(String[] args) {
		Option option = new Option(3);

		// Add options
		option.addOption("Option 1");
		option.addOption("Option 2");
		option.addOption("Option 3");

		// Get options
		String[] options = option.getOptions();
		for (String o : options) {
			System.out.println(o);
		}

		// Set and get selected option
		option.setSelectedOption(2);
		int selectedOption = option.getSelectedOption();
		System.out.println("Selected option: " + selectedOption);
	}
}
