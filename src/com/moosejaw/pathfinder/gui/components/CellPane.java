package com.moosejaw.pathfinder.gui.components;

import java.util.ArrayList;

import com.moosejaw.pathfinder.alg.cells.Cell;
import com.moosejaw.pathfinder.gui.components.cells.CellComponent;

import javafx.scene.Group;
import javafx.scene.layout.Pane;

public class CellPane extends Component {
    /**
     * Pane containing the Cell subcomponent shapes. It is composed of the 'rect'
     * property from the getter of the CellComponent class in
     * com.moosejaw.pathfinder.gui.components.cells
     *
     * The p property in objects of this class is a VBox which contains several
     * HBox panes equivalent to the length dimension of the 2-D space. It is inserted
     * into the window instantly.
     *
     * This is also the sole GUI component which is built differently in
     * com.moosejaw.gui.MainWindow, as this component itself returns the Pane to
     * be implemented into the window. For the other components, their Panes are
     * declared and added to in MainWindow. This class still extends Component,
     * and its Pane is still accessed like the other components (with the getComponent()
     * method from the base class).
     */
    public CellPane(ArrayList<ArrayList<Cell>> cellArray) {
        this.p = new Pane();
        final double padding = 15.0;

        // Now, construct the pane itself by constructing CellComponents
        // for each Cell in the CellArray and adding them to the relevant
        // HBox
        for (int x=0; x < cellArray.size(); x++) {
            for (int y = 0; y < cellArray.get(x).size(); y++) {
                CellComponent c = new CellComponent(cellArray.get(x).get(y));

                // Important! The X and Y is generated HERE, not in CellComponent.
                c.getRect().setX((x * 10) + padding);
                c.getRect().setY((y * 10) + padding);
                this.p.getChildren().add(c.getRect());
            }

        }
    }
}
