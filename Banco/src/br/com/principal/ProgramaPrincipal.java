package br.com.principal;

import br.com.banco.Cliente;
import br.com.banco.ContaCorrente;
import br.com.banco.ContaPoupanca;

public class ProgramaPrincipal{

	public static void main(String[] args) {

		Cliente cliente = new Cliente("Mac Taylor", "085.125.576-00");

		ContaCorrente contaCorrente = new ContaCorrente(1021, 888, cliente) {

			protected double sacar() {
				return 0;
			}
		};
		contaCorrente.deposita(5808.0);

		ContaPoupanca contaPoupanca = new ContaPoupanca(1088, 575, cliente) {

			protected double sacar() {
				return 0;
			}
		};
		contaPoupanca.deposita(300.0);

		exibirDados(contaCorrente, contaPoupanca);

		System.err.println("Obs: Todo saque feito em nosso banco, possui uma taxa de R$0,10 centavos por saque!!\n");
		System.out.println("Sacando R$1500,00 da Conta Corrente\n");
		contaCorrente.sacar(1500.0);
		System.out.println("Sacando R$300,00 da Conta Poupan�a\n");
		contaPoupanca.sacar(150.0);
		exibirDados(contaCorrente, contaPoupanca);
	}

	private static void exibirDados(ContaCorrente contaCorrente, ContaPoupanca contaPoupanca) {
		System.out.println("| ---- Conta Corrente ----|\n" + 
						   "|Nome: " + contaCorrente.getCliente().getNome() + 	 "         |\n" +
						   "|CPF: "+ contaCorrente.getCliente().getCpf() + 	 	 "      |\n" + 
						   "|N�mero da Conta: " + contaCorrente.getNumeroConta()+"    |\n" + 
						   "|Ag�ncia: " + contaCorrente.getAgenciaConta() +  	 "             |\n" + 
						   "|Saldo: R$" + contaCorrente.getSaldo()+ 			 "          |\n" + "---------------------------");
		System.out.println("| ---- Conta Poupan�a ----|\n" + 
				   "|Nome: " + contaPoupanca.getCliente().getNome() + 	 "         |\n" +
				   "|CPF: "+ contaPoupanca.getCliente().getCpf() + 	 	 "      |\n" + 
				   "|N�mero da Conta: " + contaPoupanca.getNumeroConta()+"    |\n" + 
				   "|Ag�ncia: " + contaPoupanca.getAgenciaConta() +  	 "             |\n" + 
				   "|Saldo: R$" + contaPoupanca.getSaldo()+ 			 "           |\n" + "---------------------------");
	}
}
