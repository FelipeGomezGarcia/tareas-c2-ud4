
public class Actividad5App {
	public static void main (String args[]) {
		
		int a = 4, b = 9, c= 17, d = 35;
		int aux;
		
		System.out.println("Valor inicial de A = " + a);
		System.out.println("Valor inicial de B = " + b);
		System.out.println("Valor inicial de C = " + c);
		System.out.println("Valor inicial de D = " + d);
		
		aux = b;
		b = c;
		c = a;
		a = d;
		d = aux;
		
		System.out.println("Valor final de A = " + a);
		System.out.println("Valor final de B = " + b);
		System.out.println("Valor final de C = " + c);
		System.out.println("Valor final de D = " + d);
	}
}
