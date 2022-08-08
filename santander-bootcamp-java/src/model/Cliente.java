package model;

public class Cliente {
	
	private static int ID_SEQUENCIAL = 1;
	private int id;
	private String nome;
	private String cpf;
	private Conta corrente = null;
	private Conta poupanca = null;

	public Cliente(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
		this.id = this.ID_SEQUENCIAL;
	}
	
	public void vincularpoupanca(Conta conta) {
		if(conta instanceof Conta) {
			this.poupanca = conta;					
		}else {
			System.out.println("Informe uma conta válida");			
		}
	}
	
	public void vincularCorrente(Conta conta) {
		if(conta instanceof Conta) {
			this.corrente = conta;					
		}else {
			System.out.println("Informe uma conta válida");			
		}
	}
	
	public void exibirDetalhes(){
		System.out.println("**** Cliente Detalhes **** \n"+
		"ID: " + this.id + "\n" +
		"Nome: " + this.nome + "\n" +
		"Cpf: "	+ this.cpf + "\n" + 
		"**** Contas Vinculadas ****");
		
		
		
		if(poupanca instanceof Conta) {
			System.out.println("Poupança Nº: "+this.poupanca.getNumero());
		}
		
		if(corrente instanceof Conta) {
			System.out.println("Corrente Nº: "+this.corrente.getNumero());
		}
		System.out.println("\n");
	}
	
	public int getId() {
		return this.id;
	}
	
	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return this.cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Conta getCorrente() {
		return this.corrente;
	}

	public Conta getPoupança() {
		return this.poupanca;
	}
	
	
	
}
