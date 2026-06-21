


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 * Ben Bode
 * 6/21/2026
 * module 2 assignment
 * purpose: make a simple rock paper scissors game
 * @author benbo
 */

import java.util.Scanner;

public class weekTwo402 {

    public static void main(String[] args) {
        //assign variable to hold player's value
        int player_move;
        
        //get a random number between 1 and 3 for the computer's move
        int computer_move = (int)(Math.random() * 3 + 1); 
        
        //explain game to user and get user's play
        Scanner input = new Scanner(System.in);
        System.out.print("Lets play rock paper scissors! Enter '1' for rock, "+
        "'2' for paper, or '3' for scissors:\n");
        player_move = input.nextInt();
        
        
        //compare the computer's play with user's play and output results
        if(player_move == 1 && computer_move == 1){
            System.out.print("You both choose rock. Tie!");
        }
        if(player_move == 1 && computer_move == 2){
            System.out.print("You chose rock and the computer chose paper. You lose!");
        }
        if(player_move == 1 && computer_move == 3){
            System.out.print("You chose rock and the computer chose scissors. You win!");
        }
        if(player_move == 2 && computer_move == 1){
            System.out.print("You chose paper and the computer chose rock. You win!");
        }
        if(player_move == 2 && computer_move == 2){
            System.out.print("You chose paper and the computer chose paper. Tie!");
        }
        if(player_move == 2 && computer_move == 3){
            System.out.print("You chose paper and the computer chose scissors. You lose!");
        }
        if(player_move == 3 && computer_move == 1){
            System.out.print("You chose scissors and the computer chose rock. You lose!");
        }
        if(player_move == 3 && computer_move == 2){
            System.out.print("You chose scissors and the computer chose paper. You win!");
        }
        if(player_move == 3 && computer_move == 3){
            System.out.print("You chose scissors and the computer chose scissors. Tie!");
        }
        //handle any invalid inputs
        if(player_move != 1 && player_move != 2 && player_move != 3){
            System.out.print("You did not enter a valid input.");
        }
    }
}
