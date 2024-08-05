package models;

public class Exame
{
	private int codigo;
	private String descricao, data, resultado;
	private Paciente paciente;
	
	public Exame() {
		super();
	}

	public Exame(int codigo, String descricao, String data, String resultado, Paciente paciente) {
		super();
		this.codigo = codigo;
		this.descricao = descricao;
		this.data = data;
		this.resultado = resultado;
		this.paciente = paciente;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getResultado() {
		return resultado;
	}

	public void setResultado(String resultado) {
		this.resultado = resultado;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}
}