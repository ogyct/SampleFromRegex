package generator;

import nl.flotsam.xeger.Xeger;

/**
 * Program to generate sample string from regular expression
 * 
 * @author avgustisd
 * 
 */

public class Generator {

	public String generate(String regex) {
		try {
			Xeger x = new Xeger(regex);
			return x.generate();
		} catch (Exception e) {
			e.printStackTrace();

		}
		return "Error";

	}

}
