package com.amplet;

import javax.swing.*;
import java.awt.*;

public class Launcher {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Projeto Amplet");
        frame.setSize(new Dimension(500,500));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.LINE_AXIS));

        JButton btn1 = new JButton("Clique-me");
        frame.getContentPane().add(btn1);

        frame.setVisible(true);
    }

}
