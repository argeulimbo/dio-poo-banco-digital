package entities;

public class ContaCorrente extends Conta{

	private static final Integer SEQUENCIAL = 001;
	
	protected Integer numero = SEQUENCIAL;
	
	public ContaCorrente(String nomeTitular, Integer agencia, Integer numero, Double saldo) {
		super(nomeTitular, agencia, numero, saldo);
		this.numero++;
	}
	
}
