/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 * Ben Bode
 * 7/5/2026
 * purpose: display the average of values in arrays of different types
 * @author benbo
 */
public class Bode_Mod_4_CSD402 {

    public static void main(String[] args) {
        
        //declare four arrays
        int [] int_array = {1000000994, 420637542, 287261476};
        short [] short_array = {2,5,10,-5,-6};
        long [] long_array = {1938716758938068524L, 2763514758736529078L};
        double [] double_array = {1.235, 209.4839, 1237289.1};
        
        
        //display the results for each type
        display_elements(int_array);
        System.out.println("\nThe average is: " + average(int_array)+"\n");
        
        display_elements(short_array);
        System.out.println("\nThe average is: " + average(short_array)+"\n");
        
        display_elements(long_array);
        System.out.println("\nThe average is: " + average(long_array)+"\n");
        
        display_elements(double_array);
        System.out.println("\nThe average is: " + average(double_array)+"\n");
        
    }
    
    //make a method for the average of each variable type
    public static int average(int [] array){
        int total = 0;
        for (int i = 0; i < array.length; ++i){
            total += array[i];
        }
        int average = total/array.length;

        return average;
    }
    
    public static short average(short [] array){
        short total = 0;
        short values = 0;
        for (int i = 0; i < array.length; ++i){
            total += array[i];
            values +=1;
        }
        short average = (short) (total/values);//cast value to a short
        return average;
    }
        
    public static long average(long [] array){
        long total = 0;
        for (int i = 0; i < array.length; ++i){
            total += array[i];
        }
        long average = total/array.length;
        return average;
    }
        
    public static double average(double [] array){
        double total = 0;
        for (int i = 0; i < array.length; ++i){
            total += array[i];
        }
        double average = total/array.length;
        return average;
    }
        
        
    //display elements in all four variable types
    public static void display_elements(int [] array){
        System.out.print("The values in the int array are: ");
        for (int i=0; i<array.length; i++){
            if (i != array.length-1){
                System.out.print(array[i] + ", ");
            }
            else {
                System.out.print(array[i]);
            }
        }
    }
    
    public static void display_elements(short [] array){
        System.out.print("The values in the short array are: ");
        for (int i=0; i<array.length; i++){
            if (i != array.length-1){
                System.out.print(array[i] + ", ");
            }
            else {
                System.out.print(array[i]);
            }
        }
    }
        
    public static void display_elements(long [] array){
        System.out.print("The values in the long array are: ");
        for (int i=0; i<array.length; i++){
            if (i != array.length-1){
                System.out.print(array[i] + ", ");
            }
            else {
                System.out.print(array[i]);
            }
        }
    }
        
    public static void display_elements(double [] array){
        System.out.print("The values in the double array are: ");
        for (int i=0; i<array.length; i++){
            if (i != array.length-1){
                System.out.print(array[i] + ", ");
            }
            else {
                System.out.print(array[i]);
            }
        }
    }
}