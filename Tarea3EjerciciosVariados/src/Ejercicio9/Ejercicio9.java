package Ejercicio9;
import java.util.*;
public class Ejercicio9 {

	public static void main(String[] args) {
		/*9. Se ingresan tres valores por teclado, si todos son iguales se imprime la suma
		del primero con el segundo y a éste resultado se lo multiplica por el tercero.*/
		
		Scanner sc=new Scanner(System.in);
		
		int num1;
		int num2;
		int num3;
		
		System.out.println("Ingresa el primer valor");
		num1=sc.nextInt();
		System.out.println("Ingresa el segundo valor");
		num2=sc.nextInt();
		System.out.println("Ingresa el tercer valor");
		num3=sc.nextInt();
		
		if(num1==num2&&num1==num3)
			System.out.println((num1+num2)*num3);
		else
			System.out.println("No son iguales");


	}

}
