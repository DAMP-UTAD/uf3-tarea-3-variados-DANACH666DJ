package Ejercicio13;
import java.util.*;
public class Ejercicio13 {

	public static void main(String[] args) {
		/*13. De un operario se conoce su sueldo y los años de antigüedad. Se pide
		confeccionar un programa que lea los datos de entrada e informe:
		a) Si el sueldo es inferior a 500 y su antigüedad es igual o superior a 10 años,
		otorgarle un aumento del 20 %, mostrar el sueldo a pagar.
		b)Si el sueldo es inferior a 500 pero su antigüedad es menor a 10 años,
		otorgarle un aumento de 5 %.
		c) Si el sueldo es mayor o igual a 500 mostrar el sueldo en pantalla sin cambios.*/
		
		Scanner sc=new Scanner(System.in);
		
		int sueldo;
		int años;
		
		
		System.out.println("El suelo del operario es de");
		sueldo=sc.nextInt();
		System.out.println("Los años de antiguedad son de ");
		años=sc.nextInt();
		
		if(sueldo<500&&años>=10){
			System.out.println("La subida del sueldo del operario es de : "+(sueldo*20)/100);
			
		}
		else if(sueldo<500&&años<10){
			System.out.println("La subida del sueldo del operario es de :"+(sueldo*5)/100);
		    
		}
		else
			System.out.println("El sueldo del operario se queda en "+sueldo);
		
        
	}
	
}
