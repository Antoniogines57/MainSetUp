package febrero_2011;

public class Blanco {
	protected Localizacion[] location=new Localizacion[10];
	protected int count;
	
	public Blanco() {
		for(int i=0;i<location.length;i++) {
			location[i]=new Localizacion(0,0,0);
		}
	}
	public Blanco(int x, int y, double time) {
		location[count]=new Localizacion(x,y,time);
		count++;
	}
	public void resetLocations() {
		for(int m=0;m<location.length;m++) {
			location[m]=new Localizacion(0,0,0);
			count=0;
		}
	}
	public boolean addLocation(Localizacion mi) {
		if(count<=10) {
			location[count]=mi;
			return true;
		}
		else return false;
	}
	public Localizacion getLastPosition() {
		return location[count-1];
	}
}
