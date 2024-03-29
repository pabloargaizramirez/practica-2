package mates;

import java.util.Random;

import java.util.Scanner;

/**
 * * @see Matematicas Esta clase posee metodos para realizar pequeños cálculos matemáticos.
 * */

public class Matematicas{


     /**
     * * Genera  una aproximación al número Pi mediante el método de
     * * Montecarlo. El parámetro `pasos` indica el número de puntos
     * * generado.
     * * @param pasos indica el número de puntos (dardos) generados.
     * * @param dardosLanzados indica el número de dardos lanzados (es un contador).
     * * @param dardosAcertados indica el número de dardos acertados (es un contador).
     * * @param random es un valor aleatorio.
     * * @param size indica el número de grupos de 2000 dardos (lotes) que corresponden al número de pasos.
     * * @return devuelve los dardos acertados del número total de pasos.
     * */
	public static long iterador(long pasos, long dardosLanzados, long dardosAcertados, Random random){

        	//Asignamos que el centro del cuadrado está en el punto (0.5, 0.5)
        	double centroX = 0.5;
        	double centroY = 0.5;

		//El método nextDouble() genera un número aleatorio de tipo double entre 0.0 (incluido) y 1.0 (excluido): [0.0, 1.0).
               	double Xrandom = random.nextDouble(); //Coordenada X del punto aleatorio
               	double Yrandom = random.nextDouble(); //Coordenada Y del punto aleatorio
			
		//Calculamos la distancia del punto aleatorio al centro del cuadrado
               	double distancia = Math.sqrt((Xrandom - centroX) * (Xrandom - centroX) + (Yrandom - centroY) * (Yrandom - centroY));

                //Si la distancia que calculamos es menor o igual a 0.5; el punto aleatorio habrá caído en el círculo
		//y se incrementa el contador de dardos acertados
               	if(distancia <= 0.5){
                       	dardosAcertados++;
               	}
		
		dardosLanzados++;

		//Si el número de dardos lanzados alcanza al de pasos, devuelve los dardos acertados,
		//si no, vuelve a invocar de forma recursiva al iterador, actualizando el contador de dardos lanzados y dardos acertados
                if (dardosLanzados >= pasos){
                        return dardosAcertados;
                } else {
                        return Matematicas.iterador(pasos, dardosLanzados, dardosAcertados, random);
                }
	}

    /**
     * * Genera una aproximación al número Pi mediante el método de
     * * Montecarlo utilizando recursividad.
     * * @param pasos indica el número de puntos (dardos) generados.
     * * @return una aproximación del número pi.
     * */
	public static double generarNumeroPiRecursivo(long pasos){
		
		//Instanciamos un nuevo objeto de tipo random		
        	Random random = new Random();
		
		
		//Se devuelve la aproximación al número pi utilizando el método Montecarlo
		return 4 * (double) Matematicas.iterador(pasos, 0, 0, random) / (double) pasos;
	}


    /**
     * * Genera una aproximación al número Pi mediante el método de
     * * Montecarlo. El parámetro `pasos` indica el número de puntos
     * * generado.
     * * @param pasos indica el número de puntos (dardos) generados.
     * * @return una aproximación del número pi.
     * */
    public static double generarNumeroPiIterativo(long pasos){  

	int dardosAcertados = 0;

	//Asignamos que el centro del cuadrado está en el punto (0.5, 0.5)
	double centroX = 0.5;
	double centroY = 0.5;
	
	Random random = new Random();	

	for(int lanzamientos = 0; lanzamientos <= pasos; lanzamientos++){

		double Xrandom = random.nextDouble(); //Coordenada X del punto aleatorio
		double Yrandom = random.nextDouble(); //Coordenada Y del punto aleatorio
		
		//Calculamos la distancia del punto aleatorio al centro del cuadrado
		double distancia = Math.sqrt((Xrandom - centroX) * (Xrandom - centroX) + (Yrandom - centroY) * (Yrandom - centroY));

		//Si la distancia que calculamos es menor o igual a 0.5; el punto aleatorio habrá caído en el círculo
		if(distancia <= 0.5){
			dardosAcertados++;
		}

		//Calcular la aproximación del número pi
	}
	return 4 * (double) dardosAcertados / (double) pasos;
    }
}
