package p4;
import java.util.ArrayList;

//----------------------------------------------------------------------------------------------------------//	

public class ProcesarArrays {

	public static boolean elementosRepetidos(int [] matriz){
		boolean resultado =false;
		int a=235509237,b;

		if(matriz!=null){
			for (int i=0 ;i < matriz.length; i++ ){
				b=a;
				a=matriz[i];
				if(b==a){resultado=true; 
				}
			}
		}
		else {
			resultado=false;
		}
		
		return resultado;
	}
	
//----------------------------------------------------------------------------------------------------------//		
	
	public static int[] elementosRepetids(int [] matriz){
		if(matriz==null||matriz.length==0) return null;
		else {
			ArrayList<Integer> elRep= new ArrayList<Integer>();
			int a=0,b=0,c=0,d=0,e=0,f=0;
			for(int i=0;i<matriz.length-1;i++) {
				a=b; b=c; c=d; d=e; e=f; f=matriz[i];
				
				if(matriz[i]==e) elRep.add(matriz[i]);
				else if(matriz[i]==d) elRep.add(matriz[i]);
				else if(matriz[i]==c) elRep.add(matriz[i]);
				else if(matriz[i]==b) elRep.add(matriz[i]);
				else if(matriz[i]==a) elRep.add(matriz[i]);
			}
			int[] fin=new int[elRep.size()];
			/*for(int o=0;o<fin.length-1;o++);{
				fin[o]=elRep.get(o);
				}*/
			return fin;
		} 
	}
	
//----------------------------------------------------------------------------------------------------------//		

	public static boolean enOrden(int[]matriz){
		boolean resultado=true;
		if(matriz!=null) {
			for(int i=0;i<matriz.length-1;i++){
				if(matriz[i]>matriz[i+1]) {resultado=false;}
			}
		return resultado;	
		}
		else return false;
	}
		
//----------------------------------------------------------------------------------------------------------//		
	
	public static int[] ordenar(int[] matriz){
		if(matriz==null||matriz.length<=1) {return null;}
		else {
			int[] resultado= new int[matriz.length];
			int cambiador;
			for(int zex=0;zex<matriz.length;zex++) {
				resultado[zex]=matriz[zex];
			}
			for(int i=0;i<resultado.length+3;i++) {
				for(int m=0;m<resultado.length-1;m++) {
					if(resultado[m]>resultado[m+1]) {
						cambiador=resultado[m];
						resultado[m]=resultado[m+1];
						resultado[m+1]=cambiador;
					}
				}
			}
			return resultado;
		}
	}
	
//----------------------------------------------------------------------------------------------------------//	

	public static int busquedaLineal(int[] matriz, int clave ){
		int resultado=0;
		//-------------------------------//
		int a=235509237,b;
		if(matriz!=null){
			for (int i=0 ;i < matriz.length-1; i++ ){
				b=a;
				a=matriz[i];
				if(b==a){resultado=-1; 
				}
			}
		}
		else {
			resultado=-1;
		}
		//-------------------------------//
		for(int m=0;m<matriz.length;m++){
			if(matriz[m]==clave){
				resultado=m;
			}
			else {resultado=-1;}
		}
		
		return resultado;
	}

//----------------------------------------------------------------------------------------------------------//		

	public static double[][] quitarFila(double [][] matrix, int f){
		if(Matrices.esMatriz(matrix)==false||matrix==null) {return null;}
		else if(f<0||f>=matrix.length) {return null;}
		else {
			double[][] finalMatrix=new double[matrix.length-1][matrix[f].length];
			for(int a=0;a<finalMatrix.length;a++) {
				if(a<f) {												//Si a es menor que f copia las filas 'a' de matrix
					for(int s=0;s<finalMatrix[a].length;s++) {
						finalMatrix[a][s]=matrix[a][s];
					}
				}
				else {													//Si a es mayor o igual que f, copial la siguientes fila
					for(int s=0;s<finalMatrix[a].length;s++) {			//(suma la fila a+1)
						finalMatrix[a][s]=matrix[a+1][s];
					}
				}
			}
			return finalMatrix;
		}
	}
	
	public static double[][] quitarFila2(double [][] matrix, int f){
		if(Matrices.esMatriz(matrix)==false||matrix==null) {return null;}
		else if(f<0||f>=matrix.length) {return null;}
		else {
			double[][] finalMatrix=new double[matrix.length-1][matrix[f].length];
			for(int a=0;a<finalMatrix.length;a++) {
				for(int m=0;m<finalMatrix[a].length;m++) {
					if(a<f) {
						finalMatrix[a][m]=matrix[a][m];			//Si a es menor que f copia las filas 'a' de matriz
					}
					else {
						finalMatrix[a][m]=matrix[a+1][m];
					}
				}
			}
			return finalMatrix;
		}
	}
	
//----------------------------------------------------------------------------------------------------------//	
	
