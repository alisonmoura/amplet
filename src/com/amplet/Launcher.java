package com.amplet;

import javax.swing.*;
import java.awt.*;

public class Launcher {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Projeto Amplet");
        frame.setSize(new Dimension(500,500));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Box box = Box.createVerticalBox();
        JButton btn1 = new JButton("Clique-me");
        box.add(btn1);

        frame.add(box, BorderLayout.CENTER);

        frame.setVisible(true);
    }

}
