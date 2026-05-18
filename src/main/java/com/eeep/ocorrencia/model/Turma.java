package com.eeep.ocorrencia.model;

public class Turma {

    private Integer codigo;
    private String descricao;

    public Turma() {
    }

    public Turma(int codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Turma{" +
                "codigo=" + codigo +
                ", descricao='" + descricao + '\'' +
                '}';
    }
}
