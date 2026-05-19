package com.eeep.ocorrencia.model;


public class Professor {

    private String matricula;
    private String nome;
    private String disciplina;
    private String email;

    public Professor() {}

    public Professor(String matricula, String nome, String disciplina, String email) {
        this.matricula = matricula;
        this.nome = nome;
        this.disciplina = disciplina;
        this.email = email;
    }

    public String getMatricula() { return matricula; }
    public void setMatricula(String matricula) { this.matricula = matricula; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getDisciplina() { return disciplina; }
    public void setDisciplina(String disciplina) { this.disciplina = disciplina; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Matricula: " + matricula);
        System.out.println("Disciplina: " + disciplina);
        System.out.println("Email: " + email);
    }
}
