package dev;

import java.util.Scanner;

public class hello_world {

	public static void main(String[] args) {
	System.out.println("Hola mundo");
		
	//Codificar las funciones de estadistica Media Aritmetica, desviación estandar y una más 
	
			Scanner sca= new Scanner (System.in);
			System.out.println("Ingrese la cantidad a evaluar");
			int numeroIntermedio= 0;
			int total= 0;
			int i;
			int numero= sca.nextInt();
			
			for(i=0; i<numero; i++) {
				System.out.println("Ingrese la edad de la persona numero "+i+"n");
				numeroIntermedio= sca.nextInt();
				total= total + numeroIntermedio;
				
			}
			
			int media= (int)(total/numero);
			System.out.println("La media es: " +media);
			
			int valor [] = new int[10];
			double rango;
			double varianza = 0.0;
			double desviacion= 0.0;
			
			  rango = Math.pow(valor[i] - media, 2f);
			  varianza = varianza + rango;
			  
			  varianza = varianza / 10f;
			  
			  //suma de diferencias sobre "n"
			  //teniendo ya la varinza sólo debemos sacarle raiz cuadrada 
			  //tendremos la desviación estandar
			  
			  desviacion = Math.sqrt(varianza);
			  
			  //impresion de resultados
			  System.out.println("Varianza: " + varianza);
			  System.out.println("Desviación Estándar: " + desviacion);
			
			
		}
	
	
}
