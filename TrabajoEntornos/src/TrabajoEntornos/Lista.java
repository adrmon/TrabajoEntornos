package TrabajoEntornos;


import java.util.ArrayList;

public class Lista {
	private ArrayList<Alimento> listaAlimentos;
	
	public Lista() {}
	
	public ArrayList getAlimentos() {
		
		listaAlimentos = new ArrayList<Alimento>();
		
		Alimento patatasFritas = new Alimento("Patatas Fritas", 37.47, 10.96, 49.74, 4.12, 6.56, 525, 547);
		Alimento alitasDePollo = new Alimento("Alitas de Pollo", 19.3,5.4, 0, 0, 26.64, 404, 288);
		Alimento heladoVainilla = new Alimento("Helado de Vainilla", 11, 6.79, 23.6, 21.22, 33.5, 80, 201);
		Alimento gominolas = new Alimento("Gominolas", 0.05, 0, 93.55, 70, 0, 50, 375);
		Alimento brocoli = new Alimento("Brocoli", 0.37, 0.039, 6.64, 1.7, 2.82, 33, 34);
		Alimento coliflor = new Alimento("Coliflor", 0.1, 0.032, 5.3, 2.4, 1.98, 30, 25);
		
		
		listaAlimentos.add(patatasFritas);
		listaAlimentos.add(alitasDePollo);
		listaAlimentos.add(heladoVainilla);
		listaAlimentos.add(gominolas);
		listaAlimentos.add(brocoli);
		listaAlimentos.add(coliflor);
		
		
		return listaAlimentos;
		
	}
}
