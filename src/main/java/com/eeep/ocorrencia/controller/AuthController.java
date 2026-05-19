package com.eeep.ocorrencia.controller;

import com.eeep.ocorrencia.model.Usuario;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class AuthController {

    private static final List<Usuario> alunos = new ArrayList<>();
    private static final List<Usuario> professores = new ArrayList<>();

    // selecionar o tipo da conta(se é prof ou aluno)
    @GetMapping("/")
    public String selecao() {
        return "selecao";
    }

    // login do aluno
    @GetMapping("/login/aluno")
    public String loginAlunoForm(Model model) {
        model.addAttribute("usuario", new Usuario());
        return "login-aluno";
    }

    @PostMapping("/login/aluno")
    public String loginAluno(@ModelAttribute Usuario usuario,
                             HttpSession session, Model model) {
        boolean ok = alunos.stream()
                .anyMatch(u -> u.getEmail().equals(usuario.getEmail())
                        && u.getSenha().equals(usuario.getSenha()));
        if (ok) {
            session.setAttribute("perfil", "ALUNO");
            session.setAttribute("usuarioLogado", usuario.getEmail());
            return "redirect:/home";
        }
        model.addAttribute("erro", "E-mail ou senha inválidos.");
        return "login-aluno";
    }

    // login do professor

    @GetMapping("/login/professor")
    public String loginProfessorForm(Model model) {
        model.addAttribute("usuario", new Usuario());
        return "login-professor";
    }

    @PostMapping("/login/professor")
    public String loginProfessor(@ModelAttribute Usuario usuario,
                                 HttpSession session, Model model) {
        // verifica se o email e senha estão corretas
        boolean ok = professores.stream()
                .anyMatch(u -> u.getEmail().equals(usuario.getEmail())
                            && u.getSenha().equals(usuario.getSenha()));
        if (ok) {
            session.setAttribute("perfil", "PROFESSOR");
            session.setAttribute("usuarioLogado", usuario.getEmail());
            return "redirect:/home";
        }
        model.addAttribute("erro", "E-mail ou senha inválidos.");
        return "login-professor";
    }

    // cadastro dos alunos
    @GetMapping("/cadastro/aluno")
    public String cadastroAlunoForm(Model model) {
        model.addAttribute("usuario", new Usuario());
        return "cadastro-aluno";
    }

    @PostMapping("/cadastro/aluno")
    public String cadastroAluno(@ModelAttribute Usuario usuario, Model model) {
        boolean existe = alunos.stream()
                .anyMatch(u -> u.getEmail().equals(usuario.getEmail()));
        if (existe) {
            model.addAttribute("erro", "E-mail já cadastrado.");
            return "cadastro-aluno";
        }
        alunos.add(usuario);
        return "redirect:/login/aluno?cadastrado=true";
    }

    // cadastro professor

    @GetMapping("/cadastro/professor")
    public String cadastroProfessorForm(Model model) {
        model.addAttribute("usuario", new Usuario());
        return "cadastro-professor";
    }

    @PostMapping("/cadastro/professor")
    public String cadastroProfessor(@ModelAttribute Usuario usuario, Model model) {
        boolean existe = professores.stream()
                .anyMatch(u -> u.getEmail().equals(usuario.getEmail()));
        if (existe) {
            model.addAttribute("erro", "E-mail já cadastrado.");
            return "cadastro-professor";
        }
        professores.add(usuario);
        return "redirect:/login/professor?cadastrado=true";
    }

    // home / logout

    @GetMapping("/home")
    public String home(HttpSession session, Model model) {
        String logado = (String) session.getAttribute("usuarioLogado");
        String perfil = (String) session.getAttribute("perfil");
        if (logado == null) return "redirect:/";
        model.addAttribute("usuarioLogado", logado);
        model.addAttribute("perfil", perfil);
        return "home";
    }

    @GetMapping("/logout")
    public String logout(HttpSession session) {
        session.invalidate();
        return "redirect:/";
    }
}
