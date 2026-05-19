package com.eeep.ocorrencia.model;

import java.util.ArrayList;
import java.util.List;

public class Usuario {

    private String nome;
    private String email;
    private String matricula;
    private String senha;

    // aluno
    private Integer numero;
    private Integer codigoTurma;
    private String  descricaoTurma;

    // professor
    private List<String> disciplinas = new ArrayList<>();

    public Usuario() {}

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getMatricula() { return matricula; }
    public void setMatricula(String matricula) { this.matricula = matricula; }

    public String getSenha() { return senha; }
    public void setSenha(String senha) { this.senha = senha; }

    public Integer getNumero() { return numero; }
    public void setNumero(Integer numero) { this.numero = numero; }

    public Integer getCodigoTurma() { return codigoTurma; }
    public void setCodigoTurma(Integer codigoTurma) { this.codigoTurma = codigoTurma; }

    public String getDescricaoTurma() { return descricaoTurma; }
    public void setDescricaoTurma(String descricaoTurma) { this.descricaoTurma = descricaoTurma; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public List<String> getDisciplinas() { return disciplinas; }
    public void setDisciplinas(List<String> disciplinas) { this.disciplinas = disciplinas; }
}
