package com.example.lunchpad;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn1 = (Button) this.findViewById(R.id.button);
        final MediaPlayer mp1 = MediaPlayer.create(this, R.raw.sound1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp1.start();
            }
        });

        Button btn2 = (Button) this.findViewById(R.id.button2);
        final MediaPlayer mp2 = MediaPlayer.create(this, R.raw.sound2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp2.start();
            }
        });

        Button btn3 = (Button) this.findViewById(R.id.button3);
        final MediaPlayer mp3 = MediaPlayer.create(this, R.raw.sound3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp3.start();
            }
        });

        Button btn4 = (Button) this.findViewById(R.id.button4);
        final MediaPlayer mp4 = MediaPlayer.create(this, R.raw.sound4);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp4.start();
            }
        });

        Button btn5 = (Button) this.findViewById(R.id.button5);
        final MediaPlayer mp5 = MediaPlayer.create(this, R.raw.sound5);
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp5.start();
            }
        });

        Button btn6 = (Button) this.findViewById(R.id.button6);
        final MediaPlayer mp6 = MediaPlayer.create(this, R.raw.sound6);
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp6.start();
            }
        });

        Button btn7 = (Button) this.findViewById(R.id.button7);
        final MediaPlayer mp7 = MediaPlayer.create(this, R.raw.sound7);
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp7.start();
            }
        });

        Button btn8 = (Button) this.findViewById(R.id.button8);
        final MediaPlayer mp8 = MediaPlayer.create(this, R.raw.sound8);
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp8.start();
            }
        });

    }
}