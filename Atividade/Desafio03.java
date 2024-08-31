package Atividade;


import java.time.LocalDate;


public class Desafio03 {
    public static void main(String[] args) {
        Categoria categoria = new Categoria("Estudo");

        Tarefa tarefa = new Tarefa("Estudar", "Estudar Java", "Alta", LocalDate.now(), categoria);

        System.out.println("Tarefa: " + tarefa);
    }
}
