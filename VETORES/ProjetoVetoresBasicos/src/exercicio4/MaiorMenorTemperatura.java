package exercicio4;

import java.util.Scanner;

public class MaiorMenorTemperatura {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double maiorTemp, menorTemp;
		
		double[] temperaturas = new double [7];
		
		for(int i = 0; i < temperaturas.length; i++) {
			System.out.println("Informe o valor da temperatura do " + (1 + i) + "º dia da semana: ");
			temperaturas[i] = Double.parseDouble(sc.nextLine());
			
			
		}
		maiorTemp = temperaturas[0];
		menorTemp = temperaturas[0];
		
		for(int i = 0; i < temperaturas.length; i++) {			
			System.out.println("Temperaturas Cadastradas: " + temperaturas[i]);
			
			if(temperaturas[i] > maiorTemp) {
				maiorTemp = temperaturas[i];
			}
			if(temperaturas[i] < menorTemp) {
				menorTemp = temperaturas[i];	
			}
		}
		System.out.println("Maior Temperatura: " + maiorTemp);
		System.out.println("Menor Temperatura: " + menorTemp);
	}	
	
}