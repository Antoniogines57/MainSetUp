package junio_2016;

public class Cita {
	private String name;
	private String secureBrand;
	private FechaCita fecha;
	
	public Cita(String nombre, String compania, FechaCita dia) {
		name=nombre; secureBrand=compania; fecha=dia;
	}
	public String getName() {return name;}
	public String getBrand() {return secureBrand;}
	public FechaCita getFecha() {return fecha;}
}
