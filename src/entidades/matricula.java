package entidades;

import java.util.ArrayList;
import java.util.List;

public class matricula {
	List<matricula> listaMatriculas = new ArrayList<matricula>();
	List<aluno> listaAlunos;
	List<disciplina> listaDisciplinas;
	private int id = 0;
	private int idAluno=0;
	private int idDisciplina=0;
	disciplina disciplinaAtual = null;
	aluno alunoAtual = null;
	private String nomeAluno;
	private String nomeCurso;
	private String semestres;
	private String ano;
	status situacaoMatricula;

	public matricula(List<aluno> listaAlunos, List<disciplina> listaDisciplinas) {
		this.listaAlunos = listaAlunos;
		this.listaDisciplinas = listaDisciplinas;
	}
	
	public matricula(int idAluno, int idDisciplina, String semestres, String ano, status situacaoMatricula) {
		this.idAluno = idAluno;
		this.idDisciplina = idDisciplina;
		this.semestres = semestres;
		this.ano = ano;
		this.situacaoMatricula = situacaoMatricula;
	}

	public int getIdAluno() {
		return idAluno;
	}

	public void setIdAluno(int idAluno) {
		this.idAluno = idAluno;
	}

	public int getIdDisciplina() {
		return idDisciplina;
	}

	public void setIdDisciplina(int idDisciplina) {
		this.idDisciplina = idDisciplina;
	}

	public String getNomeAluno() {
		return nomeAluno;
	}

	public void setNomeAluno(String nomeAluno) {
		this.nomeAluno = nomeAluno;
	}

	public String getNomeCurso() {
		return nomeCurso;
	}

	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}

	public String getSemestres() {
		return semestres;
	}

	public void setSemestres(String semestres) {
		this.semestres = semestres;
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public status getSituacaoMatricula() {
		return situacaoMatricula;
	}

	public void setSituacaoMatricula(status situacaoMatricula) {
		this.situacaoMatricula = situacaoMatricula;
	}

	public List<matricula> getListaMatriculas() {
		return listaMatriculas;
	}

	public int getId() {
		return id;
	}

	public matricula(int id, String nomeAluno, String nomeCurso, String semestres, String ano,
			status situacaoMatricula) {
		this.id = id;
		this.nomeAluno = nomeAluno;
		this.nomeCurso = nomeCurso;
		this.semestres = semestres;
		this.ano = ano;
		this.situacaoMatricula = situacaoMatricula;
	}

	public void adicionarMatriculaCurso(int idAluno, int idDisciplina, String semestre, String ano,
			status situacaoMatricula){
		if (listaAlunos.isEmpty()) {
			System.out.println("não ha alunos Cadastrados!");
			System.out.println();
			return;
		}
		if (listaDisciplinas.isEmpty()) {
			System.out.println("não ha disciplinas Cadastradas!");
			return;
		}

		for (aluno procurarAluno : listaAlunos) {
			if (procurarAluno.getId() == idAluno) {
				alunoAtual = procurarAluno;
				break;
			}

		}
		if (alunoAtual == null) {
			System.out.println("aluno invalido!");
			System.out.println();
			return;
		}
		for (disciplina procurarDisciplina : listaDisciplinas) {
			if (procurarDisciplina.getId() == idDisciplina) {
				disciplinaAtual = procurarDisciplina;
				break;
			}
		}
		if (disciplinaAtual == null) {
			System.out.println("disciplina invalida!");
			return;
		}
		if (alunoAtual != null && disciplinaAtual != null) {
			id++;
			nomeAluno = alunoAtual.getNome();
			nomeCurso = disciplinaAtual.getNome();
			matricula novaMatricula = new matricula(id, nomeAluno, nomeCurso, semestre, ano, situacaoMatricula);
			if (listaMatriculas.add(novaMatricula)) {
				System.out.println("Nova Matricula em Curso Concluida!");
				alunoAtual=null;
				disciplinaAtual=null;
				idAluno=0;
				idDisciplina=0;
				System.out.println();
			}
		}

	}

	public void exibirMatriculas(List<matricula> listaMatriculas) {
		if (listaMatriculas.isEmpty()) {
			System.out.println("não ha matriculas cadastradas!");
			return;
		}
		for (matricula exibirMatriculas : listaMatriculas) {
			System.out.println(exibirMatriculas);
		}

	}

	@Override
	public String toString() {
		return "matricula [id->"+id +"\nAluno->" +nomeAluno + "\nDisciplina->" + nomeCurso + "\nSemestres->" + semestres + "\nAno->"
				+ ano + "\nSituacao da matricula->" + situacaoMatricula + "]\n";
	}

}
