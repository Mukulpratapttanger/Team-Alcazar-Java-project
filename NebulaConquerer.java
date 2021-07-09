package com.alcazar;

import java.awt.EventQueue;
import javax.swing.JFrame;

public class NebulaConquerer extends JFrame  {

    public NebulaConquerer() {

        initUI();
    }

    private void initUI() {

        add(new Board());

        setTitle("NebulaConquerer");
        setSize(Commons.BOARD_WIDTH, Commons.BOARD_HEIGHT);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {

        EventQueue.invokeLater(() -> {

            var ex = new NebulaConquerer();
            ex.setVisible(true);
        });
    }
}
