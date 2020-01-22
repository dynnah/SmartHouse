package model;

import java.util.ArrayList;
import java.util.List;

public class Comodo {

	private String nome;
	private List<Lampada> lampadas = new ArrayList<Lampada>();


	public Comodo(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void adicionarLampada(Lampada l){
		lampadas.add(l);
		l.setComodo(this);
	}

	public void removerLampada(Lampada l){
		lampadas.remove(l);
		l.setComodo(null);
	} 
	
	public int quantidadeLampadas() {
		return lampadas.size();
	}

	public List<Lampada> getLampadas() {
		return lampadas;
	}

	public void setLampadas(List<Lampada> lampadas) {
		this.lampadas = lampadas;
	}

	@Override
	public String toString() {
		return "Comodo [nome=" + nome + ", lampadas=" + lampadas + "]";
	}
	
	
	
}
