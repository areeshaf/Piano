package com.example.hp.pianoapp;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    MediaPlayer mediaPlayer;


    public void playTone(View view){

        Button buttonPressed=(Button)view;

        Log.i("Button Pressed",buttonPressed.getTag().toString());
        String tappedTone=buttonPressed.getTag().toString();

        mediaPlayer=MediaPlayer.create(this,getResources().getIdentifier(tappedTone,"raw",getPackageName()));
        mediaPlayer.start();
    }
//    public void playToneb(View view){
//
//        mediaPlayer=MediaPlayer.create(this,R.raw.b);
//        mediaPlayer.start();
//
//    }
//    public void playTonec(View view){
//
//        mediaPlayer=MediaPlayer.create(this,R.raw.c);
//        mediaPlayer.start();
//
//    }
//    public void playToned(View view){
//
//        mediaPlayer=MediaPlayer.create(this,R.raw.d);
//        mediaPlayer.start();
//
//    }
//    public void playTonee(View view){
//
//        mediaPlayer=MediaPlayer.create(this,R.raw.e);
//        mediaPlayer.start();
//
//    }
//    public void playTonef(View view){
//
//        mediaPlayer=MediaPlayer.create(this,R.raw.f);
//        mediaPlayer.start();
//
//    }
//    public void playToneg(View view){
//
//        mediaPlayer=MediaPlayer.create(this,R.raw.g);
//        mediaPlayer.start();
//
//    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
}
