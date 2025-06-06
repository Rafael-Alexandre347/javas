package blibloteca;

public class Biblioteca {
	private String nome;
	private Livro livroDestaque;
	
	public Biblioteca(String nome, Livro livroDestaque) {
		this.nome = nome;
		this.livroDestaque = livroDestaque;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Livro getLivroDestaque() {
		return livroDestaque;
	}

	public void setLivroDestaque(Livro livroDestaque) {
		this.livroDestaque = livroDestaque;
	}

	
	public Livro exibirLivroDestaque() {
		return livroDestaque;
	}
}
