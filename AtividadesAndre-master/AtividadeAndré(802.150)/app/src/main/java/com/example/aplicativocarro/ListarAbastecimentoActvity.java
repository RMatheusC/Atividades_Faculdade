package com.example.aplicativocarro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.aplicativocarro.domain.Abastecimento;
import com.example.aplicativocarro.domain.AbastecimentoDAO;
import com.example.aplicativocarro.domain.Carro;
import com.example.aplicativocarro.domain.CarroDao;

public class ListarAbastecimentoActvity extends AppCompatActivity {

    private ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listar_abastecimento_actvity);
        lv = (ListView) findViewById(R.id.listaAbastecimento);
        ArrayAdapter<Abastecimento> arrayAdapter = new ArrayAdapter<Abastecimento>(this, android.R.layout.simple_list_item_1, AbastecimentoDAO.getDados());
        lv.setAdapter(arrayAdapter);
    }

    /**
     * @param view
     */
    public void voltar(View view){
        super.onBackPressed();
    }
}