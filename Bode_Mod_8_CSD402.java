/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 * Ben Bode
 * 8/2/2026
 * Module 8 assignment
 * purpose: make a list of integers and use a method to find the max value
 * @author benbo
 */
import java.util.*;
import java.util.Scanner;

public class Bode_Mod_8_CSD402 {

    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        ArrayList list_01 = new ArrayList <Integer> ();
        System.out.println("Please add some values to the list");
        System.out.println("type '0' to end list, '0' will be added to the list\n");
        int again = 1;
        while(again != 0){
            System.out.print("value: ");
            String in = input.nextLine();
            int value = Integer.parseInt(in);
            list_01.add(value);
            again = value;
        }
        
        BenArrayListTest newList = new BenArrayListTest();
        //newList.printList();
        System.out.println("The max value in the list is: ");
        System.out.println(newList.max(list_01));
    }
    
}

class BenArrayListTest {
    
    public static Integer max(ArrayList list){
        int maxVal = 0;
        for(int i = 0; i<list.size(); ++i){
            Object val = list.get(i);
            int value = (int) val;
            if(value>maxVal){
                maxVal = value;
            }
        }
        
        return maxVal;
    }
}
