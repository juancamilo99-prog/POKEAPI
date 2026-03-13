module org.example.pokeapi {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;
    requires static lombok;
    requires java.net.http;
    requires com.google.gson;


    opens org.example.pokeapi to javafx.fxml;
    opens org.example.pokeapi.model to com.google.gson;
    exports org.example.pokeapi;
}