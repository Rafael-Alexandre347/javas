package veiculo;

public class Carro extends Veiculo{
	
	public Carro(String marca, String modelo, boolean estaLigado, int qtdePortas) {
		super(marca, modelo, estaLigado);
		this.qtdePortas = qtdePortas;
	}

	private int qtdePortas;
	
	public void abrirPorta() {}

	public int getQtdePortas() {
		return qtdePortas;
	}

	public void setQtdePortas(int qtdePortas) {
		this.qtdePortas = qtdePortas;
	}

	
}
