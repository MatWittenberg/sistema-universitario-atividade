package br.com.universidade.sistema_academico;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/professores")
@CrossOrigin(origins = "*")
public class ProfessorController {

    @GetMapping
    public Professor buscarProfessor() {
        Professor professor = new Professor(
                "Tonin",
                "987.654.321-11",
                "1999001",
                "Doutorado",
                8500.00,
                "Engenharia de Software"
        );

        Disciplina disciplina = new Disciplina(
                "Linguagens de Programação",
                "03.INF.2026",
                60
        );

        professor.adicionarDisciplina(disciplina);

        return professor;
    }
}