package models;

public class Consulta 
{
	private int codigo;
	private String data, hora, status;
	private Float preco;
	private boolean pagamento;
	private Paciente paciente;
	private Medico medico;
	
	public Consulta() {
		super();
	}

	public Consulta(int codigo, String data, String hora, String status, Float preco, boolean pagamento,
			Paciente paciente, Medico medico) {
		super();
		this.codigo = codigo;
		this.data = data;
		this.hora = hora;
		this.status = status;
		this.preco = preco;
		this.pagamento = pagamento;
		this.paciente = paciente;
		this.medico = medico;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Float getPreco() {
		return preco;
	}

	public void setPreco(Float preco) {
		this.preco = preco;
	}

	public boolean isPagamento() {
		return pagamento;
	}

	public void setPagamento(boolean pagamento) {
		this.pagamento = pagamento;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public Medico getMedico() {
		return medico;
	}

	public void setMedico(Medico medico) {
		this.medico = medico;
	}
}