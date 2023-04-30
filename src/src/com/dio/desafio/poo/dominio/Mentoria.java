package com.dio.desafio.poo.dominio;

import java.time.LocalDate;

public class Mentoria {
    String ttulo;
    String descricao;
    LocalDate data;

    public Mentoria() {
    }

    public String getTtulo() {
        return ttulo;
    }

    public void setTtulo(String ttulo) {
        this.ttulo = ttulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Mentorias{" +
                "ttulo='" + ttulo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", data=" + data +
                '}';
    }
}

