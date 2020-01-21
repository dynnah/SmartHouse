package model;

import factory.Lampada;
import factory.LampadaFactory;

public interface Fachada {
	
	public Cenario criarCenario();
	public void ativarCenario();
	public void desativarCenario();
	public LampadaFactory criarFabrica();
	public Lampada criarLampada();
	public void ligarLampada();
	public void desligarLampada();

}
