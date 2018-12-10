package emsamablajecomputadoras.creacional;

public class AsusZenbookBuilder extends ComputadorBuilder {
	
	public void definirComputador() {
		
		compu = new Computador();
		compu.setMarca("Asus");
		compu.setModelo("Zenbook");
		compu.setAlmacenamiento(500);
		compu.setRam(16);

	}

	@Override
	public void construirMainboard() {
		compu.setPlaca(new Mainboard("Prime","Z370"));
		
	}

	@Override
	public void construirSO() {
		compu.setOs(new SistemaOperativo("Windows 10",64,"Home"));
		
	}
	 
}
