package com.tronipm.festivaldeinvernodegaranhuns_fig.entidades;

/**
 * Created by Mateus on 20/07/2017.
 * For project FestivaldeInvernodeGaranhuns-FIG. <https://github.com/TroniPM/AppFig>
 * Contact: <paulomatew@gmail.com>
 */

public class PoloProgramacao {
    public String nome, horario, local;
    public int diaId;

    public PoloProgramacao(String nome, String horario, String local, int diaId) {
        this.nome = nome;
        this.horario = horario;
        this.local = local;
        this.diaId = diaId;
    }
}
