
// Rock paper Scissor game..
import java.util.*;

public class Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Welcome and thanks to play the rock, paper and scissor game..
        System.out.println("Welcome to the Rock Paper and Scissor game-->");
        
        System.out.print("Enter 1 for Rock or 2 for Paper and 3 for Scissor - ");
        int player_choice = sc.nextInt();// 1 || 2 || 3
        
        System.out.print("Enter input for Computer to play with - ");
        int computer_choice = sc.nextInt();// 1 || 2 || 3
        
        // 1  as rock ..
        // 2 as paper..
        // 3 as scissor..
        
        // for taking rock as input..
        if(player_choice == 1 && computer_choice == 1){
            System.out.println("You have taken Rock and Computer also has taken Rock.");
            System.out.println("It's a Tie! Keep it up and try again.");
        }
        if(player_choice == 1 && computer_choice == 2){
            System.out.println("You have taken Rock and Computer has taken Paper.");
            System.out.println("Sorry You have lost the game!");
        }
        if(player_choice == 1 && computer_choice == 3){
            System.out.println("You have taken Rock and Computer has taken Scissor.");
            System.out.println("Congrats You won the game!");
        }

        // for taking paper as input..
        if(player_choice == 2 && computer_choice == 1){
            System.out.println("You have taken Paper and Computer has taken Rock.");
            System.out.println("Congrats You Won the game!");
        }
        if(player_choice == 2 && computer_choice == 2){
            System.out.println("You have taken Paper and Computer also has taken Paper.");
            System.out.println("It's a Tie! Keep it up and try again.");
        }
        if(player_choice == 2 && computer_choice == 3){
            System.out.println("You have taken Paper and Computer has taken Scissor.");
            System.out.println("Sorry You have lost the game!");
        }

        // for taking scissor as input..
        if(player_choice == 3 && computer_choice == 1){
            System.out.println("You have taken Scissor and Computer has taken Rock.");
            System.out.println("Sorry You have lost the game!");
        }
        if(player_choice == 3 && computer_choice == 2){
            System.out.println("You have taken Scissor and Computer has taken Paper.");
            System.out.println("Congrats You Won the game!");
        }
        if(player_choice == 3 && computer_choice == 3){
            System.out.println("You have taken Scissor and Computer also has taken Scissor.");
            System.out.println("It's a Tie! Keep it up and try again.");
        }

        sc.close();
    }
}