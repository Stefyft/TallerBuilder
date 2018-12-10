package emsamablajecomputadoras.creacional;

public class AsusROGEBuilder extends ComputadorBuilder {
	
	public void definirComputador() {
		
		compu = new Computador();
		compu.setMarca("Asus");
		compu.setModelo("ROG");
		compu.setAlmacenamiento(1000);
		

	Ram: ddr4 32 gb

•	Sistema operativo: Windows 10 PRO 64 bits
•	Mainboard : Strix x99
*/
		
	}

	@Override
	public void construirMainboard() {
		compu.setPlaca(new Mainboard("",""));
		compu.
		
	}

	@Override
	public void construirSO() {
		compu.setOs(new SistemaOperativo("", , ));
		
	}
	 
}
