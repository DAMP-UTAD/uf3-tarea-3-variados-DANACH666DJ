package Ejercicio18;

public class Ejercicio18 {

	public static void main(String[] args) {
		/*18. Realizar un programa que imprima 25 términos de la serie 11 - 22 - 33 - 44, etc.
		(No se ingresan valores por teclado)*/
		
		int i=11;
	    int contador=0;
	    
		
		while(contador<25){
			contador++;
			System.out.println(i);
			i=i+11;
		}
		


	}

}
