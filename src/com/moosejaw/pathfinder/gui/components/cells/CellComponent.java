package com.moosejaw.pathfinder.gui.components.cells;

import com.moosejaw.pathfinder.alg.cells.Cell;
import com.moosejaw.pathfinder.gui.utils.Rectangles;

import javafx.scene.shape.Rectangle;

public class CellComponent {
    /**
     * Contains the GUI interface for the Cell as it is represented to the user.
     * It is composed of a specific Cell object property, passed into the constructor,
     * and a component property of type javafx Rectangle.
     *
     * This class essentially 'bridges the gap' between the visual representation
     * of a cell, and its background logic in com.moosejaw.pathfinder.alg.cells.Cell
     */
    private final double l = 5;
    private Cell cell;
    private Rectangle rect = new Rectangle();


    public CellComponent(Cell c) {
        /**
         * Constructor for the CellComponent class.
         * @param c A Cell object. In practice, this parameter is passed directly from
         *          the Cell object instantiated inside the 2-D ArrayList representing
         *          the 2-D space.
         */
        // Assign the cell properties
        this.cell = c;

        // Set rectangle component properties
        this.getRect().setHeight(l);
        this.getRect().setWidth(l);

        // Set the initial fill colour
        this.getRect().setFill(Rectangles.getRectangleColour(this.cell));
    }

    public Rectangle getRect() {
        /** Getter for the javafx Rectangle component property. */
        return rect;
    }
}
