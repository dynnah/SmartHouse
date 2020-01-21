package factory;

public class LampadaLED extends LampadaFactory {
	
	public Cor definirCor() {
		return new CorLED();
	}

	public Luminancia definirLuminancia() {
		return new LuminanciaLED();
	}

	@Override
	public Lampada criarLampada() {
		// TODO Auto-generated method stub
		return null;
	}

}
