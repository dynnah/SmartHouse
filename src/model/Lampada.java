package model;

public abstract class Lampada {
	private boolean ativo = false;
	private String luminancia;
	private Cenario cenario;
	
	public Lampada(){}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
	
	public String getLuminancia() {
		return luminancia;
	}

	public void setLuminancia(String luminancia) {
		this.luminancia = luminancia;
	}
	
	public Cenario getCenario() {
		return cenario;
	}

	public void setCenario(Cenario cenario) {
		this.cenario = cenario;
	}

	public void ligar() {
		this.ativo = true;
	}
	
	public void desligar() {
		this.ativo = false;
	}
	
}