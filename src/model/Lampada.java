package model;

public abstract class Lampada {
	private boolean ativo = false;
	private String luminancia;
	private Comodo comodo;
	
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
	
	public Comodo getComodo() {
		return comodo;
	}

	public void setComodo(Comodo comodo) {
		this.comodo = comodo;
	}

	public void ligar() {
		this.ativo = true;
	}
	
	public void desligar() {
		this.ativo = false;
	}

	@Override
	public String toString() {
		return "Lampada [ativo=" + ativo + ", luminancia=" + luminancia + ", comodo=" + comodo + "]";
	}
	
}