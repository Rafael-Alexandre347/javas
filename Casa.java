package Imovel;

public class Casa {
	private String endereco;
	private Porta porta;
	
	public Casa(String endereco) {
		this.endereco = endereco;
		this.porta = new Porta("Marrom","Madeira");
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public String getEndereco() {
		return endereco;
	}
	
	public String getPorta() {
		String retorno;
		retorno = ("Cor: " + porta.getCor() + " - Material: " + porta.getMaterial());
		return retorno;
	}
	
	public void abrirPorta() {
		System.out.println("Abrindo porta de cor " + porta.getCor() + " e feita de " + porta.getMaterial());
	}
}
