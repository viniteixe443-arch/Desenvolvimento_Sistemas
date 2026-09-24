package banco;

public class contaEspecial extends ContaBancaria {
	
	private double saldo;
	private double limite = 500;
	
	public contaEspecial(int numeroConta, String nomeCliente, double saldo, int numeroConta2, String nomeCliente2,
			double saldo2) {
		super(numeroConta, nomeCliente, saldo);
		numeroConta = numeroConta2;
		nomeCliente = nomeCliente2;
		saldo = saldo2;
	}

	public contaEspecial(int numeroConta, String nomeCliente, double saldo) {
		super(numeroConta, nomeCliente, saldo);
	}
	
	@Override
	public double sacar(double valor) {
		if (valor > 0 && saldo >= valor) {
			saldo = saldo + limite;
			saldo = saldo - valor;
			return saldo;
		} else {
			System.out.println("Valor Inválido!!!");
			return saldo;
		}
	}

}