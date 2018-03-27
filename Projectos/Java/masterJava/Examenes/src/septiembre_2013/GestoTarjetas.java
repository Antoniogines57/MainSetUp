package septiembre_2013;

public class GestoTarjetas {
	private static TarjetaDeVisita[] arrayTarjetas;
	
	public static TarjetaEmpresa[] getAllEmpresa() {
		int c=0;
		for(TarjetaDeVisita kol:arrayTarjetas) {
			if(kol instanceof TarjetaEmpresa) {c++;}
		}
		if(c==0) return null;
		TarjetaEmpresa[] array=new TarjetaEmpresa[c];
		c=0;
		for(TarjetaDeVisita kal:arrayTarjetas) {
			if(kal instanceof TarjetaEmpresa) {
				array[c]=(TarjetaEmpresa) kal;
				c++;
			}
		}
		return array;
	}
	public static void printTarjetas() {
		for(TarjetaDeVisita k:arrayTarjetas) {
			if(k instanceof TarjetaPersonal) {
				System.out.println(k.getNombre()+", "+k.getEmail()+".");
			}
			else if(k instanceof TarjetaEmpresa) {
				System.out.println(k.getNombre()+", "+k.getEmail()+", "+((TarjetaEmpresa) k).getPuesto());
			}
			else if(k==null) continue;
		}
	}
}
