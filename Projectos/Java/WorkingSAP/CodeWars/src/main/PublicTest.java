package main;

public class PublicTest {
	public static void main(String[]args) {
		String hello="hello";
		char[] ma=hello.toCharArray();
		int[] me=new int[ma.length];
		for(int i=0;i<me.length;i++) {
			me[i]=Character.getNumericValue(ma[i]);
			System.out.print(me[i]);
		}
		System.out.println("");
		System.out.println(validate("45661321"));
	}
	
	public static boolean validate(String n){
	    // TODO: solution
	    char [] ls=n.toCharArray();
	    int[] aux=new int[ls.length];
	    for(int i=0; i<ls.length;i++){
	      aux[i]=Character.getNumericValue(ls[i]);
	    }
	    if((ls.length%2)==0){
	      for(int i=0;i<aux.length;i++){
	        if(i==0){aux[i]*=aux[i];}
	        else if(i==1) continue;
	        else if((i%2)==1){
	          aux[i]*=aux[i];
	        }
	      }
	      for(int m=0;m<aux.length;m++){
	        if(aux[m]>9){aux[m]-=9;}
	      }
	      int k=0;
	      for(int m=0;m<aux.length;m++){
	        k+=aux[m];
	      }
	      if((k/10)==0) return true;
	      else return false;
	    }else {
	      for(int i=0;i<aux.length;i++){
	        if(i==0){aux[i]*=aux[i];}
	        else if(i==1) continue;
	        else if((i%2)==0){
	          aux[i]*=aux[i];
	        }
	      }
	      for(int m=0;m<aux.length;m++){
	        if(aux[m]>9) {aux[m]-=9;}
	      }
	      int k=0;
	      for(int m=0;m<aux.length;m++){
	        k+=aux[m];
	      }
	      if((k/10)==0) return true;
	      else return false;
	    }
	  }

	
}
