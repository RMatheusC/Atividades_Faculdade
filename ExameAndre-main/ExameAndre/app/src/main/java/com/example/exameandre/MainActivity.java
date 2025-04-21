package com.example.exameandre;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rc;

    private List<Dog> listacao = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rc = findViewById(R.id.RecyView);
        criar();

        Adaptador adaptador = new Adaptador(this.listacao);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
        rc.setLayoutManager(layoutManager);
        rc.setHasFixedSize(true);
        rc.addItemDecoration(new DividerItemDecoration(this, LinearLayout.VERTICAL));
        rc.setAdapter(adaptador);
    }

    private void criar() {
        Dog Cachorro = new Dog("Crystal", "Rottweiler", "Feminino");
        this.listacao.add(Cachorro);

        Cachorro = new Dog("Jade", "YorkShire", "Feminino");
        this.listacao.add(Cachorro);

        Cachorro = new Dog("Cacau", "YorkShire", "Feminino");
        this.listacao.add(Cachorro);

        Cachorro = new Dog("Atena", "Rusky Siberiano", "Feminino");
        this.listacao.add(Cachorro);

        Cachorro = new Dog("Zeus", "Rusky Siberiano", "Masculino");
        this.listacao.add(Cachorro);

        Cachorro = new Dog("Zappy", "Pinscher ", "Masculino");
        this.listacao.add(Cachorro);

        
    }


}