package febrero_2011;

public class Localizacion {
	private int X, Y;
	private double T;
	private int gCount=0;
	private int count=0;
	
	public Localizacion() {
		X=0;Y=0;T=0;
		count++;
	}
	public Localizacion(int X, int Y, double T) {
		if(count==0) {
			if(T<0) {
				this.X=X;this.Y=Y;this.T=0;
				count++;
			}
			else {
				this.X=X;this.Y=Y;this.T=T;
				count++;
			}
		}
	}
	public void setX(int x) {
		if(gCount>2) {
		}
		else {
			X=x;
			gCount++;
		}
	}
	public void setY(int y) {
		if(gCount>2) {
		}
		else {
			Y=y;
			gCount++;
		}
	}
	public void setT(double t) {
		T=t;
	}
	public int getX() {
		return X;
	}
	public int getY() {
		return Y;
	}
	public double getT() {
		return T;
	}
	
	public String toString() {
		return "( "+X+" , "+Y+" )"+" en el instante: "+T+"s.";
	}
}
