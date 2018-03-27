package febrero_2013;

public class TrianguloEquilatero implements IFormaCerrada{
	private Punto p1,p2,p3; 
	
	public TrianguloEquilatero(double lado) {
		p1=new Punto(-lado/2,0); p2=new Punto(lado/2,0);
		p3=new Punto(0, lado*(Math.sqrt(2)/2));
	}
	public TrianguloEquilatero() {
		p1=new Punto(-1/2,0); p2=new Punto(1/2,0);
		p3=new Punto(0, 1*(Math.sqrt(2)/2));
	}
	public double[][] arrayPuntos(){
		return new double[][] {
			{p1.xp,p1.yp},
			{p2.xp,p2.yp},
			{p3.xp,p3.yp}
		};
	}
	public double getHeigh() {
		return (p2.xp-p1.xp)*Math.sqrt(2)/2;
		}
	public double getPerimetro() {
		return 3*(p2.xp-p1.xp);
	}
	public double getArea() {
		return ((p2.xp-p1.xp)*(p2.xp-p1.xp)*(Math.sqrt(2)/2))/2;
	}
}
