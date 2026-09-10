package exercicio2;

import java.util.Scanner;

public class CadastroNumeros {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int armz = 0;
		int[] numeros = new int[5];
			
		for(int i = 0; i < numeros.length; i++) {	
			System.out.println("Informe o números da posição "+ i);
			numeros[i] = Integer.parseInt(sc.nextLine());
			
		}
		
		for(int i = 0; i < numeros.length; i++) {
			System.out.println("Números Cadastrados " + numeros[i]);
		}
			
	}
}
