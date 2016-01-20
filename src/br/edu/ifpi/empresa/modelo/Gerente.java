package br.edu.ifpi.empresa.modelo;

public class Gerente extends Funcionario{
	
	public Gerente( String nome,int cpf, double salario) {
		super( nome, cpf,salario);
		
	}

	private int nivel;
	@Override
	public double getBonus(){
		return this.getBonus()*0.3;
		
	}
	
	
	public int getNivel() {
		return nivel;
	}


	public void setNivel(int nivel) {
		this.nivel = nivel;
	}
	@Override
	//testa empresa metodo estatico nao muda obs constante nao pérmite mudança do metodo
	/*public  void cracha(){
		System.out.println("BTG"+this.getNome());
	}
*/

	public String toString(){
		return "Ger." +super.toString()+ "Nivel"+this.nivel;
	}	
	

}
