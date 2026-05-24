package br.com.universidade.sistema_academico;

public class Aluno extends Pessoa {
    private String curso;
    private int periodoAtual;
    private HistoricoEscolar historicoEscolar;

    public Aluno(String nome, String cpf, String matriculaInstitucional, String curso, int periodoAtual, String notas,
                 double frequencia, int disciplinasConcluidas) {
        super(nome, cpf, matriculaInstitucional);
        this.curso = curso;
        this.periodoAtual = periodoAtual;
        this.historicoEscolar = new HistoricoEscolar(notas, frequencia, disciplinasConcluidas);
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getPeriodoAtual() {
        return periodoAtual;
    }

    public void setPeriodoAtual(int periodoAtual) {
        this.periodoAtual = periodoAtual;
    }

    public HistoricoEscolar getHistoricoEscolar() {
        return historicoEscolar;
    }
}