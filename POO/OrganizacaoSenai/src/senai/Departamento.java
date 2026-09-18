package senai;

import java.util.ArrayList;

public class Departamento {
	 int codigo;
	 String nome, telefone;
	ArrayList<Funcionario> funcionarios;
	
	public Departamento(int codigo, String nome, String telefone) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.telefone = telefone;
		funcionarios = new ArrayList<>();
	}
	
	public void adicionarFuncionarios(Funcionario funcionario) {
		funcionarios.add(funcionario);	
	}
	public void exibirDados() {
		System.out.println("Código: " + this.codigo);
		System.out.println("Nome: " + this.nome);
		System.out.println("Telefone: " + this.telefone);
	}
	public void listarFuncionarios() {
		for(Funcionario f : funcionarios) {
			f.exibirDados();	
		}
	}
}
