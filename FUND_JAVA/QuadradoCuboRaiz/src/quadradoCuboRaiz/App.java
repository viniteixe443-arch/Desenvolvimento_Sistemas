package quadradoCuboRaiz;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Informe um número (ou negativo para sair): ");
        int numero = sc.nextInt();
        
        do { 
        	
        
            System.out.println("Número Informado: " + numero);
            System.out.println();
            
            System.out.println("O quadrado do número informado: " + (numero * numero));
            System.out.println();
            
            System.out.println("O cubo do número informado: " + (numero * numero * numero));
            System.out.println();
            
            System.out.println("Raíz quadrada do número informado: " + Math.sqrt(numero));
            System.out.println();
            
            System.out.println("Informe o próximo número (ou negativo para sair): ");
            numero = sc.nextInt();
        }while(numero >= 0);
        
        sc.close();
    }
}
