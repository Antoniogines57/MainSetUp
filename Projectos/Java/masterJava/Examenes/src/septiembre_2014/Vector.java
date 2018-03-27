package septiembre_2014;

public class Vector {
	private double[] pExtremo=new double[3];
	public Vector(double x, double y, double z) {
		pExtremo[0]=x;pExtremo[1]=y;pExtremo[2]=z;
	}
	public double getX() {return pExtremo[0];}
	public double getY() {return pExtremo[1];}
	public double getZ() {return pExtremo[2];}
	public double modulo() {return Math.sqrt(pExtremo[0]*pExtremo[0]
			+pExtremo[1]*pExtremo[1]+pExtremo[2]*pExtremo[2]);
	}
	public double productoEscalar(Vector uni) {
		double dx=uni.getX()*pExtremo[0];
		double dy=uni.getY()*pExtremo[1];
		double dz=uni.getZ()*pExtremo[2];
		return dx+dx+dy;
	}
}
