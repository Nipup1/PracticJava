package Practic_5.box1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Test extends GUI {
    public static void main(String[] args) {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(900, 450, 300, 300);

        button1.addActionListener(new Event());
        button2.addActionListener(new Event());

        ButtonGroup bg = new ButtonGroup();
        bg.add(button1);
        bg.add(button2);

        panel.setBackground(Color.GREEN);
        //panel.setPreferredSize(new Dimension(300,300));
        panel.setLayout(new GridLayout(3,0));
        panel.add(button1);
        panel.add(button2);
        panel.add(labelScore);
        panel.add(labelGoal);

        frame.getContentPane().add(panel);
        //frame.pack();
        frame.setVisible(true);
    }

    public static class Event extends Test implements ActionListener {
        public void actionPerformed (ActionEvent e){

            if (e.getSource() == button1){
                x1 += 1;
                labelScore.setText("Счёт " + x1 + ":" + y1);
            }
            else{
                y1 += 1;
                labelScore.setText("Счёт " + x1 + ":" + y1);
            }
            System.out.println(x1 + "\t" + y1);
        }
    }

}
