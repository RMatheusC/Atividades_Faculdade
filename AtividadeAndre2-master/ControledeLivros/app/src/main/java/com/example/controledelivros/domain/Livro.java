package com.example.controledelivros.domain;

import java.io.Serializable;

public class Livro implements Serializable
{
    private String titulo;
    private String autor;
    private String ano;
    private String estado;
    private String pagina;

    public Livro() {
    }

    public Livro( String titulo, String autor, String ano, String estado, String pagina) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.estado = estado;
        this.pagina = pagina;
    }


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPagina() {
        return pagina;
    }

    public void setPagina(String pagina) {
        this.pagina = pagina;
    }
}
