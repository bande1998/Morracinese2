package com.example.studente.morracinese;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class Gioco extends AppCompatActivity {
    private int vr;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gioco);

        ImageButton sasso = (ImageButton) findViewById(R.id.s);
        ImageButton carta = (ImageButton) findViewById(R.id.c);
        ImageButton forbice = (ImageButton) findViewById(R.id.f);
        final TextView risultato;
        final ImageView v1;
        final ImageView v2;

        final Random random= new Random();


        risultato = (TextView) findViewById(R.id.v);
        v1 = findViewById(R.id.imageView);
        v2 = findViewById(R.id.imageView2);


        sasso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v1.setImageResource(R.drawable.sassocartaorbicecropped3);

                switch (vr = random.nextInt(3)) {
                    case 0:
                        v2.setImageResource(R.drawable.sassocartaorbicecropped3);
                        risultato.setText("pareggio");
                        break;
                    case 1:
                        v2.setImageResource(R.drawable.sassocartaorbicecropped1);
                        risultato.setText("hai perso...");
                        break;
                    case 2:
                        v2.setImageResource(R.drawable.sassocartaorbicecropped2);
                        risultato.setText("hai vinto!");
                        break;
                }
            }
        });
        carta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v1.setImageResource(R.drawable.sassocartaorbicecropped1);
                switch (vr = random.nextInt(3)) {
                    case 0:
                        v2.setImageResource(R.drawable.sassocartaorbicecropped3);
                        risultato.setText("hai vinto!");
                        break;
                    case 1:
                        v2.setImageResource(R.drawable.sassocartaorbicecropped1);
                        risultato.setText("pareggio");
                        break;
                    case 2:
                        v2.setImageResource(R.drawable.sassocartaorbicecropped2);
                        risultato.setText("hai perso...");
                        break;
                }


            }
        });
        forbice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v1.setImageResource(R.drawable.sassocartaorbicecropped2);
                switch (vr = random.nextInt(3)) {
                    case 0:
                        v2.setImageResource(R.drawable.sassocartaorbicecropped3);
                        risultato.setText("hai perso...");
                        break;
                    case 1:
                        v2.setImageResource(R.drawable.sassocartaorbicecropped1);
                        risultato.setText("hai vinto!");
                        break;
                    case 2:
                        v2.setImageResource(R.drawable.sassocartaorbicecropped2);
                        risultato.setText("pareggio");
                        break;
                }
            }
        });


    }

    }




