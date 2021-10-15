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

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private KopiCardAdapter kopiCardAdapter;
    private ArrayList<KopiModel> kopiArrayList;
    CardView cardCappucino, cardLate,cardAmericano;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getKopi();
        recyclerView = findViewById(R.id.recyclerView);
        kopiCardAdapter = new KopiCardAdapter(this,kopiArrayList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(layoutManager);

        recyclerView.setAdapter(kopiCardAdapter);

    }

    private void getKopi() {
        kopiArrayList = new ArrayList<>();
        kopiArrayList.add(new KopiModel("Americano","4.7","18.000",R.drawable.kopi2));
        kopiArrayList.add(new KopiModel("Cappucino","4.6","17.000",R.drawable.kopi3));
    }


}