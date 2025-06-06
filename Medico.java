package Hospital;

public class Medico {
	private String nome;
	private String crm;
	private Paciente paciente;
	
	public Medico(String nome, String crm) {
		this.nome = nome;
		this.crm = crm;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCrm() {
		return crm;
	}
	public void setCrm(String crm) {
		this.crm = crm;
	}
	
	public void pacienteAtual(Paciente paciente) {
		this.paciente = paciente;
	}
	
	public void atenderPaciente() {
		System.out.println("Atendendo paciente: " + paciente.getNome());
	}

}
