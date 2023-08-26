package TicTacToe;

import java.util.Scanner;

public class Tic_Tac_Toe{
    public static void main(String[]args){
        char[][] board=new char[3][3];
        for(int row=0;row<board.length;row++){
            for(int col=0;col<board[row].length;col++){
                board[row][col]=' ';
            }
        }
        //this initilize a player
        char player='X';

        //this will tell me if the game is still on or it is over
        boolean gameOver=false;

        //taking the input
        Scanner sc=new Scanner(System.in);

        while(!gameOver){
            Printboard(board);
            System.out.println("Player "+player+" enter:" );
            int row=sc.nextInt();
            int col=sc.nextInt();
            //The value will be palced after the checking if the place is vacent or not
            if(board[row][col]==' '){
                board[row][col]=player;
                gameOver=haveWon(board,player);
                if(gameOver){
                    System.out.println("Player "+player+" has won the game:");
                }else{
                    // if(player=='X'){
                    //     player='O';
                    // }else{
                    //     player='X';
                    // }
                    player= (player=='X')?'O':'X';
                }


            }else{
                System.out.println("Invalid Input!Please try again");
            }

        }
        Printboard(board);
        sc.close();


    }
//This will print the board
    private static void Printboard(char[][] board) {
        System.out.println(" -------------");
         for(int row=0;row<board.length;row++){
            System.out.print(" | ");
            for(int col=0;col<board[row].length;col++){
                System.out.print(board[row][col]+" | ");
            }
            System.out.println();
            System.out.println(" -------------");
        }
    }

    private static boolean haveWon(char[][] board, char player) {
        //checking for the  row
        for(int row=0;row<board.length;row++){
            if(board[row][0]==player & board[row][1]==player & board[row][2]==player) return true;   
        }
        //checking for the column
        for(int col=0;col<board[0].length;col++){
           if(board[0][col]==player & board[1][col]==player & board[2][col]==player) return true;   
        }
        //checking for the diagonal
         if(board[0][0]==player && board[1][1]==player && board[2][2]==player) return true;
         if( board[0][2]==player && board[1][1]==player && board[2][0]==player ) return true;
        return false;
    }
}
    


    

