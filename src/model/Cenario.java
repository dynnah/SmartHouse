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
	
	 private List<Cenario> cenarios = new ArrayList<Cenario>();
	 private List<Lampada> lampadas = new ArrayList<Lampada>();
	 private String nome;
	 
	 public Cenario(String nome) {
		 this.nome = nome;
	 }
	 
	 public void adicionarLampada(Lampada l){
			lampadas.add(l);
			l.setCenario(this);
	 }
	 
	 public void removerLampada(Lampada l){
			lampadas.remove(l);
			l.setCenario(null);
	} 
	 
	 public void adicionarCenario(Cenario c){
			cenarios.add(c);
			c.adicionarCenario(this);
	 } 
	 
	 public void removerCenario(Cenario c){
			cenarios.remove(c);
			c.removerCenario(this);
	 }
	 
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Cenario [cenarios=" + cenarios + ", lampadas=" + lampadas + ", nome=" + nome + "]";
	} 
	 
}
