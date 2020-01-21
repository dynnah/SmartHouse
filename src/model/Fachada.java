package model;

import repositorio.Casa;

public class Fachada {
	
	private LampadaFactory fabrica = new LampadaFactory();
	private Casa casa = new Casa();
	
	public String criarCenario(String nome) throws Exception{
		Cenario c = casa.localizarCenario(nome);
		if (c!=null)
			throw new Exception("Cenario ja cadastrado!");
		
		c = new Cenario(nome);
		casa.adicionarCenario(c);
		
		return "Cenario " + nome + " criado.";
	}
	
	//liga todas lampadas do cenario
	public void ativarCenario() {};
	
	//desliga todas lampadas do cenario
	public void desativarCenario() {};
	
	
	public void ligarLampada(Cenario c) {
		//buscar cenario e ligar a lampada
	}
	
	public void desligarLampada(Cenario c) {
		//buscar cenario e desligar a lampada
	}

}
