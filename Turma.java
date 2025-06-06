package estudar;
import java.util.List;
public class Turma {

	private List<Aluno> alunos;
	private Professor professorResponsavel;
	
	public Turma(List<Aluno> alunos, Professor professorResponsavel) {
		super();
		this.alunos = alunos;
		this.professorResponsavel = professorResponsavel;
	}
	
	public void aplicarAula() {
		for (Aluno aluno : alunos) {
			aluno.setMedia(aluno.getMedia() + 1);
		}
		professorResponsavel.setMoral(professorResponsavel.getMoral() + 1);
	}

	public List<Aluno> getAlunos() {
		return alunos;
	}

	public void setAlunos(List<Aluno> alunos) {
		this.alunos = alunos;
	}

	public Professor getProfessorResponsavel() {
		return professorResponsavel;
	}

	public void setProfessorResponsavel(Professor professorResponsavel) {
		this.professorResponsavel = professorResponsavel;
	}

	}

