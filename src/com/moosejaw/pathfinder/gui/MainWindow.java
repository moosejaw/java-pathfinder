package com.moosejaw.pathfinder.gui;
import com.moosejaw.pathfinder.gui.components.MainMenuBar;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;

public class MainWindow extends Application {
    @Override
    public void start(Stage primaryStage) {
        // Gather components
        MainMenuBar mb = new MainMenuBar();

        // Declare root pane and add components
        BorderPane root = new BorderPane();
        root.setTop(mb.getComponent());

        // Declare scene and render window
        Scene scene = new Scene(root, 300, 250);
        primaryStage.setTitle("Pathfinder");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
