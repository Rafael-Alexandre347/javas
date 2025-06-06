package estudar;

public class Pessoa {
	
	public Pessoa(String namePessoa, String cpf, String turma) {
		super();
		this.namePessoa = namePessoa;
		this.cpf = cpf;
		this.turma = turma;
	}
	public String getName() {
		return namePessoa;
	}
	public void setName(String name) {
		this.namePessoa = name;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getTurma() {
		return turma;
	}
	public void setTurma(String turma) {
		this.turma = turma;
	}
	private String namePessoa;
	private String cpf;
	private String turma;
}

