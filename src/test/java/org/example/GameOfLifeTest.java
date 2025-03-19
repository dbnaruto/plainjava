package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;


/*
Any live cell with fewer than two live neighbors dies as if caused by under-population.
Any live cell with two or three live neighbors lives on to the next generation.
Any live cell with more than three live neighbors dies, as if by over-population.
Any dead cell with exactly three live neighbors becomes a live cell, as if by reproduction.
The next state of the board is determined by applying the above rules simultaneously to every cell in the current
      state of the m x n grid board. In this process, births and deaths occur simultaneously.
 */



public class GameOfLifeTest {

    @Test
    public void simpleTest() {
        int[][] input = new int[][]{
                {1}
        };
        int[][] expected = new int[][]{
                {0}
        };
        GameOfLife gameOfLife = new GameOfLife();
        assertArrayEquals(expected, gameOfLife.processBoard(input));
    }


    @Test
    public void rule1Test() {
        int[][] input = new int[][]{
                {1,1,1}
        };
        int[][] expected = new int[][]{
                {0,1,0}
        };
        GameOfLife gameOfLife = new GameOfLife();
        assertArrayEquals(expected, gameOfLife.processBoard(input));
    }

    // Any live cell with two or three live neighbors lives on to the next generation.
    @Test
    public void rule2Test() {
        int[][] input = new int[][]{
                {1,1,1,1,1}
        };
        int[][] expected = new int[][]{
                {0,0,1,0,0}
        };
        GameOfLife gameOfLife = new GameOfLife();
        assertArrayEquals(expected, gameOfLife.processBoard(input));
    }




//    @Test
//    public void procesNextStateTest() {
//        int[][] input = {
//                {1,1},
//                {1,0}
//        };
//        // implementation goes here
//        int[][] expected = {
//                {1,1},
//                {1,1}
//        };
//        assertEquals(expected, input);
//    }

    /*
    Example 2:
Before
    "010"
    "001"
    "111"
    "000"
After
    "000"
    "101"
    "011"
    "010"
     */
}
