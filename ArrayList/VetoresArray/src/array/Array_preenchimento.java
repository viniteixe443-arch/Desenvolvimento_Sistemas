package array;

import java.util.ArrayList;
import java.util.Scanner;

public class Array_preenchimento {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> nomes = new ArrayList<>();
        String nome, continuar;

        // Preenche a Lista
        do {
            System.out.println("Informe um nome:");
            nome = sc.nextLine();
            
            // LINHA ADICIONADA: Insere o nome digitado na lista
            nomes.add(nome); 

            System.out.println("Deseja Continuar(s/n): ");
            continuar = sc.nextLine();

        } while(continuar.equalsIgnoreCase("s"));

        // Percorre a Lista / vetor
        System.out.println("Nomes Cadastrados: " + nomes);
        for (String nomeCadastrado : nomes) {
            System.out.println(nomeCadastrado);
        }

        sc.close();
    }
}
