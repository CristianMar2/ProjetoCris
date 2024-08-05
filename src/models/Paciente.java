package models;

public class Paciente extends Pessoa
{
	private String cpf, endereco, email, convenio;

	public Paciente(String nome, String sexo, String telefone, String senha, int idade, String cpf, String endereco, String email,
			String convenio) {
		super(nome, sexo, telefone, senha, idade);
		this.cpf = cpf;
		this.endereco = endereco;
		this.email = email;
		this.convenio = convenio;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getConvenio() {
		return convenio;
	}

	public void setConvenio(String convenio) {
		this.convenio = convenio;
	}
}