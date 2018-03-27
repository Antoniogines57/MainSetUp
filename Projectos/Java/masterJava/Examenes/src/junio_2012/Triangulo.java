package junio_2012;

public class Triangulo implements Poligono {
	private double base, altura;
	
	public Triangulo() {
		
	}
	public Triangulo(double base, double altura) {
		this.base=base;this.altura=altura;
	}
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return (base*altura)/2;
	}

	@Override
	public double getPerimetro() {
		// TODO Auto-generated method stub
		return 3*base;
	}
	public double getBase() {
		return base;
	}
	public double getAltura() {
		return altura;
	}
}
