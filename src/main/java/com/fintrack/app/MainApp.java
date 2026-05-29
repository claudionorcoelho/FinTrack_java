package com.fintrack.app;

import javafx.application.Application;
import javafx.stage.Stage;

/**
 * Classe principal de entrada da aplicação FinTrack
 * Estende Application do JavaFX para criar uma aplicação gráfica
 */
public class MainApp extends Application {

    /**
     * Método chamado quando a aplicação inicia
     * Configura a janela principal e seus componentes iniciais
     * 
     * @param primaryStage A janela principal (palco) da aplicação
     */
    @Override
    public void start(Stage primaryStage) {
        // Define o título da janela principal
        primaryStage.setTitle("FinTrack - Financial Tracking");
        
        // Exibe a janela principal na tela
        primaryStage.show();
    }

    /**
     * Método main - ponto de entrada do programa Java
     * Lança a aplicação JavaFX
     * 
     * @param args Argumentos de linha de comando (não utilizados)
     */
    public static void main(String[] args) {
        // Inicia a aplicação JavaFX
        launch(args);
    }
}
