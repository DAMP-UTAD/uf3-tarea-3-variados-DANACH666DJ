package Ejercicio6;
import java.util.*;
public class Ejercicio6 {

	public static void main(String[] args) {
		/*6. Confeccionar un programa que permita cargar un n�mero entero positivo de
		hasta tres cifras y muestre un mensaje indicando si tiene 1, 2, o 3 cifras.
		Mostrar un mensaje de error si el n�mero de cifras es mayor.*/
		
		Scanner sc=new Scanner(System.in);
		int num;
		
		System.out.println("Introduce un n�mero entero positivo");
	    num=sc.nextInt();
	    
	    if(num<=9)
	    	System.out.println("El n�mero tiene una cifra");
	    else if(num<=99)
	    	System.out.println("El n�mero tiene dos cifras");
	    else if(num<=999)
	    	System.out.println("El n�mero tiene tres cifras");
	    else 
	    	System.out.println("Error");
		

	}

}
