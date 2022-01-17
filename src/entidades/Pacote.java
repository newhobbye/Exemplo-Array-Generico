package entidades;

public class Pacote {
	
	private Integer numero;
	private Double peso;
	
	
	public Pacote() {
		
	}

	public Pacote(int numero, double peso) {
		this.numero = numero;
		this.peso = peso;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	@Override
	public String toString() {
		return "Pacote [numero=" + numero + ", peso=" + peso + "]";
	}
	
	

}
