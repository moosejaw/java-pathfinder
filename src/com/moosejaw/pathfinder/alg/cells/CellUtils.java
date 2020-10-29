package com.moosejaw.pathfinder.alg.cells;

import com.moosejaw.pathfinder.alg.cells.Cell;
import java.util.ArrayList;

public class CellUtils {
    public static ArrayList<ArrayList<Cell>> generateCells(int x, int y) throws IllegalArgumentException {
        /**
         * Generates a 2-D ArrayList of Cell objects.
         * @param x Integer containing the width of the 2-D space (must be positive)
         * @param y Integer containing the height of the 2-D space (must be positive)
         * @return 2-D nested ArrayList of Cell objects.
         */
        // Check args
        if (x < 0 || y < 0) {
            throw new IllegalArgumentException("The width and height values of the 2-D space must be positive numbers.");
        }

        // Build the return object
        ArrayList<ArrayList<Cell>> ret = new ArrayList<>(x);
        for (int i=0; i < x; i++) {
            ArrayList<Cell> sub = new ArrayList<>(y);
            for (int e=0; e < y; e++) {
                Cell c = new Cell();
                c.setPos(new int[] {i, e});
                sub.add(c);
            }
            ret.add(sub);
        }
        return ret;
    }
}
