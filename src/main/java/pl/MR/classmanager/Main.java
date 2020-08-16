package pl.MR.classmanager;

import pl.MR.classmanager.view.MainWindow;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        MainWindow mainWindow = new MainWindow();
        // po kliknięci X spowoduje że faktycznie program się zamknie a nie że po prostu zniknie okno a program będzie dalej chodził
        mainWindow.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        mainWindow.setSize(640,480);
        mainWindow.setVisible(true);
    }
}
