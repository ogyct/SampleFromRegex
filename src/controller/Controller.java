package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import generator.Generator;
import gui.Window;

public class Controller {


    private ActionListener al;

    public Controller(Generator gen, Window gui) {
        
        al = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String result = gen.generate(gui.getTextField().getText());
                gui.getTextPane().setText(result);

            }
        };

        gui.getButtonGenerate().addActionListener(al);
        
        gui.getTextField().addActionListener(al);

    }

    public void process() {

    }

}
