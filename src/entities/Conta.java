package entities;

public class Conta {
		
	private static final Integer AGENCIA_PADRAO = 01;
	
	protected String nomeTitular;
	protected Integer agencia = AGENCIA_PADRAO;
	
	protected Double saldo;
	
	public Conta(String nomeTitular, Integer agencia, Integer numero) {
		this.nomeTitular = nomeTitular;
		this.agencia = AGENCIA_PADRAO;
	}
	public Conta(String nomeTitular, Integer agencia, Integer numero, Double saldo) {
		this.nomeTitular = nomeTitular;
		this.agencia = AGENCIA_PADRAO;
		this.saldo = saldo;
	}

	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

	public Integer getAgencia() {
		return agencia;
	}

	public void setAgencia(Integer agencia) {
		this.agencia = agencia;
	}
	
	public Double getSaldo() {
		return saldo;
	}
	
	public void deposito(double amount) {
		this.saldo += amount;
	}
	
	public void saque(double amount) {
		this.saldo -= amount;
	}
	
	public void transferencia(Conta contaDestino, double amount) {
		if (this.saldo >= amount) {
			this.saque(amount);
			contaDestino.deposito(amount);
		}
		else {
			throw new IllegalArgumentException("ERROR: Saldo insuficiente para realizar a transferência.");
		}
	}
}
