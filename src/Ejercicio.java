import java.util.Scanner;

public class Ejercicio {
	/*---------------------------------------------------------------
	 * --------------------------------------------------------------
	 * 
	 * TERMINA EL PROGRAMA COMPLETANDO EL METODO DEL AREA DEL CIRCULO
	 * 
	 * --------------------------------------------------------------
	 * --------------------------------------------------------------
	 */

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		int figura = 0;

		System.out.println("Elige una figura para el cálculo del área: \n1: Cuadrado \n2: Triangulo \n3: Circulo");
		
		figura=ent.nextInt();
		
		switch(figura) {
			
			case 1:
				System.out.println("El area del cuadrado es: " + areaCuadrado());//lado=ent.nextFloat(); areaCuadrado(lado);
				
				break;
			case 2:
				System.out.println("El area del triangulo es: " + areaTriangulo());
				
				break;
			case 3:
				System.out.println("El area del circulo es: " + areaCirculo());
				
				break;
			default:
				System.out.println("No existe esa opción");		
		
		}
//		System.out.println("El area de la figura es: " + area);
		
	}
	
	public static float areaCuadrado() {
		Scanner ent = new Scanner(System.in);
		float lado=0.0f;
		
		System.out.println("Introduce el lado del cuadrado: ");
		lado=Float.parseFloat(ent.nextLine().replace(',', '.'));
		
		return (float)Math.pow(lado, 2);// se castea a float porque pow da datos en double
	}
	public static float areaTriangulo() {
		Scanner ent = new Scanner(System.in);
		float base=0.0f;
		float altura=0.0f;
		
		System.out.println("Introduce la base del triangulo: ");
		base=Float.parseFloat(ent.nextLine().replace(',', '.'));
		System.out.println("Introduce la altura del triangulo: ");
		altura=Float.parseFloat(ent.nextLine().replace(',', '.'));
		
		return (base*altura)/2;
		
	}
	public static float areaCirculo() {
		Scanner ent = new Scanner(System.in);
		float radio=0.0f;
		
		System.out.println("Introduce el radio del circulo: ");
		
		return (float) (Math.PI*Math.pow(radio, 2));
	}
}
