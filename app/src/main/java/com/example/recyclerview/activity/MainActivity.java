package com.example.recyclerview.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.recyclerview.R;
import com.example.recyclerview.adapter.Adapter;
import com.example.recyclerview.model.Filme;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<Filme> listaFilmes = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        //Listagem de filmes
        this.criarFilmes();


        //Configurar adapter
        Adapter adapter = new Adapter( listaFilmes );


        //Configurar RecyclerView
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(adapter);

        //Criar metodo para cadastrar filmes


        private void criarFilmes() {
            Filme filme = new Filme("titulo1","genero","ano");
            this.listaFilmes.add( filme );

            filme = new Filme("titulo2","genero","ano");
            this.listaFilmes.add( filme );

            filme = new Filme("titulo3","genero","ano");
            this.listaFilmes.add( filme );

            filme = new Filme("titulo4","genero","ano");
            this.listaFilmes.add( filme );

            filme = new Filme("titulo5","genero","ano");
            this.listaFilmes.add( filme );

            filme = new Filme("titulo6","genero","ano");
            this.listaFilmes.add( filme );

            filme = new Filme("titulo7","genero","ano");
            this.listaFilmes.add( filme );

            filme = new Filme("titulo8","genero","ano");
            this.listaFilmes.add( filme );

            filme = new Filme("titulo9","genero","ano");
            this.listaFilmes.add( filme );
        }
    }
}
