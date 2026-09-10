package exercicio3;

import java.util.Scanner;

public class MediaNotas {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			double [] notas = new double [4];
			double soma = 0;
			double media;
			
			
			for(int i = 0; i < notas.length; i++) {
				System.out.println("Digite a "+ (i + 1) + "º Nota: ");
				notas[i] = Integer.parseInt(sc.nextLine());
				
				soma += notas[i];
			}
			
			for(int i = 0; i < notas.length; i++) {
				System.out.println("Notas Cadastradas: " + notas[i]);
			}
			
			media = soma/notas.length;
			
			System.out.println("Média das Notas: " + media);
	}

}
