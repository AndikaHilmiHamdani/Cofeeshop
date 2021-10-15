package com.android.cofeeshop;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.text.BreakIterator;
import java.util.ArrayList;

public class KopiCardAdapter extends RecyclerView.Adapter<KopiCardAdapter.CardViewHolder>{
    Context context;

    private ArrayList<KopiModel> listCard;
    public KopiCardAdapter(Context context,ArrayList<KopiModel> listCard) {
        this.listCard = listCard;
        this.context = context;
    }
    @NonNull
    @Override
    public CardViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.kopi_list, parent,false);
        return new CardViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CardViewHolder holder, int position) {
        holder.tvTitle.setText(listCard.get(position).getTitle());
        holder.tvPrice.setText(listCard.get(position).getPrice());
        holder.tvRating.setText(listCard.get(position).getRating());
        holder.pict.setImageResource(listCard.get(position).getImage());
    }

    @Override
    public int getItemCount() {
        return listCard.size();
    }

    public class CardViewHolder extends RecyclerView.ViewHolder {
        private TextView tvTitle,tvPrice,tvRating;
        private ImageView pict;

        public CardViewHolder(@NonNull View itemView) {
            super(itemView);

            tvTitle = itemView.findViewById(R.id.tvTitle);
            tvPrice = itemView.findViewById(R.id.tvPrice);
            tvRating = itemView.findViewById(R.id.tvRating);
            pict = itemView.findViewById(R.id.imgKopi);
        }
    }
}
