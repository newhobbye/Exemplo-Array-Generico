package entidades;

public class Caminhao {

	private final Integer numero;
	private final Double limiteMaxPeso;
	private final Pilha<Pacote> pacotes;
    private Double totalPeso = 0.0;

	public Caminhao(Integer numero, Double limiteMaxPeso) {
		this.numero = numero;
		this.limiteMaxPeso = limiteMaxPeso;
		this.pacotes = new Pilha<Pacote>();

	}

	public int getNumero() {
		return numero;
	}

	public double getLimiteMaxPeso() {
		return limiteMaxPeso;
	}

	public void adicionarPacote(Pacote pacote) {
		if (pacote.getPeso() + totalPeso <= limiteMaxPeso) {
			totalPeso += pacote.getPeso();
			pacotes.adicionarElemento(pacote);
		}

	}

	public Double totalPeso() {
		return this.totalPeso;
	}

	public Double getTotalDisponivel() {
		return this.limiteMaxPeso - this.totalPeso;
	}

	public Pilha<Pacote> getPacotes() {
		return pacotes;
	}

	public Double getTotalPeso() {
		return totalPeso;
	}

	public void setTotalPeso(Double totalPeso) {
		this.totalPeso = totalPeso;
	}

}
