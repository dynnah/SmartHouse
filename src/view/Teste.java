package view;

import model.Cenario;
import model.Comodo;
import model.Fachada;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {	
			Fachada.criarComodos();
			Fachada.criarCenario("Festa");
			Fachada.inserirComodosCenario("Sala", "Festa");
			Fachada.inserirComodosCenario("Terraco", "Festa");
			
			for(Cenario c : Fachada.listarCenarios()) {
				System.out.println(c.getNome());
			}
			
			for(Comodo co : Fachada.listarComodos()) {
				System.out.println(co.getNome());
			}
			
			for(Comodo comodo : Fachada.localizarCenario("Festa").getComodos())
				System.out.println(comodo);
				
				
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
