package Ejercicio5;
import java.util.*;
public class Ejercicio5 {

	public static void main(String[] args) {
		/*5. Se ingresa por teclado un valor entero, mostrar una leyenda que indique si el
		n�mero es positivo, nulo o negativo.*/
		
		Scanner sc=new Scanner(System.in);
		
		int numE;
		System.out.println("Introduce un n�mero entero");
		numE=sc.nextInt();
		
		if(numE>0)
			System.out.println("El n�mero entero es positivo");
		else if(numE<0)
		     System.out.println("El n�mero entero es negativo");
		else if(numE==0)
			 System.out.println("El n�mero entero es null");

	}

}
