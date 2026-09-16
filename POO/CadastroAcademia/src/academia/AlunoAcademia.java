package academia;

public class AlunoAcademia {
	String nome;
	int idade;
	double peso;
	double altura;

	public AlunoAcademia(String nome, int idade, double peso, double altura) {
		this.nome = nome;
		this.idade = idade;
		this.peso = peso;
		this.altura = altura;
	}

	public boolean ehMenorDeIdade() {
		return this.idade < 18;
	}

	public double calcularIMC() {
		return this.peso / (this.altura * this.altura);
	}

	public void exibirResultados() {
		System.out.println("\n----Dados do Aluno----");
		System.out.println("Nome:" + this.nome);
		System.out.println("Idade:" + this.idade);
		System.out.println("Peso:" + this.peso);
		System.out.println("Altura: " + this.altura);
		System.out.printf("Imc: %.2f\n", calcularIMC());

	}
}