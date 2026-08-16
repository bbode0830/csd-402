/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author benbo
 */
public class UseDivisionSingleFile {

    public static void main(String [] args){
        
        //make 2 instances of the InternationalDivision class
        InternationalDivision intDiv1 = new InternationalDivision("India", "Hindu", "Indian Holdings LTD", 152873);
        InternationalDivision intDiv2 = new InternationalDivision("Germany", "German", "Deutschland Interests", 128934);

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



//define an abstract class
abstract class Division {
    String divisionName;
    int accountNumber;
    
    //define a constructor with two requirements
    Division(String Name, int Number){
        divisionName = Name;
        accountNumber = Number;
        
    }
    
    //abstract method that does nothing (yet)
    public abstract void display();
}

//extends an abstract class

class DomesticDivision extends Division {
    String state;
    
    //constructor with 4 requirements
    DomesticDivision(String divisionName, String state, int accountNumber){
        super(divisionName, accountNumber);
        this.state = state;
    }
    
    //override the display method
    @Override
    public void display(){
        System.out.println("Division name: " + divisionName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("State: " + state);
    }
}

//extends an abstract class

class InternationalDivision extends Division {
    String divisionCountry;
    String divisionLanguage;
    
    //define a constrctor with 4 requirements
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
