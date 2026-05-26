package com.fintrack.app;

import javafx.application.Application;
import javafx.stage.Stage;

/**
 * Main application entry point for FinTrack
 */
public class MainApp extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("FinTrack - Financial Tracking");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
