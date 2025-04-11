package entities;

public class ContaCorrente extends Conta{

	private static final Integer AGENCIA_CORRENTE = 01;
	protected Integer agencia = AGENCIA_CORRENTE;
	
	public ContaCorrente(String nomeTitular, String cpf) {
		super(nomeTitular, cpf);
	}

	public ContaCorrente(String nomeTitular, String cpf, double saldo) {
		super(nomeTitular, cpf, saldo = 0);
	}
	
	public Integer getAgencia() {
		return agencia;
	}

	@Override
	public String toString() {
		return "| CONTA CORRENTE | CPF: " + cpf + " | Conta: " + agencia + "-" + numero + " | Saldo: R$ " + saldo + " | Titular.: " + nomeTitular; 
	}
	
	
	
}
