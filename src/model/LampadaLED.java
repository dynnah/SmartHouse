package model;

public class LampadaLED extends Lampada {
	private String cor;
	
	public LampadaLED(String cor){
		this.cor = cor;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	@Override
	public String toString() {
		return "LampadaLED [cor=" + cor + "    ativo: " + super.isAtivo() + "]";
	}
	
	
}