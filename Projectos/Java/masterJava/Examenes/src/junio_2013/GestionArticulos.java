package junio_2013;

public class GestionArticulos {
	private static IArticulo[] arrayArticulos=new IArticulo[1000];
	
	public Libro[] getLibros() {
		int c=0;
		for(IArticulo A: arrayArticulos)
			if(A instanceof Libro) {
				c++;
		}
		if(c==0) return null;
		Libro[] libros=new Libro[c];
		c=0;
		for(IArticulo B: arrayArticulos) {
			if(B instanceof Libro) {
				libros[c]=(Libro) B;
				c++;
			}
		}
		return libros;
	}
	public static void printArticulos() {
		for(IArticulo C: arrayArticulos) {
			if(C instanceof Libro) {
				System.out.println(((Libro)C).getInfo()+", "+C.getPrecio());
			}
			else if(C instanceof Smarphone) {
				System.out.println("Es un smartphone, de modelo: "
						+((Smarphone)C).getModelo()+", "+C.getPrecio());
			}
			else if(C==null) System.out.println("Articulo no disponible.");
		}
	}
}
