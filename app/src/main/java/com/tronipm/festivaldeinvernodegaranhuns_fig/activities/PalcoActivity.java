package com.tronipm.festivaldeinvernodegaranhuns_fig.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.tronipm.festivaldeinvernodegaranhuns_fig.R;
import com.tronipm.festivaldeinvernodegaranhuns_fig.entidades.Dia;
import com.tronipm.festivaldeinvernodegaranhuns_fig.entidades.Palco;

import java.util.ArrayList;

/**
 * Created by Mateus on 19/07/2017.
 * For project FestivaldeInvernodeGaranhuns-FIG. <https://github.com/TroniPM/AppFig>
 * Contact: <paulomatew@gmail.com>
 */
public class PalcoActivity extends AppCompatActivity {

    private ListviewAdapterDia novoadapter;
    private ArrayList<Dia> arrayDias = null;
    private ListView novoListview;
    public static Palco palco = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_palco);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        try {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);

            setTitle(palco.nome.replace("Palco ", ""));
        } catch (Exception e) {
        }

        /*FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab_dia);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Compartilhar dia", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/

        novoListview = (ListView) findViewById(R.id.listviewitem);

        if (arrayDias == null) {
            arrayDias = palco.arrayDias;
        }
        novoadapter = new ListviewAdapterDia(this, arrayDias);
        novoListview.setAdapter(novoadapter);

        novoListview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                //Toast.makeText(PalcoActivity.this, "Clicou no " + i, Toast.LENGTH_SHORT).show();

                DiaActivity.dia = arrayDias.get(i);
                DiaActivity.palco = palco;

                Intent novaintent = new Intent(PalcoActivity.this, DiaActivity.class);
                PalcoActivity.this.startActivity(novaintent);
            }
        });
    }

    /*@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.act_main, menu);
        return true;
    }*/
}
