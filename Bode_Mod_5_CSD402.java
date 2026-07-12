/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 * Ben Bode
 * 7/12/2026
 * Week 5 homework assignment
 * purpose: find the largest and smallest values in some multi-dimensional arrays
 * @author benbo
 */
public class Bode_Mod_5_CSD402 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //declare the arrays
        double [][] dobArray = {{0.231,1.34,5.238},{0.001,25.98,5},{3.29,3.456,7.89},{1,6}};
        int [][] intArray = {{1,5,3},{23,1,34},{3,2},{33,0,3,13}};
        
        //call the four methods
        int [] dobLargestLoc = locateLargest(dobArray);
        int [] intLargestLoc = locateLargest(intArray);
        int [] dobSmallestLoc = locateSmallest(dobArray);
        int [] intSmallestLoc = locateSmallest(intArray);
        
        //display the results
        System.out.print("For the largest value in the double array ");
        displayArray(dobLargestLoc);
        System.out.print("For the largest value in the integer array ");
        displayArray(intLargestLoc);
        
        System.out.print("For the smallest value in the double array ");
        displayArray(dobSmallestLoc);
        System.out.print("For the smallest value in the integer array ");
        displayArray(intSmallestLoc);
        
        System.out.println("note that the location values start at zero");
    }
    
    public static int [] locateLargest(double [][] arrayParam){
        int [] location = new int[2];
        double largestYet = Double.MIN_VALUE;
        
        //loop through each value
        for(int i=0; i < arrayParam.length; ++i){
            for(int j=0; j < arrayParam[i].length; ++j){
                if (arrayParam[i][j] > largestYet){
                    largestYet = arrayParam[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }
        
        return location;
    }
    
    public static int [] locateLargest(int [][] arrayParam){
        int [] location = new int[2];
        int largestYet = Integer.MIN_VALUE;
        
        for(int i=0; i < arrayParam.length; ++i){
            for(int j=0; j < arrayParam[i].length; ++j){
                if (arrayParam[i][j] > largestYet){
                    largestYet = arrayParam[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }
        
        return location;
    }
    
    public static int [] locateSmallest(double [][] arrayParam){
        int [] location = new int[2];
        double smallestYet = Double.MAX_VALUE;
        
        for(int i=0; i < arrayParam.length; ++i){
            for(int j=0; j < arrayParam[i].length; ++j){
                if (arrayParam[i][j] < smallestYet){
                    smallestYet = arrayParam[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }
        
        return location;
    }
    
    public static int [] locateSmallest(int [][] arrayParam){
        int [] location = new int[2];
        int smallestYet = Integer.MAX_VALUE;
        
        for(int i=0; i < arrayParam.length; ++i){
            for(int j=0; j < arrayParam[i].length; ++j){
                if (arrayParam[i][j] < smallestYet){
                    smallestYet = arrayParam[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }
        
        return location;
    }
    
    //two small methods to make displaying the results simpler
    public static void displayArray(int [] array){
        System.out.print("the location in the array is: ");
        System.out.println("(" + array[0] + ", " + array[1] + ")");
    }
    public static void displayArray(double [] array){
        System.out.print("the location in the array is: ");
        System.out.println("(" + array[0] + ", " + array[1] + ")");
    }
}
