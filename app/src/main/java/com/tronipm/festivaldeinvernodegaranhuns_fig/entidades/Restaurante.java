package com.tronipm.festivaldeinvernodegaranhuns_fig.entidades;

/**
 * Created by Mateus on 19/07/2017.
 * For project FestivaldeInvernodeGaranhuns-FIG. <https://github.com/TroniPM/AppFig>
 * Contact: <paulomatew@gmail.com>
 */

public class Restaurante {
    public int id = 0;
    public double latitude, longitude;
    public String nome, telefone, endereco;

    public Restaurante(String nome, String endereco, String telefone, double latitude, double longitude) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.latitude = latitude;
        this.longitude = longitude;
    }
}
