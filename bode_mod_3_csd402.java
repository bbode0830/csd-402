/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 * Ben Bode
 * 6/28/2026
 * purpose: make a pyramid of numbers in a specified format
 * @author benbo
 */
public class bode_mod_3_csd402 {

    public static void main(String[] args) {
        
        //int line_counter = 1; //start at the top line
        
        //for each line
        for(int line_counter=1; line_counter<=7; ++line_counter){
            //how many numbers will be in the line
            int line_values = (line_counter*2)-1;
            //find how many white spaces the line needs
            int white_spaces = (13-line_values)/2;
                
            //print the first half of white spaces
            for(int i=0; i<= white_spaces; ++i){
                System.out.print("    ");
            }
            
            //print the numbers
            
            //print the ascending numbers
            int num_ops = line_counter - 1;//number of times to operate
            int j = 1;
            int ops_count = 0;
            System.out.printf("%4d",j);//print an initial value of 1
            for(; ops_count < num_ops; ops_count+=1){
                j = j*2;
                System.out.printf("%4d", j);
            }
            //print the descending numbers
            ops_count = 0;
            for(;ops_count<num_ops; ops_count+=1){
                j = j/2;
                System.out.printf("%4d", j);
            }
            
            //print the rest of the white spaces
            for(int i=0; i<= white_spaces; ++i){
                System.out.print("    ");
            }
            
            //print the @ symbol
            System.out.print("@\n");
            
        }
    }
    
}
