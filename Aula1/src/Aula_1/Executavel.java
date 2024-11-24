package Aula_1;

public class Executavel {
	public static void main(String[] args) {
		
		Pessoa aluno1 = new Pessoa();
		
		aluno1.setNome("Jeruso");
		aluno1.setSobrenome("Alves Nascimento");
		aluno1.setIdade(57);
		
		
		System.out.println("\n Nome: " + aluno1.getNome());
		System.out.println("\n Sobrenome: " + aluno1.getSobrenome());
		System.out.println("\n Idade: " + aluno1.getIdade() + "anos");
	}

}
