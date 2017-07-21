package com.tronipm.festivaldeinvernodegaranhuns_fig.entidades;

import java.util.ArrayList;

/**
 * Created by Mateus on 20/07/2017.
 * For project FestivaldeInvernodeGaranhuns-FIG. <https://github.com/TroniPM/AppFig>
 * Contact: <paulomatew@gmail.com>
 */

public class Polo {
    public int id = 0;
    public String nome, local;
    public ArrayList<PoloProgramacao> programacoes = new ArrayList<>();

    public Polo(String nome, String local) {
        this.nome = nome;
        this.local = local;
    }
}
