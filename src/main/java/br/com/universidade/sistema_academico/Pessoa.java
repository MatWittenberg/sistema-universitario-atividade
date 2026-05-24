package br.com.universidade.sistema_academico;

public class Pessoa {
    private String nome;
    private String cpf;
    private String matriculaInstitucional;

    public Pessoa(String nome, String cpf, String matriculaInstitucional) {
        this.nome = nome;
        this.cpf = cpf;
        this.matriculaInstitucional = matriculaInstitucional;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getMatriculaInstitucional() {
        return matriculaInstitucional;
    }

    public void setMatriculaInstitucional(String matriculaInstitucional) {
        this.matriculaInstitucional = matriculaInstitucional;
    }
}