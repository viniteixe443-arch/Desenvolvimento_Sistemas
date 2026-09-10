package exercicio5;

import java.util.Scanner;

public class ParesEImpares {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int quantPar = 0, quantImpar = 0 ;
		
		int [] numeros = new int[8];
		
		for(int i = 0; i < numeros.length; i++) {
			System.out.println("Informe o " + (i + 1) + "º Valor: ");
			numeros[i] = Integer.parseInt(sc.nextLine());
			
			if(numeros[i]%2 ==0) {
				System.out.println("Par");
				quantPar++;
			}else {
				System.out.println("Ímpar");
				quantImpar++;
			}
		}
	}
}