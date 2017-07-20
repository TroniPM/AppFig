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
import com.tronipm.festivaldeinvernodegaranhuns_fig.entidades.Hospital;

import java.util.ArrayList;

public class HospitalActivity extends AppCompatActivity {
    private ArrayList<Hospital> arrayHospital = null;
    private ListviewAdapterHospital novoadapter;
    private ListView novoListview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hospital);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        try {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);

            setTitle("Hospitais");
        } catch (Exception e) {
        }

        novoListview = (ListView) findViewById(R.id.listviewitem);

        if (arrayHospital == null) {
            arrayHospital = MainActivity.db.hospitais;
        }
        novoadapter = new ListviewAdapterHospital(this, arrayHospital);
        novoListview.setAdapter(novoadapter);

        novoListview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(HospitalActivity.this, "Clicou no " + arrayHospital.get(i).nome
                        , Toast.LENGTH_SHORT).show();
            }
        });
    }

}
