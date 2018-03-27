package com.goingbetter.soloLearning;
import java.util.ArrayList;
import java.util.Collections;

public class Collectionsss {
	public static void main(String[]args) {
		ArrayList<String> methods=new ArrayList<String>();
		String[]m= {"Pablo","Pedro","Armando","Loco","Uriel","Antonio","Oscar","Angela","Laura","Paula","Ana"};
		for(String k:m) {
			methods.add(k);
		}
		Collections.sort(methods);
		for(String l:methods) {
			System.out.println(l);
		}
	}
	
	
}
