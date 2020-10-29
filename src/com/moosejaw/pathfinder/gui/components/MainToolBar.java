package com.moosejaw.pathfinder.gui.components;

// TODO: Combobox in main toolbar once there is more than one algorithm in place

import javafx.geometry.Orientation;
import javafx.scene.layout.VBox;
import javafx.scene.control.Button;
import javafx.scene.control.ToolBar;
import javafx.scene.control.Separator;

public class MainToolBar extends Component {
    public MainToolBar() {
        // Controls
        ToolBar toolBar = new ToolBar();
        Button runButton = new Button("Run");

        // Building
        toolBar.getItems().add(runButton);
        toolBar.getItems().add(new Separator(Orientation.VERTICAL));


        // Set pane
        this.p = new VBox(toolBar);
    }


}
