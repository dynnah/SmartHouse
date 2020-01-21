package model;

import java.util.ArrayList;
import java.util.List;

/*
- cenarios: List
- dispositivos: List<Lampada>
- status: boolean
+ ativarCenario: void
 */

public class Cenario {
	
	 private List<Comodo> comodos= new ArrayList<Comodo>();
	 private String nome;
	 
	 public Cenario(String nome) {
		 this.nome = nome;
	 }
	 
	 public void adicionarComodo(Comodo c){
			comodos.add(c);
	 } 
	 
	 public void removerComodo(Comodo c){
			comodos.remove(c);
	 }
	 
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public List<Comodo> getComodos() {
		return comodos;
	}

	public void setComodos(List<Comodo> comodos) {
		this.comodos = comodos;
	}

	@Override
	public String toString() {
		return "Cenario: " + this.getNome() + "[comodos=" + comodos + "]";
	} 
	 
}
