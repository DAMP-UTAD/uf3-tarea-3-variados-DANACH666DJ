package Ejercicio11;
import java.util.*;
public class Ejercicio11 {

	public static void main(String[] args) {
		/*11. Se ingresan por teclado tres números, si al menos uno de los valores ingresados
		es menor a 10, imprimir en pantalla la leyenda "Alguno de los números es
		menor a diez".*/
		
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
		
		if(num1<10||num2<10||num3<10)
			System.out.println("Alguno de los números es menor a diez");


	}

}
