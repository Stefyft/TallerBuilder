package emsamablajecomputadoras.creacional;

public class AsusROGEBuilder extends ComputadorBuilder {
	
	public void definirComputador() {
		
		compu = new Computador();
		compu.setMarca("Asus");
		compu.setModelo("ROG");
		compu.setAlmacenamiento(1000);
		compu.setRam(32);

	}

	@Override
	public void construirMainboard() {
		compu.setPlaca(new Mainboard("Strix","x99"));

	}

	@Override
	public void construirSO() {
		compu.setOs(new SistemaOperativo("Windows 10",64,"PRO"));
		
	}
	 
}
