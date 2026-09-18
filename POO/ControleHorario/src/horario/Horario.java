package horario;

public class Horario {
	int hora;
	int minuto;
	int segundo;

	public Horario() {
		this.hora = 0;
		this.minuto = 0;
		this.segundo = 0;

	}

	public Horario(int hora, int minuto, int segundo) {
		if(hora >= 0 && hora <=23) {
			this.hora = hora;
		}else {
			System.out.println("Hora Inválida");
		}
		if(minuto >= 0 && minuto <= 59) {
			this.minuto = minuto;
		}else {
			System.out.println("Minuto Inválido");
		}
		if(segundo >= 0 && segundo <= 59) {
			this.segundo = segundo;
		}else {
			System.out.println("Segundo Inválido");
		}
	}

	public void exibir() {
		System.out.printf("%02d:%02d:%02d%n", hora, minuto, segundo);
	}
	int calcularSegundos() {
		return (this.hora * 3600) + (this.minuto * 60) + segundo;
	}
}