package p5;

public class Testp5 {

	public static void main(String[]args) {
		double[][] arrayPuntos1=new double[8][2];
		Punto punto1=new Punto(100,0);
		arrayPuntos1[0]=punto1.getPunto();
		Punto punto2=punto1.girar(45);
		arrayPuntos1[1]=punto2.getPunto();
		Punto punto3=punto2.girar(45);
		arrayPuntos1[2]=punto3.getPunto();
		Punto punto4=punto3.girar(45);
		arrayPuntos1[3]=punto4.getPunto();
		Punto punto5=punto4.girar(45);
		arrayPuntos1[4]=punto5.getPunto();
		Punto punto6=punto5.girar(45);
		arrayPuntos1[5]=punto6.getPunto();
		Punto punto7=punto6.girar(45);
		arrayPuntos1[6]=punto7.getPunto();
		Punto punto8=punto7.girar(45);
		arrayPuntos1[7]=punto8.getPunto();		
		/*
		for(int i=0;i<arrayPuntos1.length;i++) {
			System.out.print("[  ");
			for(double el:arrayPuntos1[i]) {
				System.out.print(el+" ,");
			}
			System.out.print("]");
			System.out.println("\n");
		}
		*/
		
		System.out.println(punto1+"\n\n"+punto2+"\n\n"+punto3+"\n\n"+punto4+"\n\n"
				+punto5+"\n\n"+punto6+"\n\n"+punto7+"\n\n"+punto8+"\n\n");
		
		System.out.println("\n\n----------------------------------------------\n\n");
		
		double[][] arPt2=new double[8][2];
		Punto pt1=new Punto(100,0);
		arPt2[0]=pt1.getPunto();
		Punto pt2=pt1.trasladar(25, 100);
		arPt2[1]=punto2.getPunto();
		Punto pt3=pt2.trasladar(25, 100);
		arPt2[2]=punto3.getPunto();
		Punto pt4=pt3.trasladar(25, 100);
		arPt2[3]=punto4.getPunto();
		Punto pt5=pt4.trasladar(25, 100);
		arPt2[4]=punto5.getPunto();
		Punto pt6=pt5.trasladar(25, 100);
		arPt2[5]=punto6.getPunto();
		Punto pt7=pt6.trasladar(25, 100);
		arPt2[6]=punto7.getPunto();
		Punto pt8=pt7.trasladar(25, 100);
		arPt2[7]=punto8.getPunto();
		
		System.out.print("\n\n"+
				pt1+
				"\n\n"+
				pt2+
				"\n\n"+
				pt3+
				"\n\n"+
				pt4+
				"\n\n"+
				pt5+
				"\n\n"+
				pt6+
				"\n\n"+
				pt7+
				"\n\n"+
				pt8
				);
		
	}
}
