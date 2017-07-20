package com.tronipm.festivaldeinvernodegaranhuns_fig.entidades;

import java.util.ArrayList;

/**
 * Created by Mateus on 19/07/2017.
 * For project FestivaldeInvernodeGaranhuns-FIG. <https://github.com/TroniPM/AppFig>
 * Contact: <paulomatew@gmail.com>
 */

public class Palco {
    public int id = 0;
    public String latitude, longitude, nome, descricao;
    public ArrayList<Dia> arrayDias = new ArrayList<>();
    public int image;

    public Palco() {
    }

    public Palco(String nome, String descricao, String latitude, String longitude, int id, int image) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.nome = nome;
        this.descricao = descricao;
        this.id = id;
        this.image = image;
    }
}
