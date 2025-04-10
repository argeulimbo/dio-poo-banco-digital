package entities;

public class ContaPoupanca extends Conta {

	private static final Integer SEQUENCIAL = 002;
	
	protected Integer numero = SEQUENCIAL;
	
	public ContaPoupanca(String nomeTitular, Integer agencia, Integer numero, Double saldo) {
		super(nomeTitular, agencia, numero, saldo);
		this.numero++;
	}
	
}
