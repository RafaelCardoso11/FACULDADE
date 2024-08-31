package Atividade;

import java.time.LocalDate;

/**
 * Tarefa
 */
public class Tarefa {

    private String titulo;
    private String descricao;
    private String prioridade;
    private Categoria categoria;
    private LocalDate prazo;

    public Tarefa(String titulo, String descricao, String prioridade, LocalDate prazo, Categoria categoria) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.prioridade = prioridade;
        this.prazo = prazo;
        this.categoria = categoria;
    }

    public String getDescricao() {
        return descricao;
    }
    public String getTitulo() {
        return titulo;
    }
    public LocalDate getPrazo() {
        return prazo;
    }
    public String getPrioridade() {
        return prioridade;
    }

    public Categoria getCategoria() {
        return categoria;
    }
    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public void setPrazo(LocalDate prazo) {
        this.prazo = prazo;
    }
    public void setPrioridade(String prioridade) {
        this.prioridade = prioridade;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void exibirDetalhes(){
        System.out.println("Titulo: " + titulo);
        System.out.println("Descricao: " + descricao);
        System.out.println("Prioridade: " + prioridade);
        System.out.println("Prazo: " + prazo);
    }
    
}