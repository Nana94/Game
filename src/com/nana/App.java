package com.nana;
import java.awt.EventQueue;

public class App {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GameGUI().setVisible(true);
            }
        });

    }
}
