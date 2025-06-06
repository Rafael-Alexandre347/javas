package estudar;

public class Professor extends Pessoa {
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public boolean isEmitirHolerite() {
		return emitirHolerite;
	}
	public void setEmitirHolerite(boolean emitirHolerite) {
		this.emitirHolerite = emitirHolerite;
	}
	public int getMoral() {
		return moral;
	}
	public void setMoral(int moral) {
		this.moral = moral;
	}
	private double salario;
	private boolean emitirHolerite;
	private int moral;
	
	public void aplicarProva() {
		this.moral = moral - 1;
	}
	
	public void passarLicaoDeCasa() {
		this.moral = moral - 2;
	}
	
	public void passarFilme() {
		this.moral = moral + 1;
	}
	
	public void passarJogo() {
		this.moral = moral + 2;
		
		}

	public Professor(String namePessoa, String cpf, String turma, int moral, boolean emitirHolerite) {
		super(namePessoa, cpf, turma);
		this.moral = moral;
		this.emitirHolerite = emitirHolerite;
}}
