package junio_2016;

public class Main {
	public static void main(String[]args) {
		GestionCitas hospital1=new GestionCitas();
		hospital1.reservarCita(new Cita("Carlos", "Asterix",new FechaCita(4,7,2)));
		hospital1.reservarCita(new Cita("Carlos", "Asterix",new FechaCita(6,7,2)));
		hospital1.anularCita(new Cita("Carlos", "Asterix",new FechaCita(4,7,2)));
		hospital1.anularCita(new Cita("Carlos", "Asterix",new FechaCita(6,7,2)));
	}
}
