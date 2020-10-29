package com.moosejaw.pathfinder.gui.utils;
import com.moosejaw.pathfinder.alg.cells.Cell;
import com.moosejaw.pathfinder.alg.cells.CellType;

import javafx.scene.paint.Color;

public class Rectangles {
    /**
     * Class containing helper/utility functions for the rectangles representing
     * 'cells' within the GUI. For utilities regarding the Cell objects used in
     * the algorithm itself, they are located in com.moosejaw.pathfinder.alg.cells.CellUtils.
     */
    public static Color getRectangleColour(Cell c) {
        Color ret = Color.WHITE;
        switch(c.getType()) {
            case EMPTY:
                ret = Color.BLUE;
                break;
            case WALL:
                ret = Color.BLACK;
                break;
            case START:
                ret = Color.GREEN;
                break;
            case GOAL:
                ret = Color.RED;
                break;
        }
        return ret;
    }

    /**
    public static int[] getRectangleSize() {
        return int[];
    }

     **/
}
