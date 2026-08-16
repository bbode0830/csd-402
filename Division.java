

/**
 * Ben Bode
 * 8/16/2026
 * purpose: make an abstract class
 * @author benbo
 */

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
