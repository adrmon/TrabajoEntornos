import java.util.ArrayList;

/**
 * <h2>Clase Alimento</h2> Esta clase almacena los distintos valores
 * nutricionales de un alimento por cada 100g de dicho alimento.
 *
 * @author Agustín Albert Laporta
 * @version 1.0
 *
 */

public class Alimento {

	/**
	 * Atributo nombre
	 *
	 * Indica el nombre del alimento
	 *
	 */

	protected String nombre;

	/**
	 * Atributo grasas
	 *
	 * Indica la cantidad total de grasas, incluidas las grasas saturadas
	 *
	 */

	protected double grasas;

	/**
	 * Atributo grasas_saturadas
	 *
	 * Indica la cantidad de grasas saturadas
	 *
	 */
	protected double grasas_saturadas;

	/**
	 * Atributo hidratos
	 *
	 * Indica la cantidad de hidratos de carbono, incluidos los azucares
	 *
	 */
	protected double hidratos;

	/**
	 * Atributo azucar
	 *
	 * Indica la cantidad de azucar
	 *
	 */
	protected double azucar;

	/**
	 * Atributo proteinas
	 *
	 * Indica la cantidad de proteinas
	 *
	 */
	protected double proteinas;

	/**
	 * Atributo sal
	 *
	 * Indica la cantidad de sal
	 *
	 */
	protected double sal;

	/**
	 * Atributo calorias
	 *
	 * Indica la cantidad de calorias
	 *
	 */
	protected double calorias;
	
	public Alimento(String nombre, double grasas, double grasas_saturadas,double hidratos, 
			double azucar,double proteinas, double sal, double calorias) {
		this.nombre=nombre;
		this.grasas=grasas;
		this.grasas_saturadas=grasas_saturadas;
		this.hidratos=hidratos;
		this.azucar=azucar;
		this.proteinas=proteinas;
		this.sal=sal;
		this.calorias=calorias;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getGrasas() {
		return grasas;
	}

	public void setGrasas(double grasas) {
		this.grasas = grasas;
	}

	public double getGrasas_saturadas() {
		return grasas_saturadas;
	}

	public void setGrasas_saturadas(double grasas_saturadas) {
		this.grasas_saturadas = grasas_saturadas;
	}

	public double getHidratos() {
		return hidratos;
	}

	public void setHidratos(double hidratos) {
		this.hidratos = hidratos;
	}

	public double getAzucar() {
		return azucar;
	}

	public void setAzucar(double azucar) {
		this.azucar = azucar;
	}

	public double getProteinas() {
		return proteinas;
	}

	public void setProteinas(double proteinas) {
		this.proteinas = proteinas;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	public double getCalorias() {
		return calorias;
	}

	public void setCalorias(double calorias) {
		this.calorias = calorias;
	}

	/**
	 *
	 * @param alimentos_consumidos Arraylist con los alimentos consumidos por el
	 *                             usuario
	 *
	 */

	void calcularIngestaCaloricaMalsana(ArrayList<Alimento> alimentos_consumidos) {

		// Cantidad de grasa total consumida
		double grasa = 0;
		// Cantidad de calorías consumidas en total
		double calorias = 0;
		// Valor límite del cálculo, si la cantidad de grasas totales superan este
		// valor, se considera una dieta malsana
		double limite_ingesta_malsana = 0.3 * calorias;

		// Obtención de los valores totales consumidos a lo alrgo del día
		for (int i = 0; i < alimentos_consumidos.size(); i++) {
			grasa += alimentos_consumidos.get(i).getGrasas();
			calorias += alimentos_consumidos.get(i).getCalorias();

		}

		if (limite_ingesta_malsana > grasa) {
			System.out.println("Ingesta calórica en valores normales");
		} else
			System.out.println("Ingesta calórica malsana");

	}

	/**
	 *
	 * @param alimentos_consumidos Arraylist con los alimentos consumidos por el
	 *                             usuario
	 *
	 */

	void calcularConsumoDeAzucar(ArrayList<Alimento> alimentos_consumidos) {

		// Cantidad de azucar total consumido
		double azucar = 0;
		// Cantidad de calorías consumidas en total
		double calorias = 0;
		// Valor límite del cálculo, si la cantidad de grasas totales superan este
		// valor, se considera una dieta malsana
		double limite_ingesta_azucar = 0.1 * calorias;
		/*
		 * Valor límite del cálculo, si la cantidad de grasas totales superan este
		 * valor, se considera una dieta equilibrada si es inferior se considera una
		 * dieta saludable
		 */
		double consumo_recomendado_azucar = 0.05 * calorias;

		// Obtención de los valores totales consumidos a lo alrgo del día
		for (int i = 0; i < alimentos_consumidos.size(); i++) {
			azucar += alimentos_consumidos.get(i).getAzucar();
			calorias += alimentos_consumidos.get(i).getCalorias();

		}

		if (azucar < consumo_recomendado_azucar) {
			System.out.println("Consumo de azucar menor al 5% de la ingesta calórica total");
		} else if (azucar > consumo_recomendado_azucar && azucar < limite_ingesta_azucar) {
			System.out.println("Consumo de azucar menor al 10% de la ingesta calórica total");
		} else
			System.out.println("Consumo de azucar superior al 10% de la ingesta calçorica total");
	}

	/**
	 *
	 * @param alimentos_consumidos Arraylist con los alimentos consumidos por el
	 *                             usuario
	 *
	 */
	void calcularConsumoDiarioDeSal(ArrayList<Alimento> alimentos_consumidos) {
		// Cantidad total de sal consumida
		double sal = 0;

		// Obtención de los valores totales consumidos a lo alrgo del día
		for (int i = 0; i < alimentos_consumidos.size(); i++) {
			sal += alimentos_consumidos.get(i).getSal();

		}

		if (sal < 5) {
			System.out.println("Consumo de sal inferior a 5g diarios");
		} else {
			System.out.println("Consumo elevado de sal, riesgo de enfermedades cardiopáticas e hipertension");
		}
	}

	@Override
	public String toString() {
		return "Alimento [grasas=" + grasas + ", grasas_saturadas=" + grasas_saturadas + ", hidratos=" + hidratos
				+ ", azucar=" + azucar + ", proteinas=" + proteinas + ", sal=" + sal + ", calorias=" + calorias + "]";
	}

}
