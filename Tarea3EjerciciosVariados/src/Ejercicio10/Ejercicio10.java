package Ejercicio10;
import java.util.*;
public class Ejercicio10 {

	public static void main(String[] args) {
		/*10. Se ingresan por teclado tres n�meros, si todos los valores ingresados son
		menores a 10, imprimir en pantalla la leyenda "Todos los n�meros son menores
		a diez".*/
		
		Scanner sc=new Scanner(System.in);
		
		int num1;
		int num2;
		int num3;
		
		System.out.println("Ingresa el primer n�mero");
		num1=sc.nextInt();
		System.out.println("Ingresa el segundo n�mero");
		num2=sc.nextInt();
		System.out.println("Ingresa el tercer n�mero");
		num3=sc.nextInt();
		
		if(num1<10&&num2<10&&num3<10)
			System.out.println("Todos los n�meros son menores a diez");
		else
			System.out.println("Los n�meros son mayores a diez");
		


	}

}
