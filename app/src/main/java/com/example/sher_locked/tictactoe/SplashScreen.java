package com.example.sher_locked.tictactoe;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class SplashScreen extends AppCompatActivity
{
    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);
        //Intent i=getIntent();
        final MediaPlayer m= MediaPlayer.create(this,R.raw.popeye);
        m.start();
        //try { Thread.sleep(5000); } catch(InterruptedException e) { e.printStackTrace(); }
        b=(Button)findViewById(R.id.button11);
        b.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(SplashScreen.this, MainActivity.class);
                        m.stop();
                        SplashScreen.this.startActivity(i);
                    }
                }
        );
        //this.finish();
    }
}
