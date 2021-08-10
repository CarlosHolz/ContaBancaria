package br.com.principal;

import java.util.Scanner;

//import br.com.banco.Conta;
import br.com.banco.ContaCorrente;
import br.com.banco.ContaPoupanca;

public class ProgramaPrincipal {

	public static void main(String[] args) {

		Scanner tec = new Scanner(System.in);
		// Conta conta;
		ContaCorrente contaCorrente;
		ContaPoupanca contaPoupanca;

		contaCorrente = new ContaCorrente() {

			public double sacar() {
				return 0;
			}
		};

		contaPoupanca = new ContaPoupanca() {

			public double sacar() {
				return 0;
			}
		};

		System.out.print("Voc� deseja operar na sua conta corrente (1) ou poupan�a (2)? ");
		int resposta = tec.nextInt();
		System.out.println("\n");

		if (resposta == 1) {

			System.out.print("Por favor, informe a sua ag�ncia: ");
			contaCorrente.setAgenciaConta(tec.nextInt());

			System.out.print("Por favor, informe o n�mero da conta: ");
			contaCorrente.setNumeroConta(tec.nextInt());
			System.out.println("\n");
			
			if (contaCorrente.getNumeroConta() <= 0 && contaCorrente.getAgenciaConta() <= 0) {
				System.out.println("Erro! O n�mero da conta e ag�ncia devem ser maior que 0");
			} else {

				System.out.println("\n");
				System.out.print(
						"Deseja depositar algum valor na sua conta corrente? Atualmente ela est� zerada!! \nDepositando: R$");
				contaCorrente.deposita(tec.nextDouble());
				System.out.println("na conta " + contaCorrente.getNumeroConta() + " ag�ncia "
						+ contaCorrente.getAgenciaConta() + " do cliente " + contaCorrente.cliente());
				System.out.println("\n");
				System.out.println("Seu saldo ap�s o dep�sito � de: R$" + contaCorrente.getSaldo());
				System.out.println("\n");
				System.out.print("Deseja sacar algum valor? [S/N] ");
				String opcao = tec.next();
				System.out.println("\n");
				if (opcao.equalsIgnoreCase("s")) {
					System.out.println("Obs: Nosso banco trabalha com uma taxa de 0,10 centavos por saque efetuado!");
					System.out.print("Informe o valor que deseja sacar: R$");
					contaCorrente.sacar(tec.nextDouble());
					System.out.println("\n");
					System.out.println("Saldo ap�s saque efetuado: R$" + contaCorrente.getSaldo());
				} else {
					System.out.println("Opera��o finalizada!!");
				}
			}
		} else if (resposta == 2) {

			System.out.print("Por favor, informe a sua ag�ncia: ");
			contaPoupanca.setAgenciaConta(tec.nextInt());

			System.out.print("Por favor, informe o n�mero da conta: ");
			contaPoupanca.setNumeroConta(tec.nextInt());
			System.out.println("\n");
			
			if (contaPoupanca.getNumeroConta() <= 0 && contaPoupanca.getAgenciaConta() <= 0) {
				System.out.println("Erro! O n�mero da conta e ag�ncia devem ser maior que 0");
			} else {

				System.out.println("\n");
				System.out.print(
						"Deseja depositar algum valor na sua conta poupan�a? Atualmente ela est� zerada!! \nDepositando: R$");
				contaPoupanca.deposita(tec.nextDouble());
				System.out.println("na conta " + contaPoupanca.getNumeroConta() + " ag�ncia "
						+ contaPoupanca.getAgenciaConta() + " do cliente " + contaPoupanca.cliente());
				System.out.println("\n");
				System.out.println("Seu saldo ap�s o dep�sito � de: R$" + contaPoupanca.getSaldo());
				System.out.println("\n");
				System.out.print("Deseja sacar algum valor? [S/N] ");
				String opcao = tec.next();
				System.out.println("\n");
				if (opcao.equalsIgnoreCase("s")) {
					System.out.println("Obs: Nosso banco trabalha com uma taxa de 0,10 centavos por saque efetuado!");
					System.out.print("Informe o valor que deseja sacar: R$");
					contaPoupanca.sacar(tec.nextDouble());
					System.out.println("\n");
					System.out.println("Saldo ap�s saque efetuado: R$" + contaPoupanca.getSaldo());
				} else {
					System.out.println("Opera��o finalizada!!");
				}
			}
		}

		tec.close();

	}
}
