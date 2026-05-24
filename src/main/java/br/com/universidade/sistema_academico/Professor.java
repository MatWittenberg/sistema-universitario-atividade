package br.com.universidade.sistema_academico;

import java.util.ArrayList;
import java.util.List;

public class Professor extends Pessoa {
    private String titulacao;
    private double salario;
    private String areaAtuacao;
    private List<Disciplina> disciplinasMinistradas;

    public Professor(String nome, String cpf, String matriculaInstitucional, String titulacao, double salario,
                     String areaAtuacao) {
        super(nome, cpf, matriculaInstitucional);
        this.titulacao = titulacao;
        this.salario = salario;
        this.areaAtuacao = areaAtuacao;
        this.disciplinasMinistradas = new ArrayList<>();
    }

    public void adicionarDisciplina(Disciplina disciplina) {
        this.disciplinasMinistradas.add(disciplina);
    }

    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getAreaAtuacao() {
        return areaAtuacao;
    }

    public void setAreaAtuacao(String areaAtuacao) {
        this.areaAtuacao = areaAtuacao;
    }

    public List<Disciplina> getDisciplinasMinistradas() {
        return disciplinasMinistradas;
    }
}