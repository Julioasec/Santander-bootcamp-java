package model;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	
	private String nome;
	private List<Agencia> agencias = new ArrayList<>();
	
	public void listarAgencias(){
		System.out.println("*** Lista de Agencias ***");
		if(agencias.size() > 0) {
			for (Agencia agencia : agencias) {
				System.out.println("Agencia: " + agencia.getNumero() + " " +
					"-- " + agencia.getClientes().size() + " Clientes"
								);
			}
			System.out.println("\n");
		}else {
			System.out.println("Nenhuma agência cadastrada \n");
		}
	}
	
	public Agencia buscarAgencia(int agenciaNumero){
			for (Agencia agencia : agencias) {
				if(agencia.getNumero() == agenciaNumero) {
					return agencia;
				}
			}
			
			return null;
	}
	
	public void vincularAgencia(Agencia agencia) {
		if(agencia instanceof Agencia) {
			this.agencias.add(agencia);			
		}else {
			System.out.println("Informe uma agência válida");
		}
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
