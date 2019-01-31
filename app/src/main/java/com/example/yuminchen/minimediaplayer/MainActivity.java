package com.example.yuminchen.minimediaplayer;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private MediaPlayer mediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mediaPlayer = MediaPlayer.create(this, R.raw.yourcall);

        //find the play button view
        Button playButton = findViewById(R.id.play);

        //set on click listener on play button
        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(MainActivity.this, "Play", Toast.LENGTH_SHORT).show();
                mediaPlayer.start();
                mediaPlayer.setOnCompletionListener( new MediaPlayer.OnCompletionListener (){
                    public void onCompletion (MediaPlayer mp){

                        Toast.makeText(MainActivity.this, "completed", Toast.LENGTH_SHORT).show();
                        }
                } );
                }
        });

        //find the play button view
        Button pauseButton = (Button) findViewById(R.id.pause);

        //set on click listener on play button
        pauseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(MainActivity.this, "Pause", Toast.LENGTH_SHORT).show();
                mediaPlayer.pause();
            }
        });




    }
}
