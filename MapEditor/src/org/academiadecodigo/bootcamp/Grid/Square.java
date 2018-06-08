package org.academiadecodigo.bootcamp.Grid;

import com.sun.org.apache.regexp.internal.RE;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Fillable;
import org.academiadecodigo.simplegraphics.graphics.Line;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;
import sun.plugin.javascript.navig.Link;

/**
 * Created by codecadet on 08/06/2018.
 */
public class Square implements KeyboardHandler {

    private Rectangle smallRectangle;
    private Cell cell;
    private int col;
    private int row;
    private int width;
    private int height;


    public Square(int col, int row, int width, int height) {
        this.row = row;
        this.col = col;
        this.width = width;
        this.height = height;

        smallRectangle = new Rectangle(row, col, width, height);
        smallRectangle.setColor(Color.MAGENTA);
        smallRectangle.fill();

        initKeyboard();
    }

    public int getCol() {
        return col;
    }

    public int getRow() {
        return row;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    private void initKeyboard() {

        Keyboard keyboard = new Keyboard(this);

        KeyboardEvent left = new KeyboardEvent();
        left.setKey(KeyboardEvent.KEY_LEFT);
        left.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        KeyboardEvent right = new KeyboardEvent();
        right.setKey(KeyboardEvent.KEY_RIGHT);
        right.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        KeyboardEvent up = new KeyboardEvent();
        up.setKey(KeyboardEvent.KEY_UP);
        up.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        KeyboardEvent down = new KeyboardEvent();
        down.setKey(KeyboardEvent.KEY_DOWN);
        down.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        keyboard.addEventListener(left);
        keyboard.addEventListener(right);
        keyboard.addEventListener(up);
        keyboard.addEventListener(down);
    }

    public void moveRight() {
        smallRectangle.translate(25, 0);
    }

    public void moveLeft() {
        smallRectangle.translate(-25, 0);
    }

    public void moveUp() {
        smallRectangle.translate(0, -25);
    }

    public void moveDown() {
        smallRectangle.translate(0, 25);
    }


    public void keyPressed(KeyboardEvent keyboardEvent) {

        switch (keyboardEvent.getKey()) {
            case KeyboardEvent.KEY_LEFT:
                moveLeft();
                break;

            case KeyboardEvent.KEY_RIGHT:
                moveRight();
                break;

            case KeyboardEvent.KEY_UP:
                moveUp();
                break;

            case KeyboardEvent.KEY_DOWN:
                moveDown();
                break;
        }

            /*case KeyboardEvent.KEY_M:
                smallRectangle.setColor(Color.MAGENTA);
                smallRectangle.fill();
                break;

            case KeyboardEvent.KEY_B:
                smallRectangle.setColor(Color.BLUE);

                break;

            case KeyboardEvent.KEY_G:
                smallRectangle.setColor(Color.GREEN);

                break;

            case KeyboardEvent.KEY_P:
                smallRectangle.setColor(Color.BLACK);

                break;

            case KeyboardEvent.KEY_SPACE:
                smallRectangle.fill();
                break;*/

    }


    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {
    }
}