	public static double[][] quitarCol(double [][] matrix, int c){
		if(Matrices.esMatriz(matrix)==false||matrix==null) {return null;}
		else if(c<0||c>=matrix[0].length) {return null;}
		else {
			double[][] finalMatrix=new double[matrix.length][matrix[0].length-1];
			for(int a=0;a<finalMatrix.length;a++) {
				for (int s=0;s<finalMatrix[a].length;s++) {
					if(s<c) {
						finalMatrix[a][s]=matrix[a][s];
					}
					else {
						finalMatrix[a][s]=matrix[a][s+1];
					}
				}
			}
			return finalMatrix;
		}
	}
	
//----------------------------------------------------------------------------------------------------------//		

	public static double[][] getMenorComplementario(double[][] matrix, int f,int c){
		if(Matrices.esMatriz(matrix)==false||matrix==null) {return null;}
		else if(f<0||f>=matrix.length||c<0||c>matrix[0].length) {return null;}
		else {
			double[][] menor=new double[matrix.length-1][matrix.length-1];
			for(int i=0;i<menor.length;i++) {
				if(i<f) {
					for(int a=0;a<menor[i].length;a++) {   //Si la fila no es la elejida;
						if(a<c) {
							menor[i][a]=matrix[i][a];
						}                                  //Si la columna no es la deseada copia la matriz tal cual.
						else {
							menor[i][a]=matrix[i][a+1];    //Si es la columna elejida, copia la siguiente columna.
						}
					}
				}
				else {                                     //Si la fila es la elejida copia los elementos de la siguiente:
					for(int m=0;m<menor[i].length;m++) {
						if(m<c) {                          //Si la columna no es la deseada copia la matriz tal cual.  
							menor[i][m]=matrix[i+1][m];
						}
						else {                             //Si la columna es la deseada copia la siguiente columna de la matriz.
							menor[i][m]=matrix[i+1][m+1];
						}
					}
				}
			}	
		return menor;	
		}
	}
	
//----------------------------------------------------------------------------------------------------------//

	public static int[] eliminarK(int[] a ,int k) {
		if(a==null) return null;
		else {
			ArrayList<Integer> temp=new ArrayList<Integer>();
			for(int kap: a) {
				if (kap==k ) continue;
				temp.add(kap);
			}
			int[] b= new int[temp.size()];
			for(int i=0;i<b.length;i++) {
				b[i]=temp.get(i);
			}
			return b;
		}
	}
	
//----------------------------------------------------------------------------------------------------------//	
	
	public static int cuentaOcurrecias(int[] a,int k) {
		int b=0;
		if(a==null) {b=-1;}
		else {
			for(int i=0;i<a.length-1;i++) {
				if(a[i]==k) {
					b++;
				}
			}
		}
		return b;
	}
	
//----------------------------------------------------------------------------------------------------------//		
	
	@SuppressWarnings("unused")
	public static int[] invertir(int[] matriz){
		int[] matrizResultado= new int[matriz.length];
		
		if(matriz==null) {return null;}
		else{
		    for(int z=0;z<matriz.length;z++){
			    matrizResultado[z]=matriz[(matriz.length-z)];
		    }
		    for(int l=0;l<matrizResultado.length; l++){
		    	System.out.print(matrizResultado[l]+"\t");
		    }
		    return matrizResultado;
		}
	}

//----------------------------------------------------------------------------------------------------------//		

	public static int[] alternarElementos(int[] mata, int[] matb) {
		if(mata==null||matb==null||mata.length!=matb.length) return null;
		else {
			int[] matRes=new int[mata.length+matb.length];
			int acum=0;
			for(int i=0;i<matRes.length-1;i+=2) {
				matRes[i]=mata[acum];
				matRes[i+1]=matb[acum];
				acum++;
			}
			return matRes;
		}
	}
	
//----------------------------------------------------------------------------------------------------------//	

	public static int[] indices(int[] mat, int num) {
		ArrayList<Integer> temp=new ArrayList<Integer>();
		for(int i=0;i<mat.length-1;i++) {
			if(mat[i]==num) temp.add(i);
		}
		int[] arrFinal=new int[temp.size()-1];
		for(int u=0;u<arrFinal.length-1;u++) {
			arrFinal[u]=temp.get(u);
		}
		return arrFinal;
		
	}
	
//----------------------------------------------------------------------------------------------------------//		
	
	public static void main(String[] args) {

		/* int[]matriz=new int[10];
		System.out.println("Introduzca los valores de la matriz: ");
		
		for(int i=0;i<matriz.length; i++){
			System.out.println("Introduzca el valor: "+(i+1));
			matriz[i]=utilidades.Teclado.readInt();
		}
		boolean verdad=ProcesarArrays.elementosRepetidos(matriz);
		if(verdad==true){
			System.out.println("Alguno de los elementos esta repetido.");
		}
		else{System.out.println("Ninguno de los elementos coincide."); 
	} */
		
		int[] a= {1,2,3,4,5,6,7,8,9,5,3,5,3,45,2,4,2,5,0,1,2,3,4};
		int[] b=ProcesarArrays.eliminarK(a, 4);
		for(int i=0;i<b.length-1;i++) {
			System.out.println(b[i]);
		}
		System.out.println();
		System.out.println();
		System.out.println("---------------------------------------------------------------");
		System.out.println();
		System.out.println();
		int[] c=ProcesarArrays.ordenar(a);
		for(int m: c) {
			System.out.println(m);
		}
	}
}
