package com.example.aplicativocarro.domain;

import java.util.ArrayList;
import java.util.List;

public class AbastecimentoDAO {
    private static List<Abastecimento> dados = new ArrayList<>();
    private AbastecimentoDAO(){
    }
    public static  void salvar(Abastecimento abs){
        dados.add(abs);
    }
    public static  void remove(Abastecimento abs){
        dados.remove(abs);
    }
    public static List getDados(){
        return dados;
    }
}
