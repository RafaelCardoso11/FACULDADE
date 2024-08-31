package Atividade;

import java.time.LocalDate;

/**
 * Desafio02
 */
public class Desafio02 {

    public static void main(String[] args) {
        Tarefa tarefa = new Tarefa("Estudar", "Estudar Java", "Alta", LocalDate.now(), new Categoria("Estudo"));

        tarefa.exibirDetalhes();
    }
}