

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * *Ben Bode
 * 8/16/2026
 * purpose: make 4 instances of 2 different types of divisions and display their qualities
 * @author benbo
 */

public class UseDivision {
    
    public static void main(String [] args){
        
        System.out.println("beginning code");
        //make 2 instances of the InternationalDivision class
        InternationalDivision intDiv1 = new InternationalDivision("India", "Hindu", "Indian Holdings LTD", 152873);
        InternationalDivision intDiv2 = new InternationalDivision("Germany", "German", "Deutschland Interests", 128934);
        System.out.println("halfway code");
        //make 2 instances of the DomesticDivision class
        DomesticDivision domDiv1 = new DomesticDivision("Mountain Holdings", "Colorado", 192744);
        DomesticDivision domDiv2 = new DomesticDivision("Maverik Managers", "North Dakota", 366712);
        
        //display the results
        intDiv1.display();
        System.out.println("------------------");
        intDiv2.display();
        System.out.println("------------------");
        domDiv1.display();
        System.out.println("------------------");
        domDiv2.display();
    }
}
