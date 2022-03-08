package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //Student newStudent = new Student("Yousef",)
        //Create the Main Frame of my GUI Application
        JFrame frameOne = new JFrame(); // Creating an instance of JFrame Class
        frameOne.setSize(400,400);
        frameOne.setLayout(null); // Using no layout managers.
        frameOne.setVisible(true); //to make the frame visible

        //The Contol Objects : ===================
        //1. JButton
        //A.Create form control objects (ex. JButton, JTextField, JLabel)
        JButton buttonOne = new JButton("CLick");
        //B. Configure properties of the controls
        buttonOne.setBounds(1,1,100,30); // x axis, y axis, width, height
        frameOne.add(buttonOne);


    }
}
