package entidades;

import java.util.ArrayList;
import java.util.List;

public class professor extends aluno {
	private String especializacao;
	private List<professor> listaProfessores = new ArrayList<professor>();

	public professor() {
	}

	public professor(int id, String nome, int idade, String email, String telefone, String endereco,
			String especializacao) {
		super(id, nome, idade, email, telefone, endereco);
		this.especializacao = especializacao;
	}

	public List<professor> getListaProfessores() {
		return listaProfessores;
	}

	public void adicionarProfessor(String nome, int idade, String email, String telefone, String endereco,
			String especializacao) {
		id++;
		professor novoProfessor = new professor(id, nome, idade, email, telefone, endereco, especializacao);
		if (listaProfessores.add(novoProfessor)) {
			System.out.println("Novo Professor Adicionado!");
			System.out.println();
		}

	}

	public void exibirProfessor(List<professor> listaProfessores) {
		if (listaProfessores.isEmpty()) {
			System.out.println("lista Esta Vazia!");
			return;
		}

		for (professor exibir : listaProfessores) {
			System.out.println(exibir);
		}
	}

	@Override
	public String toString() {
		return "professor[ID->" + id + "\nNome->" + nome + "\nIdade->" + idade + "\nEspecializão->" + especializacao
				+ "\nEmail->" + email + "\nTelefone->" + telefone + "\nEndereço->" + endereco + "]\n";
	}

}
