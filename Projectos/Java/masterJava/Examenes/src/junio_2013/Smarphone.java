package junio_2013;

public class Smarphone implements IArticulo {
	private CodigoBarras barCode;
	private String modelo;
	private double precio;
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(float p) {
		precio=p;
	}
	public CodigoBarras getCodigoBarras() {
		return barCode;
	}
	public String getModelo() {
		return modelo;
	}
	
}
