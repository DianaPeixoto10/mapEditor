package org.academiadecodigo.bootcamp.Grid;

import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;

/**
 * Created by codecadet on 08/06/2018.
 */
public class Engine implements KeyboardHandler {

    Square square = new Square(0, 0, 25, 25);
    Grid grid = new Grid();

    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {
        if (square.getCol() == grid.getCol()-1
                && square.getRow() == grid.getRow()-1) {

            Keyboard keyboard = new Keyboard(this);

            KeyboardEvent paint = new KeyboardEvent();
            paint.setKey(KeyboardEvent.KEY_SPACE);
            paint.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

            keyboard.addEventListener(paint);

        }
    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

    }
}
