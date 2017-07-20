package com.tronipm.festivaldeinvernodegaranhuns_fig.activities;

import android.app.Notification;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ListView;

import com.tronipm.festivaldeinvernodegaranhuns_fig.R;
import com.tronipm.festivaldeinvernodegaranhuns_fig.entidades.Palco;
import com.tronipm.festivaldeinvernodegaranhuns_fig.repo.DataBase;

import java.util.ArrayList;

import br.com.goncalves.pugnotification.notification.PugNotification;

/**
 * Created by Mateus on 19/07/2017.
 * For project FestivaldeInvernodeGaranhuns-FIG. <https://github.com/TroniPM/AppFig>
 * Contact: <paulomatew@gmail.com>
 */
public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    //private SQLiteManager sqLiteManager = null;
    public static DataBase db = new DataBase();
    private ArrayList<Palco> arrayPalcos = null;
    private ListviewAdapterPalco novoadapter;
    private ListView novoListview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        try {
            setTitle(this.getResources().getString(R.string.title_activity_palco));
        } catch (Exception e) {
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        try {
            //getActionBar().setTitle("FIG");
            setTitle("FIG");
        } catch (Exception ex) {
        }

        novoListview = (ListView) findViewById(R.id.listviewitem);

        if (arrayPalcos == null) {
            arrayPalcos = db.palcos;
        }
        novoadapter = new ListviewAdapterPalco(this, arrayPalcos);
        novoListview.setAdapter(novoadapter);

        novoListview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                //Toast.makeText(MainActivity.this, "Clicou no " + i, Toast.LENGTH_SHORT).show();

                PalcoActivity.palco = db.palcos.get(i);
                Intent novaintent = new Intent(MainActivity.this, PalcoActivity.class);
                MainActivity.this.startActivity(novaintent);
            }
        });
    }

    public void populate() {


    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    /*@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.act_main, menu);
        return true;
    }*/

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_compartilhar) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_rest) {
            Intent novaintent = new Intent(MainActivity.this, RestauranteActivity.class);
            this.startActivity(novaintent);
            // Handle the camera action
        } else if (id == R.id.nav_hot) {
            Intent novaintent = new Intent(MainActivity.this, HotelActivity.class);
            this.startActivity(novaintent);
        } /*else if (id == R.id.nav_pontur) {
            Intent novaintent = new Intent(MainActivity.this, PontoTuristicoActivity.class);
            this.startActivity(novaintent);
        } */ else if (id == R.id.nav_mercado) {
            Intent novaintent = new Intent(MainActivity.this, MercadoActivity.class);
            this.startActivity(novaintent);
        } else if (id == R.id.nav_hosp) {
            Intent novaintent = new Intent(MainActivity.this, HospitalActivity.class);
            this.startActivity(novaintent);
        } else if (id == R.id.nav_contato) {
            //criarNotificacao("Festival de Inverno de Garanhuns", "Notificação do aplicativo... Não perca nada!");
            String url = "https://docs.google.com/forms/u/0/d/e/1FAIpQLSdmiz43BQ6kRLNays_jx75dPO4gYdzEksg7l5qwIslWGOaZwQ/viewform";
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(url));
            startActivity(i);
        } else if (id == R.id.nav_info) {
            Intent novaintent = new Intent(MainActivity.this, SobreActivity.class);
            this.startActivity(novaintent);
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    public void criarNotificacao(String titulo, String txt) {
        PugNotification.with(MainActivity.this).load()
                .title(titulo)
                .message(txt)
                .bigTextStyle("FIG")
                .smallIcon(R.mipmap.ic_launcher)
                .largeIcon(R.mipmap.ic_launcher)
                .flags(Notification.DEFAULT_ALL)
                .simple()
                .build();
    }
}
