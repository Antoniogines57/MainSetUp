package junio_2016;

class FechaCita{
	private int mes;
	private int dia; // Tendrá un valor entre 1..30
	private int sesion; // Tendrá un valor entre 1..10
	public FechaCita(int dia, int sesion, int mes){
		this.dia=dia;
		this.sesion=sesion;
		this.mes=mes;
	}
	public int getDia() {
		return dia;
	}
	public int getSesion() {
		return sesion;
	}
	public int getMes() { return mes;}
}
