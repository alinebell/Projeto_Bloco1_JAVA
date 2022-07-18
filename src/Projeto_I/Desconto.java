package Projeto_I;

public abstract class Desconto {
private double tipo;
	
	public Desconto(double tipo) {
		this.tipo = tipo;
	}
	
	abstract public void desconto(double numero);

	public double getTipo() {
		return tipo;
	}

	public void setTipo(double tipo) {
		this.tipo = tipo;
	}

	
	
	



}
