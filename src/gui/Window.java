package gui;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JTextPane;

import net.miginfocom.swing.MigLayout;

/**
 * 
 * @author avgustisd
 * 
 */

public class Window {

	public JFrame window;
	private JTextField textField;
	private JTextPane textPane;
	private JButton buttonClear;
	private JButton buttonGenerate;

	/**
	 * Create the application.
	 */
	public Window() {
		initialize();
		window.setVisible(true);
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
		textField.setToolTipText("Enter regex here");
		window.getContentPane().add(textField, "cell 0 0,growx");
		textField.setColumns(10);

		buttonGenerate = new JButton("Generate");

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

    public JTextField getTextField() {
        return textField;
    }

    public void setTextField(JTextField textField) {
        this.textField = textField;
    }

    public JButton getButtonClear() {
        return buttonClear;
    }

    public void setButtonClear(JButton buttonClear) {
        this.buttonClear = buttonClear;
    }

    public JTextPane getTextPane() {
        return textPane;
    }

    public void setTextPane(JTextPane textPane) {
        this.textPane = textPane;
    }

    public JButton getButtonGenerate() {
        return buttonGenerate;
    }

    public void setButtonGenerate(JButton buttonGenerate) {
        this.buttonGenerate = buttonGenerate;
    }



}
