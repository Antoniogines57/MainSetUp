package enero_2015;

public class Vector {
	private Punto origen, extremo;
	public Vector(Punto p1, Punto p2) {origen=p1; extremo=p2;}
	public Punto getOrigen() {return origen;}
	public Punto getExtremo() {return extremo;}
	public double getModulo() {return origen.distancia(extremo);}
	
}
