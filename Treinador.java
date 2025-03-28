package games;

public class Treinador {
	
	String nome;
	Pokemon starter;
	
	public Treinador (String nome, Pokemon starter) {
		this.nome = nome;
		this.starter = starter; 
	}
	
	void desafiar() {
		System.out.println(nome + " is challenging you to a battle!\n");
	}

}
