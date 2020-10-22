package com.moosejaw.pathfinder.gui.components;

import javafx.scene.layout.Pane;

public abstract class Component {
    public Pane p;

    public Pane getComponent() {
        /**
         * Returns the Pane property from one of this class's implementations.
         * Each implementation should declare and configure their own FX controls
         * and add them to their own class based on the
         * `javafx.scene.layout.Pane`, i.e. StackPane or BorderPane or something similar.
         *
         * @return  The Pane subtype (which should contain all of the components to render in the window.)
         */
        return this.p;
    }
}
