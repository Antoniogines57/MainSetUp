import java.text.DecimalFormat;
public class Febrero_2017 {
	public static void main(String[]args) {
		DecimalFormat format=new DecimalFormat();
		format.setMaximumFractionDigits(2);
		Punto[] arrayPuntos1=new Punto[8];
		arrayPuntos1[0]=new Punto(100,0);
		for(int i=1;i<arrayPuntos1.length;i++) {
			arrayPuntos1[i]=arrayPuntos1[i-1].girar(45,0,0);
			/*
			arrayPuntos1[i]=new Punto(Math.cos(Math.toRadians(i*45))*100,Math.sin(Math.toRadians(i*45)*100));
			*/
		}
		Punto[] arrayPuntos2=new Punto[8];
		for(int j=0;j<arrayPuntos2.length;j++) {
			arrayPuntos2[j]=arrayPuntos1[j].trasladar(25, 100);
		}
		for(Punto punto:arrayPuntos2) {
			System.out.println(punto);
		}
		System.out.println();
		System.out.println("--------------------------");
		System.out.println();
		Vector[] arrayVectores1=new Vector[8];
		arrayVectores1[0]=new Vector(new Punto(100,0), new Punto(110, 0));
		for(int i=1;i<arrayVectores1.length;i++) {
			arrayVectores1[i]=(Vector) arrayVectores1[i-1].girar(45);
		}
		Vector[] arrayVectores2=new Vector[8];
		for(int m=0;m<arrayVectores2.length;m++) {
			arrayVectores2[m]=(Vector) arrayVectores1[m].trasladar(25, 100);
		}
		for(Vector vector:arrayVectores2) {System.out.println(vector);}
	}
}

class Punto implements IForma{
	private double X; private double Y;
	public Punto() {X=0;Y=0;}
	public Punto(double X, double Y) {this.X=X;this.Y=Y;}
	public double getX() {return X;}
	public double getY() {return Y;}
	
	public double getOrientacion() {
		return 0;
	}
	public Punto girar(double grados, double x, double y) {
		double gradRad=Math.toRadians(grados);
		double x2=x+(X-x)*Math.cos(gradRad)-(Y-y)*Math.sin(gradRad);
		double y2=y+(X-x)*Math.sin(gradRad)+(Y-y)*Math.cos(gradRad);
		return new Punto(x2,y2);
	}
	public Punto girar(double grados) {
		return new Punto(X,Y).girar(grados,0,0);
	}
	public Punto trasladar(double deltaX, double deltaY) {
		return new Punto(X+deltaX,Y+deltaY);
	}
	public double distancia(IForma forma) {
		return Math.sqrt((forma.getX()-X)*(forma.getX()-X)+(forma.getY()-Y)*(forma.getY()-Y));
	}
	public String toString() {
		DecimalFormat formas=new DecimalFormat();
		formas.setMaximumFractionDigits(2);
		formas.setMinimumFractionDigits(2);
		return  "["+formas.format(getX())+" | "+formas.format(getY())+"]";
	}
}
class Vector implements IForma{
	private Punto origen;
	private Punto extremo;
	public Vector(Punto pOrigen, Punto pExtremo) {
		origen=pOrigen; extremo=pExtremo;
	}
	public double getX() {return origen.getX();}
	public double getY() {return origen.getY();}
	public double getOrientacion() {
		double mod= Math.sqrt((extremo.getX()-origen.getX())*(extremo.getX()-origen.getX())+
				(extremo.getY()-origen.getY())*(extremo.getY()-origen.getY()));
		return Math.asin((extremo.getY()-origen.getY())/(mod));
	}
	public IForma girar(double grados, double x, double y) {
		/*
		Punto ori0=new Punto(x+(origen.getX()-x)*Math.cos(gRad)-(origen.getY()-y)*Math.sin(gRad),
				y+(origen.getX()-x)*Math.sin(gRad)-(origen.getY()-y)*Math.cos(gRad));
		*/
		return new Vector(origen,extremo.girar(grados,origen.getX(),origen.getY()));
	}
	public IForma girar(double grados) {
		return new Vector(origen.girar(grados),extremo.girar(grados));
	}
	public IForma trasladar(double deltaX, double deltaY) {
		return new Vector(origen.trasladar(deltaX, deltaY),extremo.trasladar(deltaX, deltaY));
	}
	public double distancia(IForma forma) {
		return origen.distancia(forma);
	}
	public String toString() {
		return "["+origen+","+extremo+"]";
	}
	
}


