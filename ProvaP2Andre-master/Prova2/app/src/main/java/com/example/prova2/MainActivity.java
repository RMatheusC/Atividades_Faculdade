package com.example.prova2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.FirebaseApp;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {


    private FirebaseDatabase db;
    DatabaseReference reference;

    EditText senha;
    EditText email;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        senha = findViewById(R.id.IdSenha);
        email = findViewById(R.id.idEmail);
        IniciarFirebase();

    }

    private void IniciarFirebase()
    {
        db = FirebaseDatabase.getInstance();
        db.setPersistenceEnabled(true);
        FirebaseApp.initializeApp(this);
        reference = db.getReference();
    }
    public void CadastrarPessoa(View view)
    {
        Pessoa humano = new Pessoa();
        humano.setSenha(Integer.parseInt(senha.getText().toString()));
        humano.setEmail(email.getText().toString());
        reference.child("Pessoa").child(humano.getEmail()).setValue(humano);
        Toast.makeText(getApplicationContext(),"Cadastrado com Sucesso", Toast.LENGTH_SHORT).show();
    }
}

