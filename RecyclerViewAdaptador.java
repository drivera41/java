package com.example.myapplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerViewAdaptador extends RecyclerView.Adapter<RecyclerViewAdaptador.ComidaViewHolder> {

    public static class ComidaViewHolder extends RecyclerView.ViewHolder{

        private TextView nombre, descripcion;
        private ImageView fotoComida;

        public ComidaViewHolder(View itemView) {
            super(itemView);
            nombre = (TextView)itemView.findViewById(R.id.txtComida);
            descripcion = (TextView)itemView.findViewById(R.id.txtComida);
            fotoComida = (ImageView)itemView.findViewById(R.id.imgComida);


        }

    }

    public List<Comida_Modelo> comidaLista;

    public RecyclerViewAdaptador(List<Comida_Modelo> comidaLista) {
        this.comidaLista = comidaLista;
    }

    public ComidaViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_comida, parent, false);
        ComidaViewHolder viewHolder = new ComidaViewHolder(view);
        return viewHolder;
    }
    public void onBindViewHolder (ComidaViewHolder holder, int position){
        holder.nombre.setText(comidaLista.get(position).getNombre());
        holder.descripcion.setText(comidaLista.get(position).getDescripcion());
        holder.fotoComida.setImageResource(comidaLista.get(position).getImagen());

    }
    public int getItemCount (){
        return comidaLista.size();

    }
}

