package repositorio;

import java.util.ArrayList;
import java.util.List;

import model.Cenario;
import model.Lampada;

public class Casa {

	private List<Lampada> lampadas = new ArrayList<Lampada>();
	private List<Cenario> cenarios = new ArrayList<Cenario>();
	
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
	
	public Cenario localizarCenario(String nome){
		for(Cenario c : cenarios){
			if(c.getNome().equals(nome))
				return c;
		}
		return null;
	}
	
}
