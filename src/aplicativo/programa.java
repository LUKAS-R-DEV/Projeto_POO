package aplicativo;

import entidades.aluno;
import entidades.disciplina;
import entidades.matricula;
import entidades.professor;
import entidades.status;

public class programa {

	public static void main(String[] args) {
		aluno aluno = new aluno();
		professor professor = new professor();
		disciplina disciplina = new disciplina(professor.getListaProfessores());
		matricula matricula = new matricula(aluno.getListaAlunos(), disciplina.getListaDisciplinas());

		aluno.adicionarAluno("lucas", 21, "lucas.com", "87 1234", "Arcoverde", 2, 9);
		aluno.adicionarAluno("bruno", 27, "bruno.com", "87 4321", "Sertânia", 6, 7);
		aluno.adicionarAluno("marcos", 22, "marcos.com", "87 4215", "Arcoverde", 5, 6);
		
		professor.adicionarProfessor("Alexandre", 35, "xande.com", "87 0987", "Recife", "Física");
		professor.adicionarProfessor("David", 43, "david.com", "87 7890", "Monteiro", "Química");
		
		disciplina.adicionarDisciplina("Física Quantica", "60 horas", 4, 1);
		disciplina.adicionarDisciplina("Química", "50 horas", 3, 2);
		
		matricula.adicionarMatriculaCurso(1, 1, "2","2020" ,status.ativa);
		matricula.adicionarMatriculaCurso(2, 1, "2", "2024",status.trancada);
		
		
		
		//aluno.exibirAlunos(aluno.getListaAlunos());
		

		//aluno.verificarFaltas(aluno.getListaAlunos());
		//aluno.exibirAprovadosReprovados(aluno.getListaAlunos());
		//aluno.exibirAlunos(aluno.getListaAlunos());
		
		//professor.exibirProfessor(professor.getListaProfessores());
		
		//disciplina.exibirDisciplinas(disciplina.getListaDisciplinas());
		
		//matricula.exibirMatriculas(matricula.getListaMatriculas());
		
		
		
	
		
		
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
	}

}
