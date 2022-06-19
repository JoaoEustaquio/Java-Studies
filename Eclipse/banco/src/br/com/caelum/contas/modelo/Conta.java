package br.com.caelum.contas.modelo;

public class Conta {
	double saldo;
	String titular;
	int numero;
	String agencia;
	
	public void deposita(double valor) {
		this.saldo += valor;
	}
	
	void saca(double valor) {
		this.saldo -= valor;
	}

	public double getSaldo() {
		return this.saldo;
	}
}
