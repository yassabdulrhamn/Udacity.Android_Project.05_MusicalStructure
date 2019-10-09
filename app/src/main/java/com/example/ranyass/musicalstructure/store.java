package com.example.ranyass.musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

public class store extends AppCompatActivity {


    private GridView CountryGrid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_store);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        CountryGrid = (GridView) findViewById(R.id.gridview);
        CountryAdapter ca = new CountryAdapter(this,Data.songs);
        CountryGrid.setAdapter(ca);
        CountryGrid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v,
                                    int position, long id) {
                Toast.makeText(store.this, Data.songs[position] + "  Downloading...:",
                        Toast.LENGTH_SHORT).show();
            }

        });

    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Intent intent = new Intent(getBaseContext(), NowPlaying.class);
        startActivity(intent);
        return super.onOptionsItemSelected(item);
    }
}
