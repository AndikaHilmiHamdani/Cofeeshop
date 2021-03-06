package com.android.cofeeshop;

import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.android.cofeeshop.adapter.SwipeRecyclerViewAdapter;
import com.android.cofeeshop.model.CoffeeModel;
import com.daimajia.swipe.util.Attributes;

import java.util.ArrayList;

public class CartActivity extends AppCompatActivity {
    private TextView tvEmptyTextView;
    private RecyclerView mRecyclerView;
    private ArrayList<CoffeeModel> mDataSet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setTitle("Cart List");

        tvEmptyTextView = (TextView) findViewById(R.id.empty_view);
        mRecyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mDataSet = new ArrayList<>();

        loadData();

        if(mDataSet.isEmpty()){
            mRecyclerView.setVisibility(View.GONE);
            tvEmptyTextView.setVisibility(View.VISIBLE);
        }else{
            mRecyclerView.setVisibility(View.VISIBLE);
            tvEmptyTextView.setVisibility(View.GONE);
        }

        SwipeRecyclerViewAdapter mAdapter = new SwipeRecyclerViewAdapter(this, mDataSet);

        ((SwipeRecyclerViewAdapter) mAdapter).setMode(Attributes.Mode.Single);

        mRecyclerView.setAdapter(mAdapter);

        mRecyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
                super.onScrollStateChanged(recyclerView, newState);
                Log.e("RecyclerView", "onScrollStateChanged");
            }
            @Override
            public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
                super.onScrolled(recyclerView, dx, dy);
            }
        });
    }
    public void loadData() {
            //mDataSet.add(new CoffeeModel("AMERICANO", "18K", "@drawable/kopi1"));
            mDataSet.add(new CoffeeModel("LATTE", "18K", "@drawable/kopi2"));
            mDataSet.add(new CoffeeModel("MACCHIATO", "20K", "@drawable/kopi3"));
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                onBackPressed();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}