package com.example.controledelivros;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.controledelivros.domain.AdapterLivros;
import com.example.controledelivros.domain.Livro;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseError;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.MutableData;
import com.google.firebase.database.Transaction;

import java.util.List;

public class CadastrarLivvro extends AppCompatActivity {

    private FirebaseDatabase db;
    DatabaseReference reference;
    private final Integer OK_TELA_CADASTR0=201;


    private EditText titulo;
    private EditText autor;
    private EditText ano;
    private EditText estado;
    private EditText pagina;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastrar_livvro);

        titulo = findViewById(R.id.tituloCadastro);
        autor = findViewById(R.id.autorCadastro);
        ano = findViewById(R.id.anoCadastro);
        estado = findViewById(R.id.estadoCadastro);
        estado.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {


            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (!estado.getText().toString().equals("Lendo"))
                {
                    pagina.setText("");
                    pagina.setEnabled(false);
                }
                else
                {
                    pagina.setText("");
                    pagina.setEnabled(true);
                }
            }
        });
        pagina = findViewById(R.id.paginaCadastro);

        IniciarFirebase();
    }

    private void IniciarFirebase()
    {
        FirebaseApp.initializeApp(this);
        db = FirebaseDatabase.getInstance();
        reference = db.getReference();
    }

    public void SalvarLivro(View view)
    {
        Livro novo = new Livro();
        novo.setTitulo(titulo.getText().toString());
        novo.setAutor(autor.getText().toString());
        novo.setAno(ano.getText().toString());
        novo.setEstado(estado.getText().toString());
        novo.setPagina(pagina.getText().toString());
        reference.child("Livro").child(novo.getTitulo()).setValue(novo);
        Toast.makeText(getApplicationContext(),"Cadastrado com Sucesso", Toast.LENGTH_SHORT).show();
        Intent it = new Intent(CadastrarLivvro.this,MainActivity.class);//cria a intent
        startActivityForResult(it,OK_TELA_CADASTR0);//inicia nova activity
    }

}