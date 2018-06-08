package org.academiadecodigo.bootcamp.Grid;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

/**
 * Created by codecadet on 08/06/2018.
 */
public class Cell {

    private Rectangle cell;
    private int cellSize = 25;
    private int row;
    private int col;


    public Cell(int row, int col) {
        this.row = row;
        this.col = col;
        cell = new Rectangle(row * cellSize, col * cellSize, cellSize, cellSize);
        cell.setColor(Color.BLACK);
        cell.draw();
    }

    public int getCellSize() {
        return cellSize;
    }

    public int getCol() {
        return col;
    }

    public int getRow() {
        return row;
    }
}
