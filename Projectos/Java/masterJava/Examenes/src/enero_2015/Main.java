package enero_2015;
import utilidades.Teclado;
import java.text.DecimalFormat;
public class Main {
	public static void main(String[]args) {
		DecimalFormat form=new DecimalFormat();
		form.setMaximumFractionDigits(2);
		System.out.println("Introduzca el punto A: ");
		Punto A=new Punto(Teclado.readDouble(),Teclado.readDouble());
		System.out.println("Introduzca el punto B: ");
		Punto B=new Punto(Teclado.readDouble(),Teclado.readDouble());
		System.out.println();
		System.out.println();
		System.out.println("La distancia es: "+form.format(A.distancia(B)));
		System.out.println();
		System.out.println();
		System.out.println(form.format(new Vector(new Punto(10.0,10.0),new Punto(150.0,150.0)).getModulo()));
		
	}
}
