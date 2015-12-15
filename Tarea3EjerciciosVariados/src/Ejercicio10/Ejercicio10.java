package Ejercicio10;
import java.util.*;
public class Ejercicio10 {

	public static void main(String[] args) {
		/*10. Se ingresan por teclado tres números, si todos los valores ingresados son
		menores a 10, imprimir en pantalla la leyenda "Todos los números son menores
		a diez".*/
		
		Scanner sc=new Scanner(System.in);
		
		int num1;
		int num2;
		int num3;
		
		System.out.println("Ingresa el primer número");
		num1=sc.nextInt();
		System.out.println("Ingresa el segundo número");
		num2=sc.nextInt();
		System.out.println("Ingresa el tercer número");
		num3=sc.nextInt();
		
		if(num1<10&&num2<10&&num3<10)
			System.out.println("Todos los números son menores a diez");
		else
			System.out.println("Los números son mayores a diez");
		


	}

}
