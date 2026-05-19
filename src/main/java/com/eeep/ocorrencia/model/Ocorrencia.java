package com.eeep.ocorrencia.model;

import java.time.LocalDate;

public class Ocorrencia {

    private Integer id;

    private Aluno aluno;

    private String disciplina;

    private Professor professor;

    private String motivo;
    private LocalDate data;
    private String lugar;

    public Ocorrencia() {}

    public Ocorrencia(Aluno aluno, String disciplina, Professor professor,
                      String motivo, LocalDate data, String lugar) {
        this.aluno = aluno;
        this.disciplina = disciplina;
        this.professor = professor;
        this.motivo = motivo;
        this.data = data;
        this.lugar = lugar;
    }

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public Aluno getAluno() { return aluno; }
    public void setAluno(Aluno aluno) { this.aluno = aluno; }

    public String getDisciplina() { return disciplina; }
    public void setDisciplina(String disciplina) { this.disciplina = disciplina; }

    public Professor getProfessor() { return professor; }
    public void setProfessor(Professor professor) { this.professor = professor; }

    public String getMotivo() { return motivo; }
    public void setMotivo(String motivo) { this.motivo = motivo; }

    public LocalDate getData() { return data; }
    public void setData(LocalDate data) { this.data = data; }

    public String getLugar() { return lugar; }
    public void setLugar(String lugar) { this.lugar = lugar; }

    @Override
    public String toString() {
        return "Ocorrencia{id=" + id +
                ", aluno=" + (aluno != null ? aluno.getNome() : null) +
                ", disciplina='" + disciplina + '\'' +
                ", professor=" + (professor != null ? professor.getNome() : null) +
                ", motivo='" + motivo + '\'' +
                ", data=" + data +
                ", lugar='" + lugar + '\'' + '}';
    }
}
