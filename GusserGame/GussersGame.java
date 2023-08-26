package GusserGame;
import java.util.Scanner;
//issme try lgaane ke wja se error aata hai 
class Guesser{
    int guessNum;
    public int GuessingNum(){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Kindly Guess the number:");
                guessNum=sc.nextInt();
        }
        return guessNum;
    

    }
}
class player{
    int pguessNum;
   public int GuessingNum(){
       try (Scanner sc = new Scanner(System.in)) {
        System.out.println("Player!Kindly Guess the number:");
               pguessNum=sc.nextInt();
    }
       return pguessNum;
       

   }

}
class Umpire{
    int numberfromGuesser;
    int numformPlayer1;
    int numformPlayer2;
    int numformPlayer3;

   public void CollectNumFormGuesser(){
        Guesser g=new Guesser();
        numberfromGuesser=g.GuessingNum();
        
    }
  public void CollectNumFormPlayer(){
    player p1=new player();
    player p2=new player();
    player p3=new player();
    numformPlayer1=p1.GuessingNum();
    numformPlayer2=p2.GuessingNum();
    numformPlayer3=p3.GuessingNum();

    }
   void Compare(){
        if(numberfromGuesser==numformPlayer1){
            System.out.println("Player 1 won the game:");
        }
        else if(numberfromGuesser==numformPlayer2){
            System.out.println("player 2 won the game:");
        }
        else if (numberfromGuesser==numformPlayer3) {
            System.out.println("Player 3 won the game:");
            
        }
        else{
            System.out.println("They Lost the game:");
        }

    }
}
public class GussersGame {
    public static void main(String[] args) {
        System.out.println("Game Starts:");
        Umpire u=new Umpire();
        u.CollectNumFormGuesser();
        u.CollectNumFormPlayer();
        u.Compare();
    }
    
}
