package br.com.universidade.sistema_academico;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/alunos")
@CrossOrigin(origins = "*")
public class AlunoController {

    @GetMapping
    public Aluno buscarAluno() {

        Aluno aluno = new Aluno(
                "Matheus",
                "123.456.789-00",
                "2023001",
                "Ciência da Computação",
                3,
                "A, B, A",
                95.5,
                12
        );

        return aluno;
    }
}