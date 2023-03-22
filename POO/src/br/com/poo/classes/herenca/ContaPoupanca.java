package br.com.poo.classes.herenca;

public class ContaPoupanca extends ContaBancaria {
	
	private double rendimento;

	public ContaPoupanca() {
	}

	public ContaPoupanca(double rendimento) {
		this.rendimento = rendimento;
	}

	public ContaPoupanca(Long numeroBanco, int agencia, Long numeroConta, String titular, double saldo, double rendimento) {
		this.rendimento = rendimento;
		this.setNumeroBanco(numeroBanco);
		super.setAgencia(agencia);
		super.setNumeroConta(numeroConta);
		super.setTitular(titular);
		super.setSaldo(saldo);
	}

	public double getRendimento() {
		return rendimento;
	}

	public void setRendimento(double rendimento) {
		this.rendimento = rendimento;
	}
	
	@Override
	public String saque(double valor) {
		String msg = "";
		if(super.getSaldo() < valor) {
			msg = "Saldo incoerente";
		}
		else {
			msg = "Saque realizado";
			super.setSaldo(super.getSaldo() - valor) ;
		}
		
		return msg;
	}

}
