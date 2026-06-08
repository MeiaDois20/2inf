package com.eeep.ocorrencia.model;

public class AlunoTeste {

    private String nome;
    private String email;
    private String senha;
    private Integer numero;
    private String matricula;

    private TurmaTeste turma;

    public AlunoTeste() {
    }

    public AlunoTeste(String nome,
                      String email,
                      String senha,
                      Integer numero,
                      String matricula,
                      Integer codigoTurma,
                      String descricaoTurma) {

        this.nome = nome;
        this.email = email;
        this.senha = email;
        this.numero = numero;
        this.matricula = matricula;
        this.turma = new TurmaTeste(codigoTurma, descricaoTurma);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public TurmaTeste getTurma() {
        return turma;
    }

    public void setTurma(TurmaTeste turma) {
        this.turma = turma;
    }

    public Integer getCodigoTurma() {
        return turma != null ? turma.getCodigo() : null;
    }

    public String getDescricaoTurma() {
        return turma != null ? turma.getDescricao() : null;
    }
}