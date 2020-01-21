package view;

import model.Cenario;
import model.Comodo;
import model.Fachada;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String texto;
		
		try {	
			Fachada.criarComodos();
			texto = Fachada.criarCenario("Festa");
			
			for(Cenario c : Fachada.listarCenarios()) {
				System.out.println(c.getNome());
			}
			
			for(Comodo co : Fachada.listarComodos()) {
				System.out.println(co.getNome());
			}
			
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
