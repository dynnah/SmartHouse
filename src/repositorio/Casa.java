package repositorio;

import java.util.ArrayList;
import java.util.List;

import model.Cenario;
import model.Comodo;
import model.Lampada;

public class Casa {

	private ArrayList<Lampada> lampadas = new ArrayList<Lampada>();
	private ArrayList<Cenario> cenarios = new ArrayList<Cenario>();
	private ArrayList<Comodo> comodos = new ArrayList<Comodo>();
	
	public Casa(){}
	
	public void adicionarLampada(Lampada lampada) {
		lampadas.add(lampada);
	}
	
	public void removerLampada(Lampada lampada) {
		lampadas.remove(lampada);
	}
	
	public void adicionarCenario(Cenario cenario) {
		cenarios.add(cenario);
	}
	
	public void removerCenario(Cenario cenario) {
		cenarios.remove(cenario);
	}
	
	public void adicionarComodo(Comodo comodo) {
		comodos.add(comodo);
	}
	
	public void removerComodo(Comodo comodo) {
		comodos.remove(comodo);
	}
	
	public Cenario localizarCenario(String nome){
		for(Cenario c : cenarios){
			if(c.getNome().equals(nome))
				return c;
		}
		return null;
	}
	
	public Comodo localizarComodo(String nome){
		for(Comodo c : comodos){
			if(c.getNome().equals(nome))
				return c;
		}
		return null;
	}

	public ArrayList<Lampada> getLampadas() {
		return lampadas;
	}

	public void setLampadas(ArrayList<Lampada> lampadas) {
		this.lampadas = lampadas;
	}

	public ArrayList<Cenario> getCenarios() {
		return cenarios;
	}

	public void setCenarios(ArrayList<Cenario> cenarios) {
		this.cenarios = cenarios;
	}

	public ArrayList<Comodo> getComodos() {
		return comodos;
	}

	public void setComodos(ArrayList<Comodo> comodos) {
		this.comodos = comodos;
	}

}
