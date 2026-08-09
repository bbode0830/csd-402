/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


/**
 *
 * @author benbo
 */

import java.io.*;
import java.util.*;

public class Bode_Mod_9_2_CSD402 {

    public static void main(String[] args) {
        
        //make a new file or open an already existing file
        File file = new File("data.file");
        PrintWriter pw;
        Scanner sc;
        
        //append the file
        try{
            pw = new PrintWriter(new FileOutputStream(file, true));
            
            for(int i = 0; i<10; ++i){
                pw.println((int)(Math.random()*100+1));
            }
            
            pw.close();
        }
        
        //catch exceptions if necessary
        catch(IOException ioe){
            System.out.println("IOExcepction has been thrown. -1");
        }
        
        //read and print from the file
        try{
            sc = new Scanner(file);
            while(sc.hasNext()){
                System.out.print(sc.next() + " ");
            }
        }
        
        //catch any exceptions
        catch(IOException ioe){
            System.out.println("IOEsception has been thrown. -2");
        }
    }
    
}
