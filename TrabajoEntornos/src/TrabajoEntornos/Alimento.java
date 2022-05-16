package TrabajoEntornos;

import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 * <h2>Clase Alimento</h2> Esta clase almacena los distintos valores
 * nutricionales de un alimento por cada 100g de dicho alimento.
 *
 * @author Agust�n Albert Laporta
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

	protected JPanel panel = new JPanel();

	public Alimento(String nombre, double grasas, double grasas_saturadas, double hidratos, double azucar,
			double proteinas, double sal, double calorias) {
		this.nombre = nombre;
		this.grasas = grasas;
		if (grasas_saturadas <= grasas) {
			this.grasas_saturadas = grasas_saturadas;
		} else
			JOptionPane.showMessageDialog(panel,
					"Las grasas saturadas de " + this.getNombre() + " no pueden ser mayores que las grasas", "Warning",
					JOptionPane.WARNING_MESSAGE);

		this.hidratos = hidratos;
		if (azucar <= hidratos) {
			this.azucar = azucar;
		} else
			JOptionPane.showMessageDialog(panel,
					"El azucar de " + this.getNombre() + " no puede ser mayor que los hidratos", "Warning",
					JOptionPane.WARNING_MESSAGE);
		this.proteinas = proteinas;
		this.sal = sal;
		this.calorias = calorias;
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
	 * @param gramos Cantidad de gramos totales del alimento
	 * 
	 *
	 */
	public void calcularCantidadNutrientesTotales(double gramos) {

		this.grasas = (this.grasas * gramos) / 100;
		this.grasas_saturadas = (this.grasas_saturadas * gramos) / 100;
		this.hidratos = (this.hidratos * gramos) / 100;
		this.azucar = (this.azucar * gramos) / 100;
		this.proteinas = (this.proteinas * gramos) / 100;
		this.sal = (this.sal * gramos) / 100;
		this.calorias = (this.calorias * gramos) / 100;

	}


	@Override
	public String toString() {
		return "Alimento [nombre=" + nombre + ", grasas=" + grasas + ", grasas_saturadas=" + grasas_saturadas
				+ ", hidratos=" + hidratos + ", azucar=" + azucar + ", proteinas=" + proteinas + ", sal=" + sal
				+ ", calorias=" + calorias + "]";
	}

}
