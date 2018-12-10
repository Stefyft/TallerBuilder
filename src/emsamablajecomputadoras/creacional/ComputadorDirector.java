package emsamablajecomputadoras.creacional;

public class ComputadorDirector {
	private ComputadorBuilder builder;
	
	public ComputadorDirector(ComputadorBuilder builder) {
		this.builder = builder;
	}
	
	public void ConstruirComputador() {
		builder.definirComputador();
		builder.construirMainboard();
		builder.construirSO();
	}
	
	public Computador getComputador() {
		return builder.getComputador();
	}
}
