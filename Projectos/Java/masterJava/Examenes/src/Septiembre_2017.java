
public class Septiembre_2017 {

	public static void numeroDivisores(int numero) {
		for(int i=1;i<=numero;i++) {
			if(numero%i==0) System.out.println(i);
		}
	}
	public static void main(String[]args) {
		numeroDivisores(45);
	}
}

