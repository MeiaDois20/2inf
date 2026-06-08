package com.eeep.ocorrencia.model;

import java.time.LocalDate;

public class Ocorrencia {

    private Integer id;

    private AlunoTeste aluno;

    private String disciplina;

    private ProfessorTeste professor;

    private String motivo;
    private LocalDate data;
    private String lugar;

    public Ocorrencia() {}

    public Ocorrencia(AlunoTeste aluno, String disciplina, ProfessorTeste professor,
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

    public AlunoTeste getAluno() { return aluno; }
    public void setAluno(AlunoTeste aluno) { this.aluno = aluno; }

    public String getDisciplina() { return disciplina; }
    public void setDisciplina(String disciplina) { this.disciplina = disciplina; }

    public ProfessorTeste getProfessor() { return professor; }
    public void setProfessor(ProfessorTeste professor) { this.professor = professor; }

    public String getMotivo() { return motivo; }
    public void setMotivo(String motivo) { this.motivo = motivo; }

    public LocalDate getData() { return data; }
    public void setData(LocalDate data) { this.data = data; }

    public String getLugar() { return lugar; }
    public void setLugar(String lugar) { this.lugar = lugar; }
}
