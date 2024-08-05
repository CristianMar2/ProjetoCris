package models;

public abstract class Pessoa 
{
	private String nome, sexo, telefone, senha;
	private int idade;
	
	public Pessoa(String nome, String sexo, String telefone, String senha, int idade) {
		this.nome = nome;
		this.sexo = sexo;
		this.telefone = telefone;
		this.senha = senha;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getSexo() {
		return sexo;
	}
	
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	public String getTelefone() {
		return telefone;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
}