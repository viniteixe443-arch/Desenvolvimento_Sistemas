package banco;

public class ContaBancaria {
	private int numeroConta;
	private String nomeCliente;
	private double saldo;

	public ContaBancaria(int numeroConta, String nomeCliente, double saldo) {
		this.numeroConta = numeroConta;
		if (nomeCliente != null && !nomeCliente.trim().isEmpty()) {
			this.nomeCliente = nomeCliente;
		} else {
			System.out.println("Nome do Cliente inválido.");

		}
		if (saldo >= 0) {
			this.saldo = saldo;
		} else {
			System.out.println("Saldo Inválido.");
		}

	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		if (nomeCliente != null && nomeCliente.trim().isEmpty()) {
			this.nomeCliente = nomeCliente;
		} else {
			System.out.println("Nome do Cliente inválido.");
		}
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		if (saldo >= 0) {
			this.saldo = saldo;
		} else {
			System.out.println("Saldo Inválido.");
		}
	}

	public void depositar(double valor) {
		if (valor > 0) {
			this.saldo += valor;
			System.out.println("Depósito de " + valor + " Concluído");
		} else {
			System.out.println("Valor de depósito Inválido !");
		}
	}

	public void consultar() {
		System.out.println("Saldo Atual: " + this.saldo);
	}

	public void exibirDados() {
		System.out.println("Numero Cliente: " + numeroConta);
		System.out.println("Nome Cliente: " + nomeCliente);
		System.out.println("saldo: " + saldo);
	}
	public double sacar(double valor) {
		if(valor > 0 && saldo >= valor) {
			saldo = saldo - valor;
			return valor;
		}else {
			System.out.println("Valor inválido!");
			return valor;
		}
				
		
	}
}
