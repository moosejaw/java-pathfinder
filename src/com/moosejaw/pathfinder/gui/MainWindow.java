package com.moosejaw.pathfinder.gui;

import com.moosejaw.pathfinder.alg.cells.Cell;
import com.moosejaw.pathfinder.alg.cells.CellUtils;
import com.moosejaw.pathfinder.gui.components.CellPane;
import com.moosejaw.pathfinder.gui.components.MainMenuBar;
import com.moosejaw.pathfinder.gui.components.MainStatusBar;
import com.moosejaw.pathfinder.gui.components.MainToolBar;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.layout.VBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.BorderPane;

import java.util.ArrayList;

public class MainWindow extends Application {
    private ArrayList<ArrayList<Cell>> cellSpace = CellUtils.generateCells(10, 10);

    @Override
    public void start(Stage primaryStage) {
        // Gather components
        // Top:
        VBox topPane = new VBox();
        MainMenuBar mb = new MainMenuBar();
        MainToolBar tb = new MainToolBar();
        topPane.getChildren().add(mb.getComponent());
        topPane.getChildren().add(tb.getComponent());

        // Center:
        // Generate the pane containing the cells
        CellPane centerPane = new CellPane(this.cellSpace);

        // Bottom:
        VBox bottomPane = new VBox();
        MainStatusBar sb = new MainStatusBar();
        bottomPane.getChildren().add(sb.getComponent());

        // Declare root pane and add components
        BorderPane root = new BorderPane();
        root.setTop(topPane);
        root.setCenter(centerPane.getComponent());
        root.setBottom(bottomPane);

        // Declare scene and render window
        Scene scene = new Scene(root, 1024, 1024);
        primaryStage.setTitle("Pathfinder");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
