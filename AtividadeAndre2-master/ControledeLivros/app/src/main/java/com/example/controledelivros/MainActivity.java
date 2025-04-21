package com.example.controledelivros;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.example.controledelivros.domain.AdapterLivros;
import com.example.controledelivros.domain.Livro;
import com.example.controledelivros.domain.RecyclerItemClickListener;
import com.google.firebase.FirebaseApp;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    private FirebaseDatabase db;
    DatabaseReference reference;

    private RecyclerView ListaLivros;
    private final Integer OK_TELA_CADASTR0=201;
    public Livro livroEditar;


    public List<Livro> listaLivros = new ArrayList<>();;
    public int tamanho = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ListaLivros = findViewById(R.id.id_livros);
        IniciarFirebase();
        iniciarReciclerView();

    }

    private void IniciarFirebase()
    {
        db = FirebaseDatabase.getInstance();
        db.setPersistenceEnabled(true);
        FirebaseApp.initializeApp(this);
        reference = db.getReference();
    }

    public void iniciarReciclerView()
    {
        //configurar layout
        ListaLivros.removeAllViewsInLayout();
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
        ListaLivros.setLayoutManager(layoutManager);
        ListaLivros.setHasFixedSize(true);
        ListaLivros.addItemDecoration(new DividerItemDecoration(this, LinearLayout.VERTICAL));

        reference = FirebaseDatabase.getInstance().getReference().child("Livro");
        reference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

                for (DataSnapshot dataSnapshot1 : dataSnapshot.getChildren()) {
                    Livro l = dataSnapshot1.getValue(Livro.class);
                    listaLivros.add(l);
                }
                AdapterLivros adaptador = new AdapterLivros(listaLivros);
                ListaLivros.setAdapter(adaptador);

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
                Toast.makeText(MainActivity.this, "Opsss.... Something is wrong", Toast.LENGTH_SHORT).show();
            }
        });

        ListaLivros.addOnItemTouchListener(new RecyclerItemClickListener(getApplicationContext(), ListaLivros, new RecyclerItemClickListener.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                livroEditar = listaLivros.get(position);
                Intent it = new Intent(MainActivity.this,EditarLivro.class);//cria a intent
                it.putExtra("ParamentroLivro", livroEditar);
                startActivityForResult(it,OK_TELA_CADASTR0);//inicia nova activity
            }

            @Override
            public void onLongItemClick(View view, int position) {

            }

            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

            }
        }));
    }

    public void CadastrarLivros(View view)
    {
        Intent it = new Intent(MainActivity.this,CadastrarLivvro.class);//cria a intent
        startActivityForResult(it,OK_TELA_CADASTR0);//inicia nova activity
    }

}