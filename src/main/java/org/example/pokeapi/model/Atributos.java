package org.example.pokeapi.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Atributos {
    private long id;
    private String name;
    private long weight;
    private long height;
    private Sprites sprites;
    private Stat[] stats;
}
