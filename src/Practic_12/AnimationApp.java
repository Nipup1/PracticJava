package Practic_12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AnimationApp extends JFrame {
    private ImageIcon[] frames;
    private JLabel animationLabel;
    private int currentFrame = 0;

    public AnimationApp() {
        setTitle("AnimationApp");
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        frames = new ImageIcon[4];
        for (int i = 0; i < 4; i++) {
            frames[i] = new ImageIcon("D:\\idea_Projects\\PracticJava\\src\\Practic_5\\image_" + (i + 1) + ".jpg");
        }

        animationLabel = new JLabel(frames[currentFrame]);
        add(animationLabel, BorderLayout.CENTER);

        Timer timer = new Timer(500, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                currentFrame = (currentFrame + 1) % frames.length;
                animationLabel.setIcon(frames[currentFrame]);
            }
        });
        timer.start();
    }

    public static void main(String[] args) {
        AnimationApp app = new AnimationApp();
        app.setVisible(true);
    }
}
