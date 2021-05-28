package com.germany.recicleview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class PalabraAdapter extends  RecyclerView.Adapter< PalabraAdapter.PalabraHolder>{

            private ArrayList<String> listaPalabra;
            private Context contexto;
            private LayoutInflater inflater;

    public PalabraAdapter(ArrayList<String> listaPalabra, Context contexto) {

        this.listaPalabra = listaPalabra;
        this.contexto = contexto;
        this.inflater = LayoutInflater.from(this.contexto);

    }

    @NonNull
    @Override
    public PalabraHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View item = inflater.inflate(R.layout.palabraitem, parent, false);
        PalabraHolder holder = new PalabraHolder(item);
            return holder ;
    }

    @Override
    public void onBindViewHolder(@NonNull PalabraHolder holder, int position) {
        String palabra = listaPalabra.get(position);
        holder.txtItem.setText(palabra);

    }

    @Override
    public int getItemCount() {

        return listaPalabra.size();
    }


    class  PalabraHolder extends RecyclerView.ViewHolder{

        TextView txtItem;

        public PalabraHolder(@NonNull View itemView) {
            super(itemView);

            txtItem = itemView.findViewById(R.id.txtItem);
        }
    }
}
