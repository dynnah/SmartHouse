package factory;

public abstract class LampadaFactory {
	
	public LampadaFactory() {}

	public abstract Lampada criarLampada();
	public abstract Cor definirCor();
	public abstract Luminancia definirLuminancia();
	
}
