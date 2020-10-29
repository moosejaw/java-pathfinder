package com.moosejaw.pathfinder.alg.cells;

public class Cell {
    /**
     * This class contains the non-GUI components of a cell, such as weight,
     * the cell type, etc.
     */
    private int[] pos;
    private int weight;
    private CellType type = CellType.EMPTY;

    public void setWeight(int w) {
        /**
         * Sets the weight value of the cell.
         */
        this.weight = w;
    }

    public CellType getType() {
        return this.type;
    }

    public void setPos(int[] p) {
        this.pos = p;
    }

    public int[] getPos() {
        return this.pos;
    }
}
