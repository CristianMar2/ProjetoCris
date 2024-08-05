package models;

public class Prescricao
{
	private int codigo;
	private String medicamento, instrucoesUso;
	private Paciente paciente;
	
	public Prescricao(int codigo, String medicamento, String instrucoesUso, Paciente paciente) {
		super();
		this.codigo = codigo;
		this.medicamento = medicamento;
		this.instrucoesUso = instrucoesUso;
		this.paciente = paciente;
	}

	public Prescricao() {
		super();
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getMedicamento() {
		return medicamento;
	}

	public void setMedicamento(String medicamento) {
		this.medicamento = medicamento;
	}

	public String getInstrucoesUso() {
		return instrucoesUso;
	}

	public void setInstrucoesUso(String instrucoesUso) {
		this.instrucoesUso = instrucoesUso;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}
}