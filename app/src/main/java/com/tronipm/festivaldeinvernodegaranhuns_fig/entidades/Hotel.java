package com.tronipm.festivaldeinvernodegaranhuns_fig.entidades;

/**
 * Created by Mateus on 19/07/2017.
 * For project FestivaldeInvernodeGaranhuns-FIG. <https://github.com/TroniPM/AppFig>
 * Contact: <paulomatew@gmail.com>
 */

public class Hotel {
    public int id = 0;
    public double tripadvisor = 0, booking = 0, trivago = 0, latitude, longitude;
    public String nome, telefone, endereco;

    public Hotel(String nome, String endereco, String telefone, double tripadvisor, double booking, double trivago, double latitude, double longitude) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.tripadvisor = tripadvisor;
        this.booking = booking;
        this.trivago = trivago;
        this.latitude = latitude;
        this.longitude = longitude;
    }
}
