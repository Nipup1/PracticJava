package Practic_5.box1;

import javax.swing.*;
import java.awt.*;

public class GUI {
    protected static JButton button1 = new JButton("Милан");
    protected static JButton button2 = new JButton("Мадрид");
    protected static JButton button3 = new JButton("Результат");
    protected static JFrame frame = new JFrame("Матч Милан vs Мадрид");
    protected static JPanel grid = new JPanel(new GridLayout(1, 2, 5,0));
    protected static JPanel panel = new JPanel(new GridLayout(5,1, 0,5));
    protected static JLabel labelScore = new JLabel("Счёт 0:0", JLabel.LEFT);
    protected static JLabel labelGoal = new JLabel("Последний забивший: N/A", JLabel.LEFT);
    protected static JLabel labelRez = new JLabel("Победитель: N/A", JLabel.LEFT);

    protected static int x1;
    protected static int y1;
}
