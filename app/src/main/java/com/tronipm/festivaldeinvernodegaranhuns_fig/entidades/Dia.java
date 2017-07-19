package com.tronipm.festivaldeinvernodegaranhuns_fig.entidades;

import java.util.ArrayList;

/**
 * Created by Mateus on 19/07/2017.
 * For project FestivaldeInvernodeGaranhuns-FIG.
 * Contact: <paulomatew@gmail.com>
 */

public class Dia {
    public int id = 0, palcoId = 0, image = 0;
    public String dataCompleta, diaDaSemana;
    public ArrayList<Artista> arrayArtista = new ArrayList<>();

    public Dia(String dataCompleta, String diaDaSemana, int id, int image) {
        this.dataCompleta = dataCompleta;
        this.diaDaSemana = diaDaSemana;
        this.id = id;
        this.image = image;
    }

    public Dia() {
    }
}
