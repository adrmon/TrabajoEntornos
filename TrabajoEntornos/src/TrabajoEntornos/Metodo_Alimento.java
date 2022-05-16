package TrabajoEntornos;

import java.util.ArrayList;

public class Metodo_Alimento {

	/**
	 *
	 * @param alimentos_consumidos Arraylist con los alimentos consumidos por el
	 *                             usuario
	 *
	 */

	static String calcularIngestaCaloricaMalsana(ArrayList<Alimento> alimentos_consumidos) {

		String resultado;
		// Cantidad de grasa total consumida
		double grasa = 0;
		// Cantidad de calorias consumidas en total
		double calorias = 0;

		// Obtencion de los valores totales consumidos a lo alrgo del dia
		for (int i = 0; i < alimentos_consumidos.size(); i++) {
			grasa += alimentos_consumidos.get(i).getGrasas();
			calorias += alimentos_consumidos.get(i).getCalorias();

		}
		// Valor limite del calculo, si la cantidad de grasas totales superan este
		// valor, se considera una dieta malsana
		double limite_ingesta_malsana = 0.3 * calorias;

		if (limite_ingesta_malsana >= grasa) {
			resultado = "Ingesta calorica en valores normales";
		} else {
			resultado = "Ingesta calorica malsana";
		}
		return resultado;

	}

	/**
	 *
	 * @param alimentos_consumidos Arraylist con los alimentos consumidos por el
	 *                             usuario
	 *
	 */

	static String calcularConsumoDeAzucar(ArrayList<Alimento> alimentos_consumidos) {

		String resultado;
		// Cantidad de azucar total consumido
		double azucar = 0;
		// Cantidad de calorias consumidas en total
		double calorias = 0;

		// Obtencion de los valores totales consumidos a lo alrgo del dia
		for (int i = 0; i < alimentos_consumidos.size(); i++) {
			azucar += alimentos_consumidos.get(i).getAzucar();
			calorias += alimentos_consumidos.get(i).getCalorias();

		}

		// Valor limite del calculo, si la cantidad de azucares totales superan este
		// valor, se considera una dieta malsana
		double limite_ingesta_azucar = 0.1 * calorias;
		/*
		 * Valor limite del calculo, si la cantidad de azucares totales superan este
		 * valor, se considera una dieta equilibrada si es inferior se considera una
		 * dieta saludable
		 */
		double consumo_recomendado_azucar = 0.05 * calorias;

		if (azucar <= consumo_recomendado_azucar) {
			resultado = "Consumo de azucar menor al 5% de la ingesta calorica total";
		} else if (azucar >= consumo_recomendado_azucar && azucar < limite_ingesta_azucar) {
			resultado = "Consumo de azucar menor al 10% de la ingesta calorica total";
		} else
			resultado = "Consumo de azucar superior al 10% de la ingesta calorica total";

		return resultado;
	}

	/**
	 *
	 * @param alimentos_consumidos Arraylist con los alimentos consumidos por el
	 *                             usuario
	 *
	 */
	static String calcularConsumoDiarioDeSal(ArrayList<Alimento> alimentos_consumidos) {

		String resultado;
		// Cantidad total de sal consumida
		double sal = 0;

		// Obtencion de los valores totales consumidos a lo alrgo del dia
		for (int i = 0; i < alimentos_consumidos.size(); i++) {
			sal += alimentos_consumidos.get(i).getSal();

		}

		if (sal < 5) {
			resultado = "Consumo de sal inferior a 5g diarios";
		} else {
			resultado = "Consumo elevado de sal, riesgo de enfermedades cardiovasculares e hipertension";
		}
		return resultado;
	}

	// Metodo para calcular total de nutrientes en funcion de la cantidad total de
	// gramos del alimento

	
}
