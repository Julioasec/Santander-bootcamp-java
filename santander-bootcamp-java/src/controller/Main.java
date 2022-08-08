package controller;

import model.Agencia;
import model.Banco;
import model.Cliente;
import model.Conta;
import model.ContaCorrente;
import model.ContaPoupanca;

public class Main {

	public static void main(String[] args) {
		
		Banco banco = new Banco();
		Agencia agencia = new Agencia(12, "Rua do filé");
		Agencia agencia2 = new Agencia(14, "Rua das flores");
		Agencia agencia3 = new Agencia(16, "Rua das couves");
		Cliente cliente = new Cliente("José das Couves", "12345678");
		Conta conta = new ContaCorrente(agencia);
		Conta conta2 = new ContaPoupanca(agencia);
		
		banco.vincularAgencia(agencia);
		banco.vincularAgencia(agencia2);
		banco.vincularAgencia(agencia3);
		
		agencia.vincularCliente(cliente);
		
		cliente.vincularCorrente(conta);
		cliente.vincularpoupanca(conta2);
		cliente.exibirDetalhes();
	
			
		}

}
