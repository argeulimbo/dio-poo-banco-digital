package entities;

public class Cliente {

	protected String nome;
	protected String documento;
	protected Conta conta;
	
	public Cliente(String nomeTitular, String cpf, Conta conta) {
		this.nome = conta.getNomeTitular();
		this.documento = conta.getCpf();
		this.conta = conta;
	}

	@Override
	public String toString() {
		return "| Cliente - " + nome + " | CPF: " + documento + " | Conta " + "-" + conta.getNumero();
	}

	
	
}
