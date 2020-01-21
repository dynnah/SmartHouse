package view;

import factory.*;

public class App {
	
	private static Lampada criarLampada(String tipo) {
		LampadaFactory lf = null;
		
		if (tipo.compareTo("led") == 0)
			lf = new LampadaLED();
		
		else if (tipo.compareTo("incandescente") == 0)
			lf = new LampadaIncandescente();
		
		
		Lampada l = new Lampada();
		l.setCor(lf.criarLampada());
		l.setLuminacia(lf.criarLampada());
		return l;
		
	}
	
	public static void main(String[] args){
		Lampada l1 = criarLampada("led");
		Lampada l2 = criarLampada("incandescente");
	}
		
}
