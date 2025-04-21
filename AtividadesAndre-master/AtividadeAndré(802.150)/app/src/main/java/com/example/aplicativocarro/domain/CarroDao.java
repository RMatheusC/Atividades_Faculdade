package com.example.aplicativocarro.domain;

import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;

public class CarroDao {
    private static List<Carro> dados = new ArrayList<>();
    private CarroDao(){
    }
    public static  void salvar(Carro carro){
        dados.add(carro);
    }
    public static  void remove(String placa){
        for(int i =0; i < dados.size(); i++)
        {
            Carro c = dados.get(i);
            if(c.getPlaca().equals(placa))
            {
                dados.remove(c);
                break;
            }
        }
    }

    public static  void procurar(String placa_procurar,EditText nome_ed,EditText placa_ed,EditText ano_ed, int posi){
        for(int i =0; i < dados.size(); i++)
        {
            Carro c = dados.get(i);
            if(c.getPlaca().equals(placa_procurar))
            {
                nome_ed.setText(c.getNome());
                placa_ed.setText(c.getPlaca());
                ano_ed.setText(c.getAno().toString());
                posi = i;
                break;
            }
        }
    }

    public static  void editar(String nome_ed,String placa_ed,String ano_ed, int posi){
        Carro c = dados.get(posi);
        c.setNome(nome_ed);
        c.setPlaca(placa_ed);
        c.setAno(Integer.parseInt(ano_ed));
        dados.set(posi, c);
    }

    public static List getDados(){
        return dados;
    }
}
