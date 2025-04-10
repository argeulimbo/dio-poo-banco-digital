package application;

import entities.Conta;
import entities.ContaCorrente;

public class Banco {

	public static void main(String[] args) {
		
		Conta conta = new ContaCorrente("Argeu Phelipe de Souza");
		
		conta.deposito(1200.00);
		System.out.println(conta.getSaldo());
		
	}

}
