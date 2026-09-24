package banco;

public class App {

	public static void main(String[] args) {
		
		ContaBancaria conta1 = new ContaBancaria(14, "Klebinho", 10.0);
		ContaBancaria conta2 = new ContaBancaria(25, "Juninho", 20.0);
		
		conta1.exibirDados();
		
		System.out.println();
		
		conta2.exibirDados();
		
		System.out.println();
		
		System.out.println("Depositar 10");
		conta1.depositar(10.0);
		conta1.consultar();
		System.out.println();
		
		System.out.println("Depositar -1");
		conta1.depositar(-1);
		conta1.consultar();
		System.out.println();
		
		
		System.out.println("Sacar 5");
		conta1.sacar(5);
		conta1.consultar();
		System.out.println();
		
		
		System.out.println("Sacar 15");
		conta1.sacar(15);
		conta1.consultar();
		System.out.println();
		
		
		System.out.println("Sacar -1");
		conta1.sacar(-1);
		conta1.consultar();
	}

}