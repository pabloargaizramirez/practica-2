package mates;

import java.util.Random;

import java.util.Scanner;

/**
 * * @see Matematicas Esta clase posee metodos para realizar pequeños cálculos matemáticos.
 * */

public class Matematicas{



	public static long iterador(long pasos, long dardosLanzados, long dardosAcertados, Random random, long size){

        	//Asignamos que el centro del cuadrado está en el punto (0.5, 0.5)
        	double centroX = 0.5;
        	double centroY = 0.5;
		long safeSize = size;

		if ((pasos - dardosLanzados) < size){
			safeSize = pasos - dardosLanzados;
		}

		System.out.println(safeSize);

        	for(int lanzamientos = 0; lanzamientos < safeSize; lanzamientos++){

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

		dardosLanzados = dardosLanzados + safeSize;

		System.out.println(dardosLanzados);
		System.out.println(dardosAcertados);
		System.out.println(pasos);

                if (dardosLanzados >= pasos){
                        return dardosAcertados;
                } else {
                        return Matematicas.iterador(pasos, dardosLanzados, dardosAcertados, random, size);
                }
	}

	public static double generarNumeroPiRecursivo(long pasos){
				
        	Random random = new Random();

		long size = pasos;

		if (pasos > 2000){
			size = pasos / 2000;
		}

		return 4 * (double) Matematicas.iterador(pasos, 0, 0, random, size) / (double) pasos;
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
