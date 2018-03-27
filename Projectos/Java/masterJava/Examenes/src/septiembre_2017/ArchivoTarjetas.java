package septiembre_2017;

public class ArchivoTarjetas {
	private TarjetaDeEmpresa[] empleados;
	private int lastID;
	public ArchivoTarjetas(int size){
		empleados=new TarjetaDeEmpresa[size];
		lastID=0;
		for(TarjetaDeEmpresa kol: empleados) {
			kol=null;
		}
	}
	public void introducirTarjetas(TarjetaDeEmpresa tarjet) {
		empleados[lastID]=tarjet; lastID++;
	}
	public TarjetaDeEmpresa sacarTarjeta(String nombre) {
		for(TarjetaDeEmpresa actual:empleados) {
			if(actual.getNombre().equals(nombre)) return actual;
		}
		return null;     
	}
}