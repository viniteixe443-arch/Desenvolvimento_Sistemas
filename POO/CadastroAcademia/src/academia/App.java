package academia;

public class App {

	public static void main(String[] args) {
		AlunoAcademia aluno = new AlunoAcademia("Ana ", 17, 60.0, 1.65);

		aluno.exibirResultados();

		AlunoAcademia aluno1 = new AlunoAcademia("Bruno", 25, 80.0, 1.80);

		aluno1.exibirResultados();

	}

}
