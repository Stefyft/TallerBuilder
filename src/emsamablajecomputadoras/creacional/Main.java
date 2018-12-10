package emsamablajecomputadoras.creacional;

public class Main {

	public static void main(String[] args) {
		
		ComputadorDirector directorZenbook = new ComputadorDirector(new AsusZenbookBuilder());
		
		directorZenbook.ConstruirComputador();
		
		Computador asuszenbook = directorZenbook.getComputador();
		
		
		
		ComputadorDirector directorROGUE = new ComputadorDirector(new AsusROGEBuilder());
		
		directorROGUE.ConstruirComputador();
		
		Computador asusroge = directorROGUE.getComputador();
		
		
		System.out.println("Computador Asus Zenbook: "+ asuszenbook.especificacionesTecnicas());
		System.out.println("Computador Asus ROGE: "+ asusroge.especificacionesTecnicas());

	}
}
