package investimento;

public class App {

	public static void main(String[] args) {
		
		double valorCarlos = 3000.00, valorJoao, contadorMes = 0;
		
		valorJoao = valorCarlos / 3;
		
		while (valorJoao < valorCarlos) {
			valorCarlos = (valorCarlos * 1.02);
			valorJoao = (valorJoao * 1.05);
			contadorMes++;
		}
		
		System.out.println("A quantidade de meses necessários: " + Math.round(contadorMes));
		System.out.println("O valor acumulado por Carlos: " + Math.round(valorCarlos));
		System.out.println("O valor acumulado por João: " + Math.round(valorJoao));

	}

}