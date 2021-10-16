package com.android.cofeeshop;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private KopiCardAdapter kopiCardAdapter;
    private List<KopiModel> kopiArrayList = new ArrayList<>();
    CardView cardCoffee, cardLate,cardAmericano;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cardCoffee = findViewById(R.id.cardCoffee);
        //get data
        getKopi();

        //define kopi recyclerview
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        kopiCardAdapter = new KopiCardAdapter(kopiArrayList);
        LinearLayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        mLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setAdapter(kopiCardAdapter);

    }

    private void getKopi() {
        kopiArrayList = new ArrayList<>();
        kopiArrayList.add(new KopiModel("Americano","4.7", "blabla",18000,R.drawable.kopi2));
        kopiArrayList.add(new KopiModel("Cappucino","4.6","abc",17000,R.drawable.kopi3));
        kopiArrayList.add(new KopiModel("Americano","4.7","tes",18000,R.drawable.kopi2));
        kopiArrayList.add(new KopiModel("Cappucino","4.6","y",17000,R.drawable.kopi3));
        kopiArrayList.add(new KopiModel("Americano","4.7","g",18000,R.drawable.kopi2));
        kopiArrayList.add(new KopiModel("Cappucino","4.6","o",17000,R.drawable.kopi3));
        kopiArrayList.add(new KopiModel("Americano","4.7","ok",18000,R.drawable.kopi2));
        kopiArrayList.add(new KopiModel("Cappucino","4.6","dh",17000,R.drawable.kopi3));
    }



}