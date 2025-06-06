package estudar;


public class Curso {
	public String getNameCurso() {
		return nameCurso;
	}
	public void setNameCurso(String nameCurso) {
		this.nameCurso = nameCurso;
	}
	public int getDuracao() {
		return duracao;
	}
	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}
	public String getTurma() {
		return turma;
	}
	public void setTurma(String turma) {
		this.turma = turma;
	}
	private String nameCurso;
	private int duracao;
	private String turma;
	
	
	public Curso(String nameCurso, int duracao, String turma) {
		super();
		this.nameCurso = nameCurso;
		this.duracao = duracao;
		this.turma = turma;
	}
	
}
