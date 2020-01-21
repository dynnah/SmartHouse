package factory;

public class LampadaIncandescente extends LampadaFactory {
	
	public Cor definirCor() {
		return new CorIncandescente();
	}

	public Luminancia definirLuminancia() {
		return new LuminanciaIncandescente();
	}

	@Override
	public Lampada criarLampada() {
		// TODO Auto-generated method stub
		return null;
	}

}
