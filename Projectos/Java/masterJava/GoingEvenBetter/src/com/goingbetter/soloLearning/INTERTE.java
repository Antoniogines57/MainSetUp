package com.goingbetter.soloLearning;

public class INTERTE {
	public static void main(Object... o) {
		for(int i=0;i<o.length;i++) {
			if(o[i] instanceof Elipse) {
				System.out.println("Objeto n�"+i+" es una elipse.");
			}else if(o[i] instanceof Circulo) {
				System.out.println("Objeto n�"+i+" es un ciruculo.");
			}else if(o[i] instanceof Figura) {
				System.out.println("Objeto n�"+i+" es una figura.");
			}else {
				System.out.println("Objeto n�"+i+" no es una figura. ");
			}
		}
	}

	public static void doSomething(Object... o){
        for(Object zero: o){
            System.out.println(zero);
        }
    }

}
