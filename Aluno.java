package estudar;

public class Aluno extends Pessoa {
	public int getMedia() {
		return media;
	}
	public void setMedia(int media) {
		this.media = media;
	}
	public boolean isFaltar() {
		return faltar;
	}
	public void setFaltar(boolean faltar) {
		this.faltar = faltar;
	}
	private int media;
	private boolean faltar;
	
	
	public void estudar() {
		this.media = media + 1;
	}
	public Aluno(String namePessoa, String cpf, String turma, int media) {
		super(namePessoa, cpf, turma);
		this.media = media;
	}
	
}
