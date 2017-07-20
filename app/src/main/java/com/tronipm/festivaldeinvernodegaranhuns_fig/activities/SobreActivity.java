package com.tronipm.festivaldeinvernodegaranhuns_fig.activities;

import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import com.tronipm.festivaldeinvernodegaranhuns_fig.R;

public class SobreActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sobre);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        try {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);

            setTitle(this.getResources().getString(R.string.title_activity_sobre));
        } catch (Exception e) {
        }

        PackageInfo pInfo = null;
        String version = "";
        try {
            pInfo = this.getPackageManager().getPackageInfo(this.getPackageName(), 0);
        } catch (Exception e) {
        }
        try {
            version = pInfo.versionName;
        } catch (Exception e) {
            version = "...";
        }

        TextView label = (TextView) findViewById(R.id.versao);
        label.setText(version);
    }

}
