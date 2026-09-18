package horario;

public class App {

	public static void main(String[] args) {
		Horario horario1 = new Horario();
		System.out.println("Horario inicial:");
		horario1.exibir();

		System.out.println("Horario Após a alteração:");
		horario1 = new Horario();
		horario1.hora = 8;
		horario1.minuto = 15;
		horario1.segundo = 30;
		horario1.exibir();

		System.out.println("Após a Conversão:");
		System.out.println(horario1.calcularSegundos());
		
		System.out.println("\n--------------\n");
		
		Horario horario2 = new Horario();
		System.out.println("Horario inicial:");
		horario2.exibir();
		
		System.out.println("Horario Após a alteração:");
		horario2 = new Horario(14, 20, 05);
		horario2.exibir();
		
		System.out.println("Após a Conversão:");
		System.out.println(horario2.calcularSegundos());
		
		System.out.println("\n--------------\n");

		Horario horario3 = new Horario();
		System.out.println("Horario inicial:");
		horario3.exibir();
		
		System.out.println("Horario Após a alteração:");
		horario3 = new Horario(222, 80,16);
		horario3.exibir();
		
		System.out.println("Após a Conversão:");
		System.out.println(horario3.calcularSegundos());

		
		

		
	}

}
