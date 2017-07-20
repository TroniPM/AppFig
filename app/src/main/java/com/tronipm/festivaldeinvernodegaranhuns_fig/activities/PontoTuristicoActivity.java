package com.tronipm.festivaldeinvernodegaranhuns_fig.activities;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.tronipm.festivaldeinvernodegaranhuns_fig.R;
import com.tronipm.festivaldeinvernodegaranhuns_fig.entidades.PontoTuristico;

import java.util.ArrayList;

public class PontoTuristicoActivity extends AppCompatActivity {
    private ArrayList<PontoTuristico> arrayPTur = null;
    private ListviewAdapterPontoTuristico novoadapter;
    private ListView novoListview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ponto_turistico);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        try {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);

            setTitle("Pontos Turísticos");
        } catch (Exception e) {
        }

        novoListview = (ListView) findViewById(R.id.listviewitem);

        if (arrayPTur == null) {
            arrayPTur = MainActivity.db.pontosTuristicos;
        }
        novoadapter = new ListviewAdapterPontoTuristico(this, arrayPTur);
        novoListview.setAdapter(novoadapter);

        novoListview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(PontoTuristicoActivity.this, "Clicou no " + arrayPTur.get(i).nome
                        , Toast.LENGTH_SHORT).show();
            }
        });
    }

}
