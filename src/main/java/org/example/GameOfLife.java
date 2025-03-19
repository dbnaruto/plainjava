package org.example;

import java.util.Arrays;

public class GameOfLife {
    public int[][] processBoard(int[][] board) {

//        board[0][0] = 0;

        //{1,1,1}

        int[][] resultBoard = new int[board.length][board[0].length];

        for(int row = 0; row < board.length; row++){
            for(int col = 0; col < board[row].length; col++){
                if(col + 1 < board[row].length) {
                    int liveCount = 0;

                    if(col-1 > -1 && board[row][col-1] == 1){
                        liveCount++;
                    }
                    if(col+1 < board[row].length && board[row][col+1] == 1){
                        liveCount++;
                    }



                    if(liveCount < 2 // Rule 1
                      ) {
                        resultBoard[row][col] = 0; // dead
                    } else {
                        resultBoard[row][col] = 1; // alive
                    }

                    if(liveCount > 3 // Rule 2
                    ) {
                        resultBoard[row][col] = 0; // dead
                    } else {
                        resultBoard[row][col] = 1; // alive
                    }
                }
            }
        }

        return resultBoard;
    }


    /*
Any live cell with fewer than two live neighbors dies as if caused by under-population.
Any live cell with two or three live neighbors lives on to the next generation.
Any live cell with more than three live neighbors dies, as if by over-population.
Any dead cell with exactly three live neighbors becomes a live cell, as if by reproduction.
The next state of the board is determined by applying the above rules simultaneously to every cell in the current
      state of the m x n grid board. In this process, births and deaths occur simultaneously.
 */

}
