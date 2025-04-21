package com.example.aplicativocarro.domain;

public class Abastecimento {
    private String placa_veiculo;
    private String tipo;
    private Integer valor;

    public String getPlaca_veiculo() {
        return placa_veiculo;
    }

    public void setPlaca_veiculo(String placa_veiculo) {
        this.placa_veiculo = placa_veiculo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Integer getValor() {
        return valor;
    }

    public void setValor(Integer valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Placa: " + placa_veiculo +
                ", Valor: " + valor  +
                ", Tipo: " + tipo;
    }
}
