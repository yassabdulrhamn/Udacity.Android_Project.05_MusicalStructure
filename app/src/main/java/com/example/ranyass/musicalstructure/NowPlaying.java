package com.example.ranyass.musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class NowPlaying extends AppCompatActivity {
Button listButton;
Button butDetails;
Button Store;
Integer song;
TextView songTitle;
ImageView songCover;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_playing);

        butDetails = findViewById(R.id.butDetails);
        listButton = findViewById(R.id.butList);
        Store = findViewById(R.id.butStore);
        songTitle = findViewById(R.id.texSongTitle);
        songCover = findViewById(R.id.imgCover);

        Bundle extras = getIntent().getExtras();
        if(extras == null) {
            song= 0;
        } else {
            song= extras.getInt("position");
        }

        songTitle.setText(Data.songs[song]);
        songCover.setImageResource(Data.covers[song]);


        listButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getBaseContext(), List_of_spngs.class);
                startActivity(intent);
            }
        });

        butDetails.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getBaseContext(), Details.class);
                intent.putExtra("position", song);
                startActivity(intent);
            }
        });

        Store.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getBaseContext(), store.class);
                startActivity(intent);
            }
        });
    }
}
