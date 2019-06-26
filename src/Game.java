import java.util.Random;

public class Game {

    public static final int ROWS = 6;
    public static final int COLUMNS = 6;

    public static void main(String[] args)
    {

        //Create a new board instance
        Board boardStatus  = new Board();

        //Create a playing board
        int[][] gameBoard = boardStatus.setBoardSize(ROWS,COLUMNS);

        //generate board with players
        boardStatus.generateRandomBoard(gameBoard);

        //print the board status
        boardStatus.printBoard(gameBoard);

        //check for winner
        int WinningPlayerIndex = boardStatus.checkBoardStatus(gameBoard);

        //Display winning player index if exists
        if(WinningPlayerIndex==0)
        {
            System.out.println("No wins, start again");
        }else
        {
           System.out.println("Player : " + WinningPlayerIndex + " won");
        }



    }








}
