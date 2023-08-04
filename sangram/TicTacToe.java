// Java-Program to play Tic-Tac-Toe game.
import java.util.Scanner;
public class TicTacToe {
  public static void main(String[] args) {
    System.out.println("Tic-Tac-Toe");
    Scanner input = new Scanner(System.in);
    char[][] board = new char[3][3];
    for(int i=0;i<3;i++){
      for(int j=0;j<3;j++){
        board[i][j]=' ';
      }
    }
    int turn=0;
    while(true){
      System.out.println("Player "+(turn%2+1)+"'s turn");
      System.out.print("Enter the row : ");
      int row = input.nextInt();
      System.out.print("Enter the column : ");
      int col = input.nextInt();
      if(board[row][col]==' '){
        if(turn%2==0){
          board[row][col]='X';
        }
        else{
          board[row][col]='O';
        }
        turn++;
      }
      else{
        System.out.println("Invalid Move");
      }
      for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
          System.out.print(board[i][j]+" ");
        }
        System.out.println();
      }
      if(board[0][0]==board[0][1] && board[0][1]==board[0][2] && board[0][0]!=' '){
        System.out.println("Player "+(turn%2+1)+" wins");
        break;
      }
      else if(board[1][0]==board[1][1] && board[1][1]==board[1][2] && board[1][0]!=' '){
        System.out.println("Player "+(turn%2+1)+" wins");
        break;
      }
      else if(board[2][0]==board[2][1] && board[2][1]==board[2][2] && board[2][0]!=' '){
        System.out.println("Player "+(turn%2+1)+" wins");
        break;
      }
      else if(board[0][0]==board[1][0] && board[1][0]==board[2][0] && board[0][0]!=' '){
        System.out.println("Player "+(turn%2+1)+" wins");
        break;
      }
      else if(board[0][1]==board[1][1] && board[1][1]==board[2][1] && board[0][1]!=' '){
        System.out.println("Player "+(turn%2+1)+" wins");
        break;
      }
      else if(board[0][2]==board[1][2] && board[1][2]==board[2][2] && board[0][2]!=' '){
        System.out.println("Player "+(turn%2+1)+" wins");
        break;
      }
      else if(board[0][0]==board[1][1] && board[1][1]==board[2][2] && board[0][0]!=' '){
        System.out.println("Player "+(turn%2+1)+" wins");
        break;
      }
      else if(board[0][2]==board[1][1] && board[1][1]==board[2][0] && board[0][2]!=' '){
        System.out.println("Player "+(turn%2+1)+" wins");
        break;
      }
      else if(turn==9){
        System.out.println("Draw");
        break;
      }
    }
  }
}
