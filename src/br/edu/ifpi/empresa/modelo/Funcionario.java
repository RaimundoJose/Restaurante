package br.edu.ifpi.empresa.modelo;

public class Funcionario {
	
	private String nome;
	private int cpf;
	private double salario;
	private double bonus;
	
	
	
	public Funcionario( String nome,int cpf, double salario) {
		
		this.cpf = cpf;
		this.nome = nome;
		this.salario = salario;
		
	}
	
	public int getCpf() {
		return cpf;
	}
	public String getNome() {
		return nome;
	}
	public double getSalario() {
		return salario;
	}
	
	public final void cracha(){//testa empresa metodo estatico nao muda obs constante nao pérmite mudança do metodo
		System.out.println("BTG"+this.getNome());
	}
	
	public double getBonus(){
		return this.salario*1/100;
		
	}
	
	public String toString(){
		return "Nome: "+this.getNome()+" CPF: "+this.getCpf()+" "+this.getSalario()+" "+getBonus();
	}

}
