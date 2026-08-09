/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


/**
 * Ben Bode
 * 8/9/2026
 * Module 9 program 1
 * purpose: practice using try-catch blocks on an arrayList
 * @author benbo
 */

//import required libraries
import java.util.*;
import java.util.Scanner;

public class Bode_Mod_9_1_CSD402 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        //make a new list and add 10 strings to the list
        ArrayList nameList = new ArrayList <String> ();
        nameList.add("Ben");//autoboxing
        nameList.add("Jack");
        nameList.add("Tom");
        nameList.add("Ethan");
        nameList.add("Caleb");
        nameList.add("David");
        nameList.add("Liz");
        nameList.add("Mary");
        nameList.add("Brooke");
        nameList.add("Wildauer");
        
        //display the elements of the list
        for(var name : nameList){
            System.out.println(name);
        }
        
        //get the element to be displayed again
        System.out.println("Which name would you like to see again?\n");
        String nameToGet = input.nextLine();
        
        //try block, search for entered name and throw exception if it is not found
        try{
            int index = nameList.indexOf(nameToGet);
            System.out.println("\n The name you entered was: " + nameList.get(index));//auto un-boxing
        }
        //catch block, handle any exceptions
        catch(Exception e){
            System.out.println("An 'out of bounds' exception has been thrown.");
        }
        
    }
    
}
