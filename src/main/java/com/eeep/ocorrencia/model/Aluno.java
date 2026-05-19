package com.eeep.ocorrencia.model;


public class Aluno {

    private String matricula;

    private Integer numero;
    private String nome;

    private Turma turma;

    public Aluno() {}

    public Aluno(Integer codigoTurma, String descricaoTurma,
                 String matricula, Integer numero, String nome) {
        this.turma = new Turma(codigoTurma, descricaoTurma);
        this.matricula = matricula;
        this.numero = numero;
        this.nome = nome;
    }

    public String getMatricula() { return matricula; }
    public void setMatricula(String matricula) { this.matricula = matricula; }

    public Integer getNumero() { return numero; }
    public void setNumero(Integer numero) { this.numero = numero; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public Turma getTurma() { return turma; }
    public void setTurma(Turma turma) { this.turma = turma; }

    public Integer getCodigoTurma() { return turma != null ? turma.getCodigo() : null; }
    public String getDescricaoTurma() { return turma != null ? turma.getDescricao() : null; }

    @Override
    public String toString() {
        return "Aluno{matricula='" + matricula + "', numero=" + numero +
                ", nome='" + nome + "', turma=" + turma + '}';
    }
}
