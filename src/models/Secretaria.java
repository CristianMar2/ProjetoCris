package models;

public class Secretaria extends Pessoa
{
	private String matricula, horarioTrabalho;

	public Secretaria(String nome, String sexo, String telefone, String senha, int idade, String matricula,
			String horarioTrabalho) {
		super(nome, sexo, telefone, senha, idade);
		this.matricula = matricula;
		this.horarioTrabalho = horarioTrabalho;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getHorarioTrabalho() {
		return horarioTrabalho;
	}

	public void setHorarioTrabalho(String horarioTrabalho) {
		this.horarioTrabalho = horarioTrabalho;
	}
}