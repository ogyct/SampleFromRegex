package start;

import generator.Generator;
import gui.Window;

import java.awt.EventQueue;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import controller.Controller;

/**
 * Here the app starts
 * 
 * Sample from regex is a simple app, which allows to generate sample string
 * from a regular expression.
 * 
 * @author avgustisd
 * 
 */

public class Start {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		// Set System L&F
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException | InstantiationException
				| IllegalAccessException | UnsupportedLookAndFeelException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Window window = new Window();
					Generator gen = new Generator();
					Controller contr = new Controller(gen, window);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
