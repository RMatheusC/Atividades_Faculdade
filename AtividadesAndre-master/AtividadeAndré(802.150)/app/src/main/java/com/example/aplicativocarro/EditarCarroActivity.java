package com.example.aplicativocarro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.aplicativocarro.domain.Carro;
import com.example.aplicativocarro.domain.CarroDao;

public class EditarCarroActivity extends AppCompatActivity {

    private EditText placa_proc;
    private EditText nome_ed;
    private EditText ano_ed;
    private EditText placa_ed;
    int posi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_editar_carro);
        placa_proc = findViewById(R.id.placa_procurar);
        nome_ed = findViewById(R.id.nome_editar);
        ano_ed = findViewById(R.id.ano_editar);
        placa_ed = findViewById(R.id.placa_editar);
    }

    /**
     * @param view
     */
    public  void procurarVeiculo(View view){
       CarroDao.procurar(placa_proc.getText().toString(),placa_ed,nome_ed,ano_ed,posi);
    }

    /**
     * @param view
     */
    public  void editarVeiculo(View view){
        CarroDao.editar(nome_ed.getText().toString(),placa_ed.getText().toString(),ano_ed.getText().toString(),posi);
        System.out.println(CarroDao.getDados());
        super.onBackPressed();
    }
}