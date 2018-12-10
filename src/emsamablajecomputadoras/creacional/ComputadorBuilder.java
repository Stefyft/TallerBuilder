package emsamablajecomputadoras.creacional;

public abstract class ComputadorBuilder {
	protected Computador compu;
	
	public Computador getComputador() {
		return compu;
	}
	
	public abstract void definirComputador();
	public abstract void construirMainboard();
	public abstract void construirSO();
	
}
