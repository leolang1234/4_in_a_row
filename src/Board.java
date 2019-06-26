import java.util.Random;

public class Board {


    public static int checkBoardStatus(int gameBoard[][])
    {
        final int HEIGHT = gameBoard.length;
        final int WIDTH = gameBoard[0].length;

        final int EMPTY_CELL = 0;

        //loop through all the rows from top to buttom
        for (int i = 0; i < HEIGHT; i++)
        {
            //loop through all the colums from left to right
            for (int j = 0; j < WIDTH; j++)
            {
                //if the start cell is empty then move to next cell and dont check
                int cell = gameBoard[i][j];
                if (cell == EMPTY_CELL)
                    continue;

                //starting position is not empty
                //check from starting position to the right
                if (j + 3 < WIDTH &&
                        cell == gameBoard[i][j+1] &&
                        cell == gameBoard[i][j+2] &&
                        cell == gameBoard[i][j+3])
                    return cell;

                //check from starting position to the line above
                if (i + 3 < HEIGHT) {
                    if (cell == gameBoard[i+1][j] &&
                            cell == gameBoard[i+2][j] &&
                            cell == gameBoard[i+3][j])
                        return cell;
                    //check from starting position to the line above and right
                    if (j + 3 < WIDTH &&
                            cell == gameBoard[i+1][j+1] &&
                            cell == gameBoard[i+2][j+2] &&
                            cell == gameBoard[i+3][j+3])
                        return cell;
                    //check from starting position to the line above and left
                    if (j - 3 >= 0 &&
                            cell == gameBoard[i+1][j-1] &&
                            cell == gameBoard[i+2][j-2] &&
                            cell == gameBoard[i+3][j-3])
                        return cell;
                }
            }
        }
        return EMPTY_CELL; // no winner found
    }

    public static void clearBoard(int gameBoard[][])
    {

        final int HEIGHT = gameBoard.length;
        final int WIDTH = gameBoard[0].length;


        for(int i=0;i<HEIGHT;i++)
        {
            for(int j=0;j<WIDTH;j++)
            {
                gameBoard[i][j]=0;
            }
        }
    }

    public static void printBoard(int gameBoard[][])
    {

        final int HEIGHT = gameBoard.length;
        final int WIDTH = gameBoard[0].length;


        for(int i=0;i<HEIGHT;i++)
        {
            for(int j=0;j<WIDTH;j++)
            {
                System.out.print(gameBoard[i][j] + ", ") ;
            }

            System.out.println("\n") ;
        }
    }

    public static int[][] setBoardSize(int ROWS,int COLUMNS)
    {
        return new int[ROWS][COLUMNS];
    }

    public static void generateRandomBoard(int gameBoard[][])
    {
        Random rand = new Random();

        final int HEIGHT = gameBoard.length;
        final int WIDTH = gameBoard[0].length;

        for(int i=0;i<HEIGHT;i++)
        {
            for(int j=0;j<WIDTH;j++)
            {
                gameBoard[i][j]=rand.nextInt(3);
            }
        }
    }


}
