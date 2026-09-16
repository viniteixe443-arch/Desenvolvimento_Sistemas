package exercicio6;

import java.util.ArrayList;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		ArrayList<String> tarefas = new ArrayList();
		Scanner sc = new Scanner(System.in);
		String tarefa;
		String continuar;
		
		do {
			System.out.println("Informe uma tarefa: ");
			tarefa = sc.nextLine();
			
			tarefas.add(tarefa);
			
			System.out.println("Deseja continuar adicionando tarefas? (s/n)");
			continuar = sc.nextLine();
			
		}while(continuar.equalsIgnoreCase("s"));		
		System.out.println("Tarefas Cadastradas:" );

		for(String t : tarefas) {
			System.out.println( t );
		}
		 sc.close();
	}

}
