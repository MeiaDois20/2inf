package com.eeep.ocorrencia.model;

public class Aluno {

    private String matricula;
    private Integer numero;
    private String nome;

    private final Turma turma;

    public Aluno(String turma, String matricula, Integer numero, String nome) {
        this.turma = new Turma();
        this.turma.setDescricao(turma);
        this.matricula = matricula;
        this.numero = numero;
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Turma getTurma() {
        return turma;
    }
}
