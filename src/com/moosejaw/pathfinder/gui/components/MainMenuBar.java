package com.moosejaw.pathfinder.gui.components;

import javafx.scene.layout.StackPane;
import javafx.scene.control.*;

public class MainMenuBar extends Component {
    public MainMenuBar() {
        // Set Pane
        this.p = new StackPane();

        // Controls
        MenuBar menuBar = new MenuBar();
        Menu fileMenu = new Menu("File");
        Menu helpMenu = new Menu("Help");
        MenuItem aboutItem = new MenuItem("About");

        // Building
        helpMenu.getItems().add(aboutItem);
        menuBar.getMenus().add(fileMenu);
        menuBar.getMenus().add(helpMenu);
        this.p.getChildren().add(menuBar);
    }
}
