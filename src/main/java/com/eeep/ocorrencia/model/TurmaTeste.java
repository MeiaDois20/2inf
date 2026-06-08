package com.eeep.ocorrencia.model;

public class TurmaTeste {

    private Integer codigo;

    private String descricao;

    public TurmaTeste() {}

    public TurmaTeste(Integer codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public Integer getCodigo() { return codigo; }
    public void setCodigo(Integer codigo) { this.codigo = codigo; }

    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }

    @Override
    public String toString() {
        return "Turma{codigo=" + codigo + ", descricao='" + descricao + "'}";
    }
}
