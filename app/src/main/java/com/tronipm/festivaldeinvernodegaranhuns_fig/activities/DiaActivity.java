package com.tronipm.festivaldeinvernodegaranhuns_fig.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import com.tronipm.festivaldeinvernodegaranhuns_fig.R;
import com.tronipm.festivaldeinvernodegaranhuns_fig.entidades.Artista;
import com.tronipm.festivaldeinvernodegaranhuns_fig.entidades.Dia;
import com.tronipm.festivaldeinvernodegaranhuns_fig.entidades.Palco;

import java.util.ArrayList;

/**
 * Created by Mateus on 19/07/2017.
 * For project FestivaldeInvernodeGaranhuns-FIG. <https://github.com/TroniPM/AppFig>
 * Contact: <paulomatew@gmail.com>
 */
public class DiaActivity extends AppCompatActivity {
    public static Dia dia = null;
    //public static String palcoNome = null;
    public static Palco palco = null;

    private ListviewAdapterHorario novoadapter;
    private ArrayList<Artista> arrayArtistas = null;
    private ListView novoListview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dia);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        try {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);

            setTitle(dia.diaDaSemana + " (" + dia.dataCompleta + ")");
        } catch (Exception e) {
        }


        /*FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/

        ((TextView) findViewById(R.id.textViewPalcoNomeDentroDoDia))
                .setText(palco.nome);


        novoListview = (ListView) findViewById(R.id.listviewitem);

        if (arrayArtistas == null) {
            arrayArtistas = new ArrayList<>();
            for (int i = 0; i < MainActivity.db.artistas.size(); i++) {
                Artista a = MainActivity.db.artistas.get(i);
                if (a.diaId == dia.id && a.palcoId == palco.id) {
                    arrayArtistas.add(a);
                }
            }

        }
        novoadapter = new ListviewAdapterHorario(this, arrayArtistas);
        novoListview.setAdapter(novoadapter);

        /*novoListview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                //Toast.makeText(PalcoActivity.this, "Clicou no " + i, Toast.LENGTH_SHORT).show();

                DiaActivity.dia = arrayArtistas.get(i);
                DiaActivity.palcoNome = palco.nome;
                Intent novaintent = new Intent(PalcoActivity.this, DiaActivity.class);
                PalcoActivity.this.startActivity(novaintent);
            }
        });*/
    }

}
