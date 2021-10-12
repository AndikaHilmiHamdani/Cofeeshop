package com.android.cofeeshop;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class MainActivity extends AppCompatActivity {
    ImageButton imgKopi2, imgKopi3, imgKopi4,imgKopi5,imgKopi6, searchButton;
    ImageView imgKopi1;
    CardView cardCappucino, cardLate,cardAmericano;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgKopi1 = (ImageView) findViewById(R.id.imgKopi1);
        imgKopi2 = (ImageButton) findViewById(R.id.imgKopi2);
        imgKopi3 = (ImageButton) findViewById(R.id.imgKopi3);
        imgKopi4 = (ImageButton) findViewById(R.id.imgKopi4);
        imgKopi5 = (ImageButton) findViewById(R.id.imgKopi5);
        imgKopi6 = (ImageButton) findViewById(R.id.imgKopi6);

        cardCappucino =  findViewById(R.id.cardCappuccino);
        cardCappucino.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Cappucino.class);
                startActivity(intent);
            }
        });

        cardLate =  findViewById(R.id.cardLate);
        cardLate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Latte.class);
                startActivity(intent);
            }
        });

        cardAmericano =  findViewById(R.id.cardAmericano);
        cardAmericano.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,AmericanoActivity.class);
                startActivity(intent);
            }
        });

        imgKopi2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Latte.class);

                startActivity(intent);
            }
        });
//        imgKopi3.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(MainActivity.this, Americano.class);
//
//                startActivity(intent);
//            }
//        });

        imgKopi4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Cappucino.class);

                startActivity(intent);
            }
        });

        imgKopi5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Latte.class);

                startActivity(intent);
            }
        });
//        imgKopi6.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(MainActivity.this, Americano.class);
//
//                startActivity(intent);
//            }
//        });

//        searchButton.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View v) {
//                TODO Auto-generated method stub
//                moveTaskToBack(true);
//
//                //membuat method tombol keluar dari aplikasi
//
//            }
//        });
    }

}