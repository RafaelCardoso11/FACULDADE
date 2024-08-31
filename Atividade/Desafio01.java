package Atividade;

import java.time.LocalDate;
/**
 * Desafio01
 */
public class Desafio01 {

    public static void main(String[] args) {
        Tarefa tarefa = new Tarefa("Estudar", "Estudar Java", "Alta", LocalDate.now(), new Categoria("Estudo"));
        
        tarefa.setTitulo("Comer");

        String  titulo =  tarefa.getTitulo();

        System.out.println("Novo titulo da tarefa: " + titulo);


    }
}