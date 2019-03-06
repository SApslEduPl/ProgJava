package com.ap.kajetan;

import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Double a, b, pole;
		//Scanner scan = new Scanner(System.in);
		//System.out.print("Podaj bok a: ");
		//a = scan.nextDouble();
		//System.out.print("Podaj bok b: ");
		//b = scan.nextDouble();
		//pole = a * b;
		//System.out.println("Pole wynosi: " + pole);
		Oblicz(1,3,3,4);
	}
	public static String Oblicz(int a, int b, int c, int d) {
		int i, p, p2, p3;
		int[] tablica = new int[4];
		String koniec="";
		for(i=2;i>=0;i--) {
			if(a==i) {
				tablica[0]=a;
				p=1;
				break;
			}
			if(b==i) {
				tablica[0]=b;
				p=2;
				break;
			}
			if(c==i) {
				tablica[0]=c;
				p=3;
				break;
			}
			if(d==i) {
				tablica[0]=d;
				p=4;
				break;
			}
		}
		if(tablica[0]==2) {
			
		}
		System.out.println(tablica[0]);
		return null;
	}
}
