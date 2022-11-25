package com.example.alcoolgas;

import android.support.annotation.@NonNull;
import android.support.v7.widget.RecycleView;
import android.view.View;
import.android.widget.TextView;

public class Lista extends RecycleView.ViewHolder {

  TextView mecanico, contato;

  public ListaViewHolder(@NonNull View itemView) {
    super(itemView)
    mecanico = itemView.findViewById(R.id.mecanico);
    contato = itemView.findViewById(R.id.contato);
  }
}