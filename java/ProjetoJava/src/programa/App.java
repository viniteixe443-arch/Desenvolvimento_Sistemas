package programa;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
	
		System.out.println("Informe um múmero: ");
		int numero =  leia.nextInt();
		
		System.out.println(numero);
		
		if(numero < 10) {
			System.out.println("Mque 10");
		} else if(numero > 10) {
			
		}
		

	}

}
