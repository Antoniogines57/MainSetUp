package febrero_2013;

public class Punto {
	double xp,yp;
	public Punto(double x, double y) {xp = x; yp = y;}
	public Punto clonar(){return new Punto(xp,yp);}
	public void trasladar(double dx, double dy){
		xp += dx; yp +=dy;
	}
}
