package com.example.ranyass.musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

public class Details extends AppCompatActivity {
    Integer song;
    TextView songTitle;
    TextView arteriesName;
    ImageView arteriesPic;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        arteriesName = findViewById(R.id.arteriesName);
        arteriesPic = findViewById(R.id.arteriesPic);
        Bundle extras = getIntent().getExtras();
        if(extras == null) {
            song= 0;
        } else {
            song= extras.getInt("position");
        }
        arteriesName.setText(Data.arteriesName[song]);
        arteriesPic.setImageResource(Data.profilepics[song]);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Intent intent = new Intent(getBaseContext(), NowPlaying.class);
        startActivity(intent);
        return super.onOptionsItemSelected(item);
    }
}
