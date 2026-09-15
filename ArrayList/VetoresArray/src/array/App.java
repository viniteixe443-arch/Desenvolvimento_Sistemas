package array;

import java.util.ArrayList;

public class App {

	public static void main(String[] args) {
		ArrayList<String> nomes = new ArrayList<>();
		
		nomes.add("Ana");
		nomes.add("Bruno");
		nomes.add("Carlos");
		// Adiciona em uma posição específica
		nomes.add(0, "Daniel");
		
		// Acessa o primeiro nome
		System.out.println("Primeiro nome: "+ nomes.get(0));
		
		//Informa o indice de um elemento
		System.out.println("Posição do Carlos:" + nomes.indexOf("Carlos"));
		
		//Remove um elemento da lista
		nomes.remove(0);
		
		//Verifica se a Lista está vazia
		System.out.println("A lista está vazia? " + nomes.isEmpty());
		
		//Exibe a Lista completa
		System.out.println("Lista: " + nomes);
		
		//Remove todos os elementos
		nomes.clear();
		
		System.out.println("Lista após a limpa:" + nomes);
	}

}
