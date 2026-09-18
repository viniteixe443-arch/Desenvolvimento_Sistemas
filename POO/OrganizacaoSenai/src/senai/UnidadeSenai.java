package senai;

import java.util.ArrayList;

public class UnidadeSenai {
	 String nome;
	ArrayList<Departamento> departamentos;
	
	public UnidadeSenai(String nome) {
		this.nome = nome;
		departamentos = new ArrayList<>();
	}
	
	public void adicionarDepartamento(Departamento departamento) {
		departamentos.add(departamento);
	}
    public void exibirEstrutura() {
        System.out.println("Unidade: " + this.nome);
        
        for (Departamento d : departamentos) {
            d.exibirDados();
        }
    }

}
