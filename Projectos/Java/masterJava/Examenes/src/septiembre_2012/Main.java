package septiembre_2012;

public class Main {
	public static void main(String[]args) {
		Funcionario[] murcia=new Funcionario[100];
		for(Funcionario fu:murcia) {
			if(Math.random()<0.5) {
				fu=new Profesor();
			}
			else {
				fu=new Administrativi();
			}
		}
		for(Funcionario fe:murcia) {
			System.out.print("Su nivel es: "+fe.getNivel()+", "+
					"su categoria: "+fe.getCategoria());
			if(fe instanceof Administrativi) {
				System.out.println(((Administrativi)fe).esJefeSeccion()+".");
			}
			else if(fe instanceof Profesor) {
				System.out.println(" y sus asignaturas son: ");
				for(String cal:((Profesor)fe).getAsignaturas()) {
					System.out.println("-"+cal);
				}
				System.out.println();
			}
		}
	}
}
