package model;

import java.util.ArrayList;
import java.util.List;

public class Agencia {
	
	private int numero;
	private String endereco;
	private List<Cliente> clientes = new ArrayList<>();
	
	public Agencia(int numero, String endereco) {
		this.numero = numero;
		this.endereco = endereco;
	}	
	
	public void vincularCliente(Cliente cliente) {
		if(cliente instanceof Cliente) {
			clientes.add(cliente);			
		}else {
			System.out.println("Informe um cliente válido");
		}
	}
		
	public void listarClientes() {
		System.out.println("*** Agência " + this.numero + " ***");
		if(clientes.size() > 0) {
			System.out.println("*** Lista de Clientes ***");
			for (Cliente cliente : clientes) {
				System.out.println(
					"Cliente: " + cliente.getNome() + "\n" + 
					"Id: " + cliente.getId()
			);
				System.out.println("\n");
			}
		}else {
			System.out.println("Nenhum Cliente Cadastrado. \n");
		}
		
		
	}
	
	public Cliente buscarCliente(int id){
		for (Cliente cliente : clientes) {
			if(cliente.getId() == id) {
				return cliente;
			}
			
		}
		
		return null;
	}
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public List<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}
	
	
}
