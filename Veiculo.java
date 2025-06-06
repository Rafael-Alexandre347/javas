package veiculo;

public class Veiculo {
	private String marca;
	private String modelo;
	private boolean estaLigado;
	
	public Veiculo(String marca, String modelo, boolean estaLigado) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.estaLigado = estaLigado;
	}
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public boolean isEstaLigado() {
		return estaLigado;
	}
	public void setEstaLigado(boolean estaLigado) {
		this.estaLigado = estaLigado;
	}

	
}
