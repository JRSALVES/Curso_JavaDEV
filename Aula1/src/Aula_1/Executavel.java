package Aula_1;

import Aula1_Pack2.Produto;

public class Executavel {
	public static void main(String[] args) {
		
		Pessoa aluno1 = new Pessoa();
		
		aluno1.setNome("Jeruso");
		aluno1.setSobrenome("Alves Nascimento");
		aluno1.setIdade(57);
		
		
		System.out.println("Nome: " + aluno1.getNome());
		System.out.println("Sobrenome: " + aluno1.getSobrenome());
		System.out.println("Idade: " + aluno1.getIdade() + "anos");
		
		
		Produto prod1 = new Produto();
		
		prod1.setDescricao("Mamão");
		prod1.setQuantidade(10);
		prod1.setValor(1.50);
		
		System.out.println("\nProduto: " + prod1.getDescricao());
		System.out.println("Valor RS: " + prod1.getValor());
		System.out.println("Qtde: " + prod1.getQuantidade());
				
		
	}
}
