package junio_2012;

public class Rectangulo implements Poligono{
	private double base, altura;
	
	public Rectangulo() {
		
	}
	public Rectangulo(double base, double altura) {
		this.base=base;this.altura=altura;
	}
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return base*altura;
	}

	@Override
	public double getPerimetro() {
		// TODO Auto-generated method stub
		return 2*altura+2*base;
	}
	public double getDiagonal() {
		return Math.sqrt(base*base+altura*altura);
	}
}
