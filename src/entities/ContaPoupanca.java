package entities;

public class ContaPoupanca extends Conta {

	private static final Integer AGENCIA_POUPANCA = 02;
	protected Integer agencia = AGENCIA_POUPANCA;
	
	public ContaPoupanca(String nomeTitular, String cpf) {
		super(nomeTitular, cpf);
	}

	public ContaPoupanca(String nomeTitular, String cpf, double saldo) {
		super(nomeTitular, cpf, saldo);
	}

	@Override
	public String toString() {
		return "| CONTA POUPANCA | CPF: " + cpf + " | Conta: " + agencia + "-" + numero + " | Saldo: R$ " + saldo + " | Titular.: " + nomeTitular; 
	}
	
}
