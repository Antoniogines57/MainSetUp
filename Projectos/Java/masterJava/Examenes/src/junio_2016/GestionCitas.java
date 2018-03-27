package junio_2016;

public class GestionCitas {
	private Cita[][][] citas=new Cita[12][30][10];
	
	public GestionCitas() {}
	public void reservarCita(Cita newCita) {
		if(citas[newCita.getFecha().getMes()][newCita.getFecha().getDia()][newCita.getFecha().getSesion()]==null) {
			citas[newCita.getFecha().getMes()][newCita.getFecha().getDia()][newCita.getFecha().getSesion()]=newCita;
			System.out.println("Cita reservada con exito.");
		}
		else {
			System.out.println("La sesion ya esta reservada.");
		}
	}
	public void anularCita(Cita cita) {
		citas[cita.getFecha().getMes()][cita.getFecha().getDia()][cita.getFecha().getSesion()]=null;
		System.out.println("Sesion liberada con exito.");
	}
}
