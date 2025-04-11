package application;

import java.util.Arrays;
import java.util.List;

import entities.Cliente;
import entities.Conta;
import entities.ContaCorrente;
import entities.ContaPoupanca;

public class Banco {

	public static void main(String[] args) {
		
		//#current-account-brute-create
		Conta conta1 = new ContaCorrente("Argeu Phelipe de Souza", "118.375.236-90");		
		Conta conta2 = new ContaCorrente("Andressa Ferreira Dias Amorim", "582.950.736-64");		
		Conta conta3 = new ContaCorrente("Rania Rosa de Souza", "203.982.716-15");		
		Conta conta4 = new ContaCorrente("Paulo Roberto", "539.336.716-39");		
		Conta conta5 = new ContaCorrente("Ailton Alves Pereira", "709.002.236-69");		
		
		//#poupance-account-brute-create
		Conta conta6 = new ContaPoupanca("Gabriel Felipe Soares", "634.187.850-85");		
		Conta conta7 = new ContaPoupanca("Yuri Alberto Peçanha", "355.123.880-45");		
		Conta conta8 = new ContaPoupanca("Vinícius Resende do Carmo", "847.741.920-58");		
		Conta conta9 = new ContaPoupanca("Anderson Klumbiskow Tedesco", "967.911.620-40");		
		Conta conta10 = new ContaPoupanca("Jair Messias Bolsonaro", "345.665.570-30");		
		
		//#currentAccount-list
		List<Conta> currentAccountList = Arrays.asList(conta1, conta2, conta3, conta4, conta5);
		
		//#poupanceAccount-list
		List<Conta> poupanceAccountList = Arrays.asList(conta6, conta7, conta8, conta9, conta10);
		
		//#for-eac-to-currentAccount
		for (Conta contaCorrente : currentAccountList) {
			System.out.println(contaCorrente);
		}

		//#for-eac-to-poupanceAccount
		for (Conta contaPoupanca : poupanceAccountList) {
			System.out.println(contaPoupanca);
		}
		
		//#client-teste
		Cliente cl1 = new Cliente(conta1.getNomeTitular(), conta1.getCpf(), conta1);
		System.out.println(cl1.toString());
	}

}
