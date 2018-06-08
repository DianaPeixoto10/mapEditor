package org.academiadecodigo.bootcamp.Grid;


import org.academiadecodigo.simplegraphics.graphics.Canvas;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;

/**
 * Created by codecadet on 08/06/2018.
 */
public class Grid {

    private int col;
    private int row;

    public Grid() {

        Cell[] row0 = new Cell[25];
        Cell[][] grid = new Cell[25][25];

        for (row = 0; row < row0.length; row++) {
            for (col = 0; col < grid.length; col++) {
                grid[row][col] = new Cell(row, col);
            }
        }
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }
}
