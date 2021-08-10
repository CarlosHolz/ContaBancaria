package br.com.banco;

public abstract class ContaCorrente extends Conta {

	Conta contaCorrente;
	Cliente cliente;
	
	public void sacar(double valorSaque) {
		if(this.saldo < valorSaque) {
			System.out.println("Impossível sacar, sem limite na conta!!");
		}else {
		this.saldo = this.saldo - valorSaque - 0.10;
		return;
		}
	}
	
	public void deposita(double quantidade) {
		this.saldo = quantidade;
	}
	
	public String cliente() {
		cliente.nome = "Carlos";
		cliente.cpf = "083.415.069-00";
		return cliente();
	}
}