package model;

public abstract class Conta implements IConta{
	
	private static int SEQUENCIAL = 1234;
	protected Agencia agencia;
	protected int numero;
	protected double saldo = 0;
	
	public Conta(Agencia agencia) {
		this.agencia = agencia;
		this.numero = this.SEQUENCIAL++;
	}
	
	
	@Override
	public void sacar(double valor) {
		if(valor <= 0) {
			System.out.println("Informe um valor válido!");
			return ;
		}
		
		if(this.saldo >= valor) {
			this.saldo -= valor;
			System.out.println("Saque realizado! -- Valor: "+valor);
		}else {
			System.out.println("Saldo Insuficiente");
		}
		
	}

	@Override
	public void depositar(double valor) {
		if(valor <= 0) {
			System.out.println("Informe um valor válido!");
		}
		
		this.saldo += valor;
		System.out.println("Deposito realizado! -- Valor: "+valor);
		
	}

	@Override
	public void transferir(Conta contaDestino, double valor) {
			if(contaDestino instanceof Conta && valor > 0){
				if(this.saldo > 0) {
					this.sacar(valor);
					contaDestino.depositar(valor);					
				}else {
					System.out.println("Saldo insuficiente");
				}
			}
		
	}
		
	
	public Agencia getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}

	

	
}
