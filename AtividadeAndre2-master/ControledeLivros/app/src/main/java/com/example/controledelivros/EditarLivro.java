package com.example.controledelivros;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.controledelivros.domain.Livro;
import com.google.firebase.FirebaseApp;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class EditarLivro extends AppCompatActivity {

    private FirebaseDatabase db;
    DatabaseReference reference;
    private final Integer OK_TELA_CADASTR0=201;
    Livro livroParametro;

    private AlertDialog alerta;
    private EditText titulo;
    private EditText autor;
    private EditText ano;
    private EditText estado;
    private EditText pagina;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_editar_livro);

        MainActivity main = new MainActivity();
        livroParametro = (Livro) getIntent().getSerializableExtra("ParamentroLivro");;



        titulo = findViewById(R.id.tituloEditar);
        titulo.setText(livroParametro.getTitulo());
        titulo.setEnabled(false);

        autor = findViewById(R.id.autorEditar);
        autor.setText(livroParametro.getAutor());

        ano = findViewById(R.id.anoEditar);
        ano.setText(livroParametro.getAno());

        estado = findViewById(R.id.estadoEditar);
        estado.setText(livroParametro.getEstado());
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
        pagina = findViewById(R.id.paginaEditar);
        pagina.setText(livroParametro.getPagina());

        IniciarFirebase();
    }

    private void IniciarFirebase()
    {
        FirebaseApp.initializeApp(this);
        db = FirebaseDatabase.getInstance();
        reference = db.getReference();
    }

    public void EditarLivro(View view)
    {
        MainActivity main = new MainActivity();
        Livro novo = new Livro();
        novo.setTitulo(titulo.getText().toString());
        novo.setAutor(autor.getText().toString());
        novo.setAno(ano.getText().toString());
        novo.setEstado(estado.getText().toString());
        novo.setPagina(pagina.getText().toString());
        reference.child("Livro").child(novo.getTitulo()).setValue(novo);
        Toast.makeText(getApplicationContext(),"Editado com Sucesso", Toast.LENGTH_SHORT).show();
        Intent it = new Intent(EditarLivro.this,MainActivity.class);//cria a intent
        startActivityForResult(it,OK_TELA_CADASTR0);//inicia nova activity
    }


}