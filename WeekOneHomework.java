/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.example.CSD402;

/**
 * Ben Bode
 * 6/14/2026
 * Week 1 assignment
 * purpose: write a short program to calculate the amount of energy needed to 
 * heat some water in Joules
 * @author benbo
 */

import java.util.Scanner;

public class WeekOneHomework {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("This program takes a given amount of water "
                + "and the starting and ending temperatures of the water "
                + "and tells the user how much energy is required"
                + " for this to be accomplished.");
        
        System.out.println("Please enter the weight of the water in kilograms: ");
        String weight = input.nextLine();
        double mass;
        mass = Double.parseDouble(weight);

        System.out.println("Please enter the starting temperature of the water "
                + "in degrees Celsius: ");
        String inTemp = input.nextLine();
        double initTemp;
        initTemp = Double.parseDouble(inTemp);
        
        System.out.println("Please enter the ending temperature of the water "
                + "in degrees Celsius: ");
        String finTemp = input.nextLine();
        double finalTemp;
        finalTemp = Double.parseDouble(finTemp);

        
        double energyNeeded = mass*(finTemp-initTemp)*4184;
        
        System.out.println("The amount of energy needed is " + energyNeeded + 
                " Joules!");
        }
    
}
