package com.example.controledelivros.domain;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.controledelivros.R;

import java.util.List;

public class AdapterLivros extends RecyclerView.Adapter<AdapterLivros.MyViewHolder>
{
    private List<Livro> lista;

    public AdapterLivros(List<Livro> lista) {
        this.lista = lista;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemLista = LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_livros,parent, false);

        return new MyViewHolder(itemLista);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Livro livro = lista.get(position);
        holder.titulo.setText(livro.getTitulo());
        holder.ano.setText(livro.getAno());
        holder.autor.setText((livro.getAutor()));
        holder.estado.setText((livro.getEstado()));
        holder.pagina.setText((livro.getPagina()));
    }

    @Override
    public int getItemCount() {
        return lista.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder
    {
        TextView titulo;
        TextView ano;
        TextView autor;
        TextView estado;
        TextView pagina;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            titulo = itemView.findViewById(R.id.titulo);
            ano = itemView.findViewById(R.id.ano);
            autor = itemView.findViewById(R.id.autor);
            estado = itemView.findViewById(R.id.estado);
            pagina = itemView.findViewById(R.id.pagina);
        }
    }
}
