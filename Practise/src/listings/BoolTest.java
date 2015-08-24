package listings;

import java.util.logging.Logger;


public class BoolTest {
	/** class to understand boolean */
	public static void main(String[] args) {

		boolean b = false;
		 Logger log = Logger.getLogger(BoolTest.class.getName());
		log.fine("b is " + b);
		b = true;
		log.fine("b is " + b);

		// a boolean value can control the if statement
		if (b) {
			log.fine("This is executed.");
		}

		b = false;
		if (b) {
			log.fine("This is not executed.");
		}

		// outcome of a relational operator is a boolean value
		log.fine("10 > 9 is " + (10 > 9));
	}

}
