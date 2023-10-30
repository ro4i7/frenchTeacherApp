package com.example.frenchteacherapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button blabtn, grebtn, purbtn, redbtn, yelbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        blabtn=findViewById(R.id.btn1);
        grebtn=findViewById(R.id.btn2);
        purbtn=findViewById(R.id.btn3);
        redbtn=findViewById(R.id.btn4);
        yelbtn=findViewById(R.id.btn5);

        blabtn.setOnClickListener(this);
        grebtn.setOnClickListener(this);
        purbtn.setOnClickListener(this);
        redbtn.setOnClickListener(this);
        yelbtn.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        int clickdBtnId=v.getId();
        if(clickdBtnId==R.id.btn4){
            PlaySounds(R.raw.red);
        }else if(clickdBtnId==R.id.btn5){
            PlaySounds(R.raw.yellow);
        }else if(clickdBtnId==R.id.btn3){
            PlaySounds(R.raw.purple);
        }else if(clickdBtnId==R.id.btn2){
            PlaySounds(R.raw.green);
        }else if(clickdBtnId==R.id.btn1){
            PlaySounds(R.raw.black);
        }
    }
    public void PlaySounds(int id){
        MediaPlayer mediaPlayer=MediaPlayer.create(
                this,
                id
        );
        mediaPlayer.start();
    }
}