package model;

public class LampadaFactory {
	
	public LampadaFactory(){}
	
	public Lampada criarLampadaLED(String cor) {
		return new LampadaLED(cor);
	}
	
	public Lampada criarLampadaIncandescente() {
		return new LampadaIncandescente();
	}
	
}