/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *Ben Bode
 * 8/16/2026
 * purpose: make a class that extends an abstract class
 * @author benbo
 */

//extends an abstract class

public class InternationalDivision extends Division {
    String divisionCountry;
    String divisionLanguage;
    
    //define a constructor with 4 requirements
    InternationalDivision(String country, String language, String divisionName, int accountNumber){
        super(divisionName, accountNumber);
        divisionCountry = country;
        divisionLanguage = language;
}
    
    //override the display method
    @Override
    public void display(){
        System.out.println("Division name: " + divisionName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Country: " + divisionCountry);
        System.out.println("Language: " + divisionLanguage);
    }
}
