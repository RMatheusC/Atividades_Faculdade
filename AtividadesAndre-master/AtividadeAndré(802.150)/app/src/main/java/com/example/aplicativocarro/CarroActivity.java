package com.example.aplicativocarro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.aplicativocarro.domain.Carro;
import com.example.aplicativocarro.domain.CarroDao;

public class CarroActivity extends AppCompatActivity {

    private EditText nome;
    private EditText ano;
    private EditText placa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carro);
        nome= findViewById(R.id.nome);
        ano= findViewById(R.id.ano);
        placa= findViewById(R.id.placa_abastecimento);
    }

    /**
     * @param view
     */
    public void listagemIr(View view){

        Intent it = new Intent(CarroActivity.this,ListarCarrosActvity.class);
        startActivityForResult(it,121);
    }

    /**
     * @param view
     */
    public  void salvarVeiculo(View view){
        Carro carro = new Carro();
        carro.setNome(nome.getText().toString());
        carro.setAno(Integer.parseInt(ano.getText().toString()));
        carro.setPlaca(placa.getText().toString());
        CarroDao.salvar(carro);
        System.out.println(CarroDao.getDados());
        super.onBackPressed();
    }

    /**
     * @param view
     */
    public  void excluirVeiculo(View view){
        Intent it = new Intent(CarroActivity.this,ExcluirCarroActivity.class);
        startActivityForResult(it,121);
    }

    /**
     * @param view
     */
    public  void editarVeiculo(View view){
        Intent it = new Intent(CarroActivity.this,EditarCarroActivity.class);
        startActivityForResult(it,121);
    }
    /**
     * @param view
     */
    public void voltar(View view){
        super.onBackPressed();
    }
}