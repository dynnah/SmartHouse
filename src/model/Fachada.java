package model;

import repositorio.Casa;

public class Fachada {
	
	private LampadaFactory fabrica = new LampadaFactory();
	private Casa casa = new Casa();
	
	public String criarCenario(String nome) throws Exception{
		Cenario c = casa.localizarCenario(nome);
		if (c != null)
			throw new Exception("Cenario ja cadastrado!");
		
		c = new Cenario(nome);
		casa.adicionarCenario(c);
		
		return "Cenario " + nome + " criado.";
	}
	
	public String excluirCenario(String nome) throws Exception{
		Cenario c = casa.localizarCenario(nome);
		if (c == null)
			throw new Exception("Cenario Inexistente!");
		
		casa.removerCenario(c);
		
		return "Cenario " + nome + " excluido.";
	}
	
	//liga todas lampadas do cenario
	public void ativarCenario(String nome) throws Exception{
		Cenario c = casa.localizarCenario(nome);
		if (c == null)
			throw new Exception("Cenario Inexistente!");
		
		
		for(Comodo comodo : c.getComodos()) {
			for(Lampada l: comodo.getLampadas())
				l.ligar();
		}
		
	}
	
	//desliga todas lampadas do cenario
	public void desativarCenario(String nome) throws Exception{
		Cenario c = casa.localizarCenario(nome);
		if (c == null)
			throw new Exception("Cenario Inexistente!");
		
		
		for(Comodo comodo : c.getComodos()) {
			for(Lampada l: comodo.getLampadas())
				l.desligar();
		}
	}
	
	
	public void ligarLampada(String nome) throws Exception{
		//buscar comodo e ligar a lampada
		Comodo c = casa.localizarComodo(nome);
		if (c == null)
			throw new Exception("Comodo Inexistente!");
		
		Lampada l = c.getLampadas().get(0);
		l.ligar();
		
	}
	
	public void desligarLampada(String nome) throws Exception{
		//buscar comodo e desligar a lampada
		Comodo c = casa.localizarComodo(nome);
		if (c == null)
			throw new Exception("Comodo Inexistente!");
		
		Lampada l = c.getLampadas().get(0);
		l.desligar();
	}

}
