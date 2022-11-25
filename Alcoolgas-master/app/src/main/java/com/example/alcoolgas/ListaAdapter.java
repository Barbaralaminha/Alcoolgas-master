package com.example.alcoolgas;

import android.support.v7.widget.RecycleView;
import android.support.annotation.@NonNull;
import android.view.ViewGroup;
import android.vew.LayoutInflater;
import android.view.View;

public final class ListaAdapter extends RecycleView.Adapter<ListaAdapter>{

    private Context context;
    private ArrayList<Lista> itens;

    public ListaAdapter(Context context, ArrayList<Lista> itens (
            this.context = context;
            this.itens = itens;
    )

    @NonNull
    @Override

    public ListaViewHolder onCreateViewHolder (@NonNull ViewGroup parent, int typeView){
        View view = LayoutInflater.from(context).inflate(R.layout.lista_linha, parent, false);
        ListaViewHolder viewHolder = new ListaViewHolder(view)
        return viewHolder;
}
    @Override
    public void onBindViewHolder (@NonNull ListaViewHolder listaViewHolder, int position){

            Lista lista = itens.get(position);
            listaViewHolder.mecanico.setText(lista.getMecanico());
            listaViewHolder.contato.setText(lista.getContato());
        }

    }
    @Override
    public int getItemCount(){
    return itens.size();
    }

}





