package model;

public class ContaCorrente extends Conta{
	
	
	public ContaCorrente(Agencia agencia) {
		super(agencia);
		
	}

	public void imprimirExtrato() {
		System.out.println("*** Extrato Bancário ***");
		System.out.println("Agência: " + this.agencia.getNumero());
		System.out.println("Conta Nº: " + this.numero);
		System.out.println("Saldo Atual: R$ " + this.saldo);
		System.out.println("\n");
	
	}
}
