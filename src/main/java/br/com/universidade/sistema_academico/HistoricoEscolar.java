package br.com.universidade.sistema_academico;

public class HistoricoEscolar {
    private String notas;
    private double frequencia;
    private int disciplinasConcluidas;

    public HistoricoEscolar(String notas, double frequencia, int disciplinasConcluidas) {
        this.notas = notas;
        this.frequencia = frequencia;
        this.disciplinasConcluidas = disciplinasConcluidas;
    }

    public String getNotas() {
        return notas;
    }

    public void setNotas(String notas) {
        this.notas = notas;
    }

    public double getFrequencia() {
        return frequencia;
    }

    public void setFrequencia(double frequencia) {
        this.frequencia = frequencia;
    }

    public int getDisciplinasConcluidas() {
        return disciplinasConcluidas;
    }

    public void setDisciplinasConcluidas(int disciplinasConcluidas) {
        this.disciplinasConcluidas = disciplinasConcluidas;
    }
}