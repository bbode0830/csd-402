/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


/**
 * Ben Bode
 * 7/19/2026
 * Week 6 assignment
 * purpose: make a fan class and show basic understanding of classes
 * @author benbo
 */
public class Bode_Mod_6_CSD402 {

    public static void main(String[] args) {
        
        //make instances of the fan class
        Fan fan_1 = new Fan();
        Fan fan_2 = new Fan(2, true, 3, "blue");
        
        //print the characteristics of each fan
        System.out.println(fan_1.toString());
        System.out.println(fan_2.toString());
        
        //print individal characteristics of each fan
        System.out.println("Individual characteristics of the two fans: ");
        
        System.out.println(fan_1.GetColor());
        System.out.println(fan_1.GetOn());
        System.out.println(fan_2.GetRadius());
        System.out.println(fan_2.GetSpeed());
        
        //change the characteristics of a fan
        fan_1.SetOn(true);
        fan_1.SetRadius(4.5);
        fan_1.SetSpeed(3);
        fan_1.SetString("teal");
        
        //show the characteristics changed
        System.out.println(fan_1.toString());
    }
    
}

class Fan {
    //declare some variables that cannot be changed
    final int STOPPED = 0;
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;
    
    //declare variables that can only be used inside the class
    private int speed;
    private boolean on;
    private double radius;
    private String color;
    
    //constructor with no arguments
    Fan(){
        speed = 0;
        on = false;
        radius = 6;
        color = "white";
    }
    
    //constructor with arguments
    Fan(int newSpeed, boolean newOn, double newRadius, String newColor){
        speed = newSpeed;
        on = newOn;
        radius = newRadius;
        color = newColor;
    }
    
    
    //setter methods
    public int SetSpeed(int newSpeed){
        speed = newSpeed;
        return speed;
    }
    
    public boolean SetOn(boolean newOn){
        on = newOn;
        return on;
    }
    
    public double SetRadius(double newRadius){
        radius = newRadius;
        return radius;
    }
    
    public String SetString(String newColor){
        color = newColor;
        return color;
    }
    
    
    //getter methods
    public int GetSpeed(){
        return speed;
    }
    
    public boolean GetOn(){
        return on;
    }
    
    public double GetRadius(){
        return radius;
    }
    
    public String GetColor(){
        return color;
    }
    
    
    //display results in a nice string
    public String toString(){
        String velocity;
        if (speed == 3){
            velocity = "FAST";
        }
        else if (speed == 2){
            velocity = "MEDIUM";
        }
        else if (speed == 1){
            velocity = "SLOW";
        }
        else if (speed == 0){
            velocity = "STOPPED";
        }
        else {
            velocity = "You did not enter a valid speed!";
        }
        
        String output = "Fan speed: " + velocity + " Fan on: " + on +
                " Fan radius: " + radius + " Fan color: " + color;
        return output;
    }
}
