package com.tronipm.festivaldeinvernodegaranhuns_fig.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.tronipm.festivaldeinvernodegaranhuns_fig.R;
import com.tronipm.festivaldeinvernodegaranhuns_fig.entidades.Restaurante;

import java.util.ArrayList;

public class RestauranteActivity extends AppCompatActivity {
    private ArrayList<Restaurante> arrayRestaurante = null;
    private ListviewAdapterRestaurante novoadapter;
    private ListView novoListview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurante);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        try {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);

            setTitle("Restaurantes");
        } catch (Exception e) {
        }

        novoListview = (ListView) findViewById(R.id.listviewitem);

        if (arrayRestaurante == null) {
            arrayRestaurante = MainActivity.db.restaurantes;
        }
        novoadapter = new ListviewAdapterRestaurante(this, arrayRestaurante);
        novoListview.setAdapter(novoadapter);

        novoListview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(RestauranteActivity.this, "Clicou no " + arrayRestaurante.get(i).nome
                        , Toast.LENGTH_SHORT).show();
            }
        });
    }

}
