package septiembre_2012;

public class Profesor implements Funcionario {

	private int nivel;
	private String categoria;
	private String[] asignaturas;
	
	public Profesor() {
		
	}
	@Override
	public int getNivel() {
		// TODO Auto-generated method stub
		return nivel;
	}

	@Override
	public String getCategoria() {
		// TODO Auto-generated method stub
		return categoria;
	}
	public String[] getAsignaturas() {
		return asignaturas;
	}
}
