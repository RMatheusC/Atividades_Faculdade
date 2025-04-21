package com.example.aplicativocarro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.aplicativocarro.domain.Abastecimento;
import com.example.aplicativocarro.domain.AbastecimentoDAO;
import com.example.aplicativocarro.domain.Carro;
import com.example.aplicativocarro.domain.CarroDao;

public class AbastecimentoActivity extends AppCompatActivity {

    private EditText placa;
    private EditText valor;
    private EditText tipo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abastecimento);
        valor= findViewById(R.id.valor);
        tipo= findViewById(R.id.tipo);
        placa= findViewById(R.id.placa_abastecimento);
    }

    /**
     * @param view
     */
    public void listagem(View view){

        Intent it = new Intent(AbastecimentoActivity.this,ListarAbastecimentoActvity.class);
        startActivityForResult(it,121);
    }
    /**
     * @param view
     */
    public  void salvarAbastecimento(View view){
        Abastecimento abs = new Abastecimento();
        abs.setPlaca_veiculo(placa.getText().toString());
        abs.setValor(Integer.parseInt(valor.getText().toString()));
        abs.setTipo(tipo.getText().toString());
        AbastecimentoDAO.salvar(abs);
        System.out.println(AbastecimentoDAO.getDados());
        super.onBackPressed();
    }
    /**
     * @param view
     */
    public void voltar(View view){
        super.onBackPressed();
    }
}