package Ejercicio1;
import java.util.*;
public class Ejercicio1 {

	public static void main(String[] args) {
		/*1. Realizar un programa que lea por teclado dos n�meros, si el primero es mayor
		al segundo informar su suma y diferencia, en caso contrario informar el
		producto y la divisi�n del primero respecto al segundo.*/
        
		Scanner sc=new Scanner(System.in);
		int num1=0;
		int num2=0;
		System.out.println("Introduce el primer n�mero");
		num1=sc.nextInt();
		System.out.println("Introduce el segundo n�mero");
		num2=sc.nextInt();
		 
		if(num1>num2){
			 System.out.println("La suma de "+num1+"+"+num2+" es igual a "+(num1+num2));
					 
		     System.out.println("La resta de "+num1+"-"+num2+" es igual a "+(num1-num2));
		 }
		     else{
		    	 System.out.println("La divisi�n de "+num1+"/"+num2+"es igual a "+(num1/num2));
		         System.out.println("La potencia de "+num1+"*"+num2+"es igual a "+(num1*num2));
		     }
		
		
		

	}

}
