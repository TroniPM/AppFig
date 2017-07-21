package com.tronipm.festivaldeinvernodegaranhuns_fig.entidades;

/**
 * Created by Mateus on 20/07/2017.
 * For project FestivaldeInvernodeGaranhuns-FIG. <https://github.com/TroniPM/AppFig>
 * Contact: <paulomatew@gmail.com>
 */

public class PontoTuristico {
    public int id = 0, imagem;
    public String nome, endereco;
    public double latitude, longitude;

    public PontoTuristico(String nome, String endereco, double latitude, double longitude, int imagem) {
        this.nome = nome;
        this.endereco = endereco;
        this.latitude = latitude;
        this.longitude = longitude;
        this.imagem = imagem;
    }
}
