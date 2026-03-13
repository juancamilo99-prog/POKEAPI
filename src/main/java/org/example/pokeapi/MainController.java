package org.example.pokeapi;


import com.google.gson.Gson;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
import org.example.pokeapi.api.APIController;
import org.example.pokeapi.model.Atributos;
import org.example.pokeapi.model.Stat;

import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable {
    //tener una variable por cada uno de los elementos del fxml

    @FXML
    private Text base_stat_attack;

    @FXML
    private Text base_stat_defense;

    @FXML
    private Text base_stat_hp;

    @FXML
    private Button buttonBuscar;

    @FXML
    private Text error;

    @FXML
    private ImageView front_default;

    @FXML
    private Text height;

    @FXML
    private Text name;

    @FXML
    private TextField textBuscar;

    APIController controller = new APIController();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        //todos los codigos que yo ponga aqui, se ejecuta nada mas cargar la parte fxml
        buttonBuscar.setOnAction(actionEvent -> searchPokemon());
    }

    public void searchPokemon() {
        try{
            Atributos atributos = controller.obtenerDatos(textBuscar.getText().toLowerCase().trim());
            limpiarVentana();
            if (atributos != null) {
                //nombre y altura
                name.setText(atributos.getName());
                height.setText(String.valueOf(atributos.getHeight()));
                //stats
                if (atributos.getStats() != null && atributos.getStats().length > 0) {
                    Stat[] stat = atributos.getStats();
                    base_stat_hp.setText(String.valueOf(stat[0].getBase_stat()));
                    base_stat_attack.setText(String.valueOf(stat[1].getBase_stat()));
                    base_stat_defense.setText(String.valueOf(stat[2].getBase_stat()));
                }

                if (atributos.getSprites() != null && atributos.getSprites().getFront_default() != null) {
                    //img
                    Image imageView = new Image(atributos.getSprites().getFront_default());
                    front_default.setImage(imageView);
                }
            }else {
                name.setText("No encontrado");
                height.setText("-");
                base_stat_hp.setText("-");
                base_stat_attack.setText("-");
                base_stat_defense.setText("-");
                front_default.setImage(null);
            }
        }catch (Exception e){
            limpiarVentana();
            error.setText("No se encontro el pokemon");
        }
    }

    public void limpiarVentana(){
        textBuscar.clear();

        name.setText("");
        height.setText("");
        base_stat_hp.setText("");
        base_stat_attack.setText("");
        base_stat_defense.setText("");
        error.setText("");
        front_default.setImage(null);
    }
}
