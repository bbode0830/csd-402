/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


/**
 * Ben Bode
 * 7/25/2026
 * Week 7 assignment
 * purpose: add another class to the week 6 homework to do more tasks
 * @author benbo
 */
public class Bode_Mod_7_CSD402 {
    
    public static void main(String[] args) {
        
        //make instances of the fan class
        Fan fan_1 = new Fan();
        Fan fan_2 = new Fan("Fan 1", 2, true, 3, "Light Blue");
        Fan fan_3 = new Fan("Fan 3", 3, true, 7.9, "Gold");
        //make an instance of the UseFans class
        UseFans fans = new UseFans(fan_1, fan_2, fan_3);
        
        System.out.println("\n------ Week 7 Examples--------\n");
       
        //print all the fan info at once
        fans.printAllFans(fan_1, fan_2, fan_3);
        
        //print the info for only one fan
        fans.printOneFan(fan_1);
        
        System.out.println("\n------ Week 6 Examples--------\n");
        
        //week 6 toString method
        System.out.println(fan_3.toString());
        
        //print the characteristics of two fans
        System.out.println(fan_1.toString());
        System.out.println(fan_2.toString());
        
        //print individal characteristics of each fan
        System.out.println("Individual characteristics of two fans: ");
        
        System.out.println(fan_1.GetColor());
        System.out.println(fan_1.GetOn());
        System.out.println(fan_2.GetRadius());
        System.out.println(fan_2.GetSpeed());
        
        //change the characteristics of a fan
        fan_1.SetName("Fanley the Destroyer");
        fan_1.SetOn(true);
        fan_1.SetRadius(4.5);
        fan_1.SetSpeed(3);
        fan_1.SetString("teal");
        
        //show the characteristics changed
        System.out.println(fan_1.toString());
        
        System.out.println("Updated fan list after changes to one fan: \n ");
        
        //updated fan list
        fans.printAllFans(fan_1, fan_2, fan_3);
    }
}

//Fan class from week 6
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
    String name;
    
    //constructor with no arguments
    Fan(){
        name = "default";
        speed = 0;
        on = false;
        radius = 6;
        color = "white";
    }
    
    //constructor with arguments
    Fan(String name, int speed, boolean on, double radius, String color){
        this.name = name;
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }
    
    
    //setter methods
    public String SetName(String name){
        this.name = name;
        return name;
    }
    public int SetSpeed(int speed){
        this.speed = speed;
        return speed;
    }
    
    public boolean SetOn(boolean on){
        this.on = on;
        return on;
    }
    
    public double SetRadius(double radius){
        this.radius = radius;
        return radius;
    }
    
    public String SetString(String color){
        this.color = color;
        return color;
    }
    
    
    //getter methods
    public String GetName(){
        return name;
    }
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
        
        String output = "Fan name: " + name + " Fan speed: " + velocity + " Fan on: " + on +
                " Fan radius: " + radius + " Fan color: " + color;
        return output;
    }
}

//new UseFans class this week
class UseFans {
    
    //make a collection of fan info in the constructor
    UseFans(Fan... fans){//I had to research a way to include an undetermined
        //number of fans and I came up with varargs, so I spent some time
        //learning about those and I decided to implement them in this
        //weeks homework
        int f = 0;
        String [] fanInfo = new String[fans.length];
        for(Fan i:fans){
            String fanData = i.toString();
            fanInfo[f] = fanData;
            f +=1;
        }
    }
    
    //a method that prints info on all fans
    public void printAllFans(Fan... fans){
        int f = 0;
        for(Fan i:fans){
            String name = i.GetName();
            int speed = i.GetSpeed();
            boolean on = i.GetOn();
            double radius = i.GetRadius();
            String color = i.GetColor();
        
        System.out.println("Name: " + name + " Speed: " + speed + " on: " + on + " radius: " + 
                radius + " color: " + color);
            f +=1;
        }
    }
        
    //a method that prins info on only one fan
    public void printOneFan(Fan fan){
        String name = fan.GetName();
        int speed = fan.GetSpeed();
        boolean on = fan.GetOn();
        double radius = fan.GetRadius();
        String color = fan.GetColor();
        
        System.out.println("Name: " + name + " Speed: " + speed + " on: " + on + " radius: " + 
                radius + " color: " + color);
    }
}


