package models;

public class Medico extends Pessoa
{
	private String crm, especialidade;

	public Medico(String nome, String sexo, String telefone, String senha, int idade, String crm, String especialidade) {
		super(nome, sexo, telefone, senha, idade);
		this.crm = crm;
		this.especialidade = especialidade;
	}

	public String getCrm() {
		return crm;
	}

	public void setCrm(String crm) {
		this.crm = crm;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
}