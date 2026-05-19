package com.eeep.ocorrencia.controller;

import com.eeep.ocorrencia.model.Aluno;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class AlunoController {

    @GetMapping("/cadastroIsrael")
    public String abrirFormulario(Model model) {
        List<Aluno> alunos = new ArrayList<>();

        alunos.add(new Aluno(1, "1° Infor", "321.322.44-54", 32,"Ariel Nyerson"));
        alunos.add(new Aluno(2, "3° Agro", "321.322.44-54", 22,"Leison"));
        alunos.add(new Aluno(3, "2° ADM", "321.322.44-54", 12,"Marcos"));
        alunos.add(new Aluno(4, "1° Ser", "321.322.44-54", 42,"Sou eu"));

        model.addAttribute("listaAlunos", alunos);
        return "cadastroIsrael";

    }
}
