package com.tronipm.festivaldeinvernodegaranhuns_fig.entidades;

/**
 * Created by Mateus on 19/07/2017.
 * For project FestivaldeInvernodeGaranhuns-FIG.
 * Contact: <paulomatew@gmail.com>
 */

public class Artista {
    public int id = 0, diaId = 0, palcoId = 0;
    public String nome, horario, link;
    public int image = 0;

    public Artista() {
    }

    public Artista(String nome, String horario, int diaId, int palcoId) {
        this.nome = nome;
        this.horario = horario;
        this.diaId = diaId;
        this.palcoId = palcoId;
    }
}
