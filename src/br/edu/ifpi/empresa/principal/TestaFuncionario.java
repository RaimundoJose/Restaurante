
package br.edu.ifpi.empresa.principal;

import br.edu.ifpi.empresa.modelo.Funcionario;
import br.edu.ifpi.empresa.modelo.Gerente;

public class TestaFuncionario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//cast
		Funcionario funcionario = new Funcionario("RJ", 123456789, 1000.0);
		
		Gerente gerente = new Gerente("JR", 987654321, 2000.0);
		((Gerente)gerente).setNivel(2);
		((Gerente)funcionario).setNivel(5);
	//Calcularbonificacao.calcular(funcionario);
		//Calcularbonificacao.calcular(gerente);
		//Calcularbonificacao.calcular(diretor);
	
		
		System.out.println("O to de funcionário é:  "+funcionario.toString());
		System.out.println("O to de funcionário é:  "+gerente.toString());
		

	}

}
