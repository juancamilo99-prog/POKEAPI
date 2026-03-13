package org.example.pokeapi;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {// Permite crear la priimera ventana -> Se añade una ventana fxml
        //Carga la ventan gráfica en el FXMLLoader
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("main-poke.fxml"));
        //crea la escena y le asocia la parte grafica
        Scene scene = new Scene(fxmlLoader.load());
        // pone la escena en la ventana
        stage.setTitle("Bienvenidos a la POKEAPI");
        //pone el titulo en la ventana
        stage.setScene(scene);
        //muestra la ventana
        stage.show();
    }
}
