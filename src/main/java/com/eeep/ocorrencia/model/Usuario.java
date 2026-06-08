package com.eeep.ocorrencia.model;

public class Usuario {

    private String email;
    private String senha;
    private String nome;
    private String matricula;

    // ALUNO
    private Integer numero;
    private Integer codigoTurma;
    private String descricaoTurma;

    private AlunoTeste aluno;
    private ProfessorTeste professor;

    public Usuario() {
    }

    // CONSTRUTOR ALUNO
    public Usuario(
            String nome,
            String email,
            String matricula,
            String senha,
            Integer numero,
            Integer codigoTurma,
            String descricaoTurma) {

        this.nome = nome;
        this.email = email;
        this.matricula = matricula;
        this.senha = senha;

        this.numero = numero;
        this.codigoTurma = codigoTurma;
        this.descricaoTurma = descricaoTurma;

        this.aluno = new AlunoTeste(
                nome,
                email,
                senha,
                numero,
                matricula,
                codigoTurma,
                descricaoTurma
        );
    }

    // CONSTRUTOR PROFESSOR
    public Usuario(
            String nome,
            String email,
            String senha,
            String matricula,
            String disciplina) {

        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.matricula = matricula;

        this.professor = new ProfessorTeste(
                nome,
                email,
                senha,
                disciplina,
                matricula
        );
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
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

    public Integer getCodigoTurma() {
        return codigoTurma;
    }

    public void setCodigoTurma(Integer codigoTurma) {
        this.codigoTurma = codigoTurma;
    }

    public String getDescricaoTurma() {
        return descricaoTurma;
    }

    public void setDescricaoTurma(String descricaoTurma) {
        this.descricaoTurma = descricaoTurma;
    }

    public AlunoTeste getAluno() {
        return aluno;
    }

    public void setAluno(AlunoTeste aluno) {
        this.aluno = aluno;
    }

    public ProfessorTeste getProfessor() {
        return professor;
    }

    public void setProfessor(ProfessorTeste professor) {
        this.professor = professor;
    }
}