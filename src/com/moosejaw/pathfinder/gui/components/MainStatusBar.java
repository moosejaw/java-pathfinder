package com.moosejaw.pathfinder.gui.components;

import javafx.scene.layout.VBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.ToolBar;


// TODO: This doesn't appear in the main window and I don't know why?

public class MainStatusBar extends Component {
    public MainStatusBar() {
        // Set pane
        this.p = new VBox();

        ToolBar toolBar = new ToolBar();
        Label xFieldLabel = new Label("X:");
        TextField xField = new TextField();
        Label yFieldLabel = new Label("Y:");
        TextField yField = new TextField();

        xField.setMaxWidth(3.0);
        yField.setMaxWidth(3.0);

        //toolBar.setMaxHeight(10.0);
        toolBar.getItems().add(xFieldLabel);
        toolBar.getItems().add(xField);
        toolBar.getItems().add(yFieldLabel);
        toolBar.getItems().add(yField);
    }
}
