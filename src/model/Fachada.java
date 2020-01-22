package model;

import repositorio.Casa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Fachada {

	private LampadaFactory fabrica = new LampadaFactory();
	private static Casa casa = new Casa();

	public static Cenario criarCenario(String nome) throws Exception{
		Cenario c = casa.localizarCenario(nome);
		if (c != null)
			throw new Exception("Cenario ja cadastrado!");

		c = new Cenario(nome);
		casa.adicionarCenario(c);

		return c;
	}

	public static String excluirCenario(String nome) throws Exception{
		Cenario c = casa.localizarCenario(nome);
		if (c == null)
			throw new Exception("Cenario Inexistente!");

		casa.removerCenario(c);

		return "Cenario " + nome + " excluido.";
	}

	//liga todas lampadas do cenario
	public static void ativarCenario(String nome) throws Exception{
		Cenario c = casa.localizarCenario(nome);
		if (c == null)
			throw new Exception("Cenario Inexistente!");


		for(Comodo comodo : c.getComodos()) {
			for(Lampada l: comodo.getLampadas())
				l.ligar();
		}

	}

	//desliga todas lampadas do cenario
	public static void desativarCenario(String nome) throws Exception{
		Cenario c = casa.localizarCenario(nome);
		if (c == null)
			throw new Exception("Cenario Inexistente!");


		for(Comodo comodo : c.getComodos()) {
			for(Lampada l: comodo.getLampadas())
				l.desligar();
		}
	}
	
	
	public static void inserirComodosCenario(String comodo, String cenario) throws Exception{
		Cenario ce = casa.localizarCenario(cenario);
		if (ce == null)
			throw new Exception("Cenario Inexistente!");
		
		Comodo co = casa.localizarComodo(comodo);
		if (co == null)
			throw new Exception("Comodo Inexistente!");
		
		ce.adicionarComodo(co);
		
	}
	
	public static String statusCenario(String nome) throws Exception{
		Cenario c = casa.localizarCenario(nome);
		if (c == null)
			throw new Exception("Cenario Inexistente!");
		
		if(c.isAtivo())
			return "Cenario" + nome + "esta ativado.";
		else
			return "Cenario" + nome + "esta desativado.";
					
	}

	public static void criarComodos() {
		List<String> nomes = Arrays.asList("Sala", "Cozinha", "Quarto", "Terraco", "Banheiro");
		
		for(String nome : nomes) {
			Comodo c = new Comodo(nome);
			casa.adicionarComodo(c);
		}
	}
	
	public static String excluirComodo(String nome) throws Exception{
		Comodo c = casa.localizarComodo(nome);
		if (c == null)
			throw new Exception("Comodo Inexistente!");

		casa.removerComodo(c);

		return "Cenario " + nome + " excluido.";
	}
	
	
	public static void adicionarLampadaComodo() {
		
	}

	public static void ligarLampada(String nome) throws Exception{
		//buscar comodo e ligar a lampada
		Comodo c = casa.localizarComodo(nome);
		if (c == null)
			throw new Exception("Comodo Inexistente!");

		Lampada l = c.getLampadas().get(0);
		l.ligar();

	}

	public static void desligarLampada(String nome) throws Exception{
		//buscar comodo e desligar a lampada
		Comodo c = casa.localizarComodo(nome);
		if (c == null)
			throw new Exception("Comodo Inexistente!");

		Lampada l = c.getLampadas().get(0);
		l.desligar();
	}
	
	public static ArrayList<Cenario> listarCenarios() {
		return casa.getCenarios();
	}
	
	public static ArrayList<Comodo> listarComodos() {
		return casa.getComodos();
	}
	
	public static Cenario localizarCenario(String nome){
		for(Cenario c : casa.getCenarios()){
			if(c.getNome().equals(nome))
				return c;
		}
		return null;
	}
	
	public static Comodo localizarComodo(String nome){
		for(Comodo c : casa.getComodos()){
			if(c.getNome().equals(nome))
				return c;
		}
		return null;
	}
	
}
