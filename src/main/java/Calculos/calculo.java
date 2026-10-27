package Calculos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class calculo {
 Scanner scanner = new Scanner(System.in, "CP850");   

    
    int valorVariavel = 0;
    int credito = 0;
    int residentes = 0;

    public void DivisaoVariavel() {
        
        System.out.println("Digite o valor variável: ");
        valorVariavel = scanner.nextInt();
        int valorPorPessoa = valorVariavel / residentes;
        int rateio = (valorVariavel - valorPorPessoa)/(residentes - 1);
        System.out.println("O valor variável é: " + valorVariavel);
        System.out.println("O valor por pessoa é: " + valorPorPessoa);
        credito = valorPorPessoa;
        // cada residente recbe o valor do rateio, exceto o que pagou a despesa, que recebe uma parte do rateio como credito
        System.out.println("O valor do rateio é: " + rateio);
        
    }
}

