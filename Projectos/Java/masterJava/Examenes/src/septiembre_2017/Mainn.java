package septiembre_2017;

public class Mainn {
	public static void main(String[]args) {
		ArchivoTarjetas google=new ArchivoTarjetas(300);
		google.introducirTarjetas(new TarjetaDeEmpresa("Carlos Gomez", "carlitos@gmail.com",
				"Encargado de servicios externos"));
		System.out.println(google.sacarTarjeta("Carlos Gomez"));
	}
}
