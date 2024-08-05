package models;

public class Prontuario 
{
	private int numero;
	private String alergia, medicamentoUso, cirurgia, historico;
	private Paciente paciente;
	
	public Prontuario() {
		super();
	}

	public Prontuario(int numero, String alergia, String medicamentoUso, String cirurgia, String historico,
			Paciente paciente) {
		super();
		this.numero = numero;
		this.alergia = alergia;
		this.medicamentoUso = medicamentoUso;
		this.cirurgia = cirurgia;
		this.historico = historico;
		this.paciente = paciente;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getAlergia() {
		return alergia;
	}

	public void setAlergia(String alergia) {
		this.alergia = alergia;
	}

	public String getMedicamentoUso() {
		return medicamentoUso;
	}

	public void setMedicamentoUso(String medicamentoUso) {
		this.medicamentoUso = medicamentoUso;
	}

	public String getCirurgia() {
		return cirurgia;
	}

	public void setCirurgia(String cirurgia) {
		this.cirurgia = cirurgia;
	}

	public String getHistorico() {
		return historico;
	}

	public void setHistorico(String historico) {
		this.historico = historico;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}
}