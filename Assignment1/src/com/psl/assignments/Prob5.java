package com.psl.assignments;

public class Prob5
{
    static char checkWinner(char[][] board)
    {
        char rowTemp=' ',colTemp=' ',diaTemp=' ';
        boolean row=true,col=true;
        for (int i=0; i< board.length;i++)
        {
            for (int k =0; k< board.length; k++)
            {
                if(k==0)
                {
                    colTemp = board[k][i];
                    rowTemp = board[i][k];
                }

                if(rowTemp!=board[i][k])
                    row = false;
                if(colTemp != board[k][i])
                    col = false;

                if (k==(board.length-1)&&row==true)
                    return rowTemp;

                if (k==(board.length-1)&&col==true)
                    return colTemp;
            }

            if(i==0)
                diaTemp = board[i][i];
            if(diaTemp != board[i][i])
                break;
            if (i==(board.length-1) )
            {
                return diaTemp;
            }
        }

        return 'T';
    }
    public static void main(String[] args)
    {
        char[][] board = new char[][]{{'X', 'O', 'O'}, {'O', 'X', 'X'}, {'O', 'O', 'O'}};
        for (int i=0; i< 3;i++)
        {
            for (int j = 0; j<3; j++)
            {
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
        char winner = checkWinner(board);
        System.out.println("Winner is : " + winner);
    }
}
