package septiembre_2017;

public class TarjetaPersonal implements ITarjetaVisita {
	private String name;
	private String email;
	public TarjetaPersonal(String nombre,String correo) {
		name=nombre; email=correo;
	}
	public String getNombre() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	
}
