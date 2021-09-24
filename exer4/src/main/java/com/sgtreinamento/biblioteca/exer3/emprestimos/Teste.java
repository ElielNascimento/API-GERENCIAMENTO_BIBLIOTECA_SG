package com.sgtreinamento.biblioteca.exer3.emprestimos;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Teste {
    public static void main(String[] args) {


        LocalDate dataInicio = LocalDate.of(2021, 1, 15);
        LocalDate dataFim = LocalDate.of(2021, 1, 18);


       Long days = ChronoUnit.DAYS.between(dataInicio, dataFim);

        System.out.println(days);


    }
}
