package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Michael Kisida
 */
import java.util.Scanner;

public class App
{
    public static void main(String[] args) {
        Scanner name = new Scanner(System.in);  // Create a Scanner object
        System.out.println("What is your Name:");

        String firstName  = name.nextLine();  // Read user input
        String Name = ("Hello, " + firstName + ", nice to meet you!");  // Output user input
        System.out.println(Name);
        name.close();
    }
}
