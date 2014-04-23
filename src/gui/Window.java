package gui;

import generator.Generator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.BorderLayout;

import net.miginfocom.swing.MigLayout;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JTextPane;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Window {

	private JFrame window;
	private JTextField textField;
	private JTextPane textPane;
	private Generator g = new Generator();
	private JButton buttonClear;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			// Set System L&F
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (UnsupportedLookAndFeelException e) {
			// handle exception
		} catch (ClassNotFoundException e) {
			// handle exception
		} catch (InstantiationException e) {
			// handle exception
		} catch (IllegalAccessException e) {
			// handle exception
		}

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Window window = new Window();
					window.window.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Window() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		window = new JFrame();
		window.setTitle("Sample from regex");
		window.setBounds(100, 100, 450, 300);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.getContentPane().setLayout(
				new MigLayout("", "[grow]", "[][][grow]"));

		textField = new JTextField();
		textField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				process();
			}
		});
		textField.setToolTipText("Enter regex here");
		window.getContentPane().add(textField, "cell 0 0,growx");
		textField.setColumns(10);

		JButton buttonGenerate = new JButton("Generate");
		buttonGenerate.addActionListener(new ActionListener() {
			/**
			 * Generates sample after button click
			 */
			public void actionPerformed(ActionEvent e) {
				process();
			}
		});
		window.getContentPane().add(buttonGenerate, "flowx,cell 0 1");

		textPane = new JTextPane();
		window.getContentPane().add(textPane, "cell 0 2,grow");
		
		buttonClear = new JButton("Clear");
		buttonClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
			}
		});
		window.getContentPane().add(buttonClear, "cell 0 1");
	}
	
	private void process(){
		String result = g.generate(textField.getText());
		textPane.setText(result);
	}

}
