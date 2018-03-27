package septiembre_2012;

public class Complejos {
	double row, tita;
	
	public Complejos(double raw, double teta) {
		row=raw; tita=teta;
	}
	public Complejos(boolean cart, double real, double im) {
		row=Math.sqrt(real*real+im*im);
		tita=Math.atan(im/real);
	}
	public double getReal() {return row;}
	public double getImaginary() {return tita;}
	public void setReal(double real) {row=real;}
	public void setImaginary(double imaginario) {tita=imaginario;}
	public Complejos mult(Complejos numb) {
		return new Complejos(row*numb.getReal(),tita+numb.getImaginary());
	}
	public Complejos subbu(Complejos numb) {
		return new Complejos(row/numb.getReal(),tita-numb.getImaginary());
	}
	public Complejos power(int n) {
		return new Complejos(Math.pow(row, n), tita*n);
	}
}
