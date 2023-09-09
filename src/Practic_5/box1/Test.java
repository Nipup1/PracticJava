package Practic_5.box1;

import javax.swing.*;
import javax.swing.plaf.basic.DefaultMenuLayout;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Test extends GUI {
    public static void main(String[] args) {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(900, 450, 300, 300);

        button1.addActionListener(new Event1());
        button2.addActionListener(new Event1());
        button3.addActionListener(new Event1());
        button3.setBackground(Color.red);




        panel.setPreferredSize(new Dimension(300,300));
        grid.add(button1);
        grid.add(button2);
        panel.add(grid);
        panel.add(labelScore);
        panel.add(labelGoal);
        panel.add(labelRez);
        panel.add(button3);

        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);
    }

    public static class Event1 extends Test implements ActionListener {
        public void actionPerformed (ActionEvent e){

            if (e.getSource() == button1){
                x1 += 1;
                labelScore.setText("Счёт " + x1 + ":" + y1);
                labelGoal.setText("Последний забивший: Милан");
            }
            else if (e.getSource() == button2){
                y1 += 1;
                labelScore.setText("Счёт " + x1 + ":" + y1);
                labelGoal.setText("Последний забивший: Мадрид");
            }
            else{
                if(x1 > y1)
                    labelRez.setText("Победитель: Милан");

                else if(x1 < y1)
                    labelRez.setText("Победитель: Мадрид");

                else
                    labelRez.setText("Победитель: Ничья");
            }
        }
    }

}
