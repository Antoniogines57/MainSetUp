package junio_2013;

public class Libro implements IArticulo {
	private float precio;
	private CodigoBarras barCode;
	private String autor;
	private String titulo;
	private int[] ISBN=new int[10];
	
	public Libro() {
		precio=0;  barCode=new CodigoBarras("000"); 
		for(@SuppressWarnings("unused") int op:ISBN) {op=0;}
	}
	public Libro(float precio, CodigoBarras codigo, String autor, String titulo) {
		if(precio<0)System.out.println("El precio no puede ser menor que cero");
		else if(codigo==null) System.out.println("El codigo de barras esta vacio.");
		else if(autor==null) System.out.println("El autor esta vacio");
		else if(titulo==null) System.out.println("El titulo esta vacio");
		else {
			this.precio=precio; barCode=codigo; 
			this.autor=autor; this.titulo=titulo;
		}
	}
	public void setISBN(int[] arr) {
		boolean p=true;
		for(int l:arr) {
			if(l>9||l<0) {
				p=false;
				break;
			}
		}
		if(arr.length!=10||p==false) {
			System.out.println("Codigo ISBN incorrecto.");
		}
		else {
			for(int i=0;i<10;i++) {
				ISBN[i]=arr[i];
			}
		}
	}
	public String getInfo() {
		return autor+", "+titulo;
	}
	public void setPrecio(float p) {
		if(p<0) System.out.println("El precio no puede ser menor que cero.");
		else this.precio=p;
	}
	public double getPrecio() {return precio;
	}
	public CodigoBarras getCodigoBarras() {
		return barCode;
	}
	
	
}
