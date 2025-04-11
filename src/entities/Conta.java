package entities;

public class Conta {

	private static Integer SEQUENCIAL = 10010;
	
	protected String nomeTitular;
	protected String cpf;
	protected Integer numero = SEQUENCIAL++;	
	protected double saldo;
	
	protected Cliente titular;
	
	public Conta(String nomeTitular, String cpf) {
		this.nomeTitular = nomeTitular;
		this.cpf = cpf;
	}
	
	public Conta(String nomeTitular, String cpf, double saldo) {
		this.nomeTitular = nomeTitular;
		this.cpf = cpf;
		this.saldo = saldo;
	}

	public String getCpf() {
		return cpf;
	}
	
	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

	
	public Integer getNumero() {
		return numero;
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
