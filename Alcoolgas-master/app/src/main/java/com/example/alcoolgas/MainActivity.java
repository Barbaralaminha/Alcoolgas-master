package com.example.alcoolgas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button buttoncomp;
    Button buttonrend;
    Button buttonlocal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttoncomp = findViewById(R.id.buttoncomp);
        buttonrend = findViewById(R.id.buttonrend);
        buttonlocal = findViewById(R.id.buttonlocal);

        buttoncomp.setOnClickListener(
                new View.OnClickListener() {

                    @Override
                    public void onClick(View v) {

                        Intent intent = new Intent(
                                getApplicationContext(),
                                CompActivity.class
                        );
                        startActivity(intent);
                    }
                });

        buttonrend.setOnClickListener(
                new View.OnClickListener() {

                    @Override
                    public void onClick(View v) {

                        Intent intent = new Intent(
                                getApplicationContext(),
                                RendActivity.class
                        );
                        startActivity(intent);
                    }
                });

        buttonlocal.setOnClickListener(
                new View.OnClickListener() {

                    @Override
                    public void onClick(View v) {

                        Intent intent = new Intent(
                                getApplicationContext(),
                                LocalActivity.class
                        );
                        startActivity(intent);
                    }
                });
    }



    private RecycleView recycle;
    private ListaAdapter adapter;
    private ArrayList<Lista> itens;

    @Override
    protected void onCreate(Bundle savedInstancedState) {
        super.OnCreaate (savedInstancedState);
        setContentView(R.layout.lista);
        recycle = findViewById(R.id.recycle);
        itens = new ArrayList<Lista>();
        itens.add(new Lista (mecanico: "Jorge", contato: "9996361945"));
        itens.add(new Lista (mecanico: "Carlos", contato: "998563214"));
        itens.add(new Lista (mecanico: "Joaquim", contato: "998547125"));
        adapter = new ListaAdapter (MainActivity.this, itens)
                RecycleView.LayoutManager layoutManager = new LinearLayoutManager(
                        MainActivity.this, LinearLayoutManager.VERTICAL, false);
        recycle.setLayoutManager(layoutManager);
        recycle.setAdapter(adapter);
    }
}







