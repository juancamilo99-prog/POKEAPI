package org.example.pokeapi.api;

import com.google.gson.Gson;
import org.example.pokeapi.model.Atributos;
import java.io.IOException;
import java.net.URISyntaxException;

import static org.example.pokeapi.conection.GetJson.getJson;

public class APIController {
    String urlBase = "https://pokeapi.co/api/v2/";
    public Atributos obtenerDatos(String nombrePokemon){
        String urlDatos = urlBase+"pokemon/"+nombrePokemon;
        try {
            Gson gson = new Gson();
            String jsonPost = getJson(urlDatos);
            System.out.println("JSON recibido");
            return gson.fromJson(jsonPost, Atributos.class);
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
