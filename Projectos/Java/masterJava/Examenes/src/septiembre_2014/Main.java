
package septiembre_2014;

public class Main {
	public static void main(String[]args) {
		Vector v1=new Vector(2,4,5);
		Vector v2=new Vector(4,6,1);
		System.out.println(v1.modulo());
		System.out.println(v2.modulo());
		System.out.println("");
		System.out.println(v1.productoEscalar(v2));
		
		//-------------------------------------------------------------------
		
		Animal[] granja=new Animal[10];
		
		granja[0]=new Mamifero();
		granja[1]=new Ave();
		granja[2]=new Mamifero();
		granja[3]=new Ave();
		granja[4]=new Ave();
		granja[5]=new Ave();
		granja[6]=new Mamifero();
		granja[7]=new Ave();
		granja[8]=new Mamifero();
		granja[9]=new Mamifero();
		
		for(Animal koala:granja) {
			koala.nacer();
		}
		for(Animal kre:granja) {
			if(kre instanceof Ave) {
				((Ave) kre).empollar();
			}
			else if(kre instanceof Mamifero) {
				((Mamifero) kre).amamantar();
			}
		}
		
		/*
		for(Animal elf:granja) {
			elf.nacer();
		}
		for(Animal perr:granja) {
			if(perr instanceof Ave) {
				((Ave) perr).empollar();
			}
			else if(perr instanceof Mamifero) {
				((Mamifero) perr).amamantar();
			}
		}
		*/
	}
	
}
