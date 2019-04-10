package Projekt;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.*;
public class Uzytkownicy {
	public static String path="C:\\Intel\\Intelmeme\\Biblioteka\\src\\Projekt\\Papa.txt";

	public static void Dodawanie(){		
		try {
			int i=0, j=0, x=0, io=0;
			String pom, imie, nazwisko;
			Scanner wczytaj = new Scanner(System.in);
			File file = new File(path);
			List<String> a = Files.readAllLines(file.toPath(), StandardCharsets.UTF_8);
			x=a.size();
			String[] Tablica = new String[x+1];
			for(String line : a) {
				Tablica[i]=line;
				i++;
			}
			pom=Tablica[i-1];
			io=pom.indexOf(',');
			io=Integer.parseInt(pom.substring(1, io));
			io++;
			System.out.println("Podaj imie: ");
			imie=wczytaj.next();
			System.out.println("Podaj nazwisko: ");
			nazwisko=wczytaj.next();
			Tablica[i]="u"+io+","+imie+","+nazwisko+",0,0,0,0";
			PrintWriter zapis = new PrintWriter(path);
			for(j=0;j<=i;j++) {
				zapis.println(Tablica[j]);
			}
	        zapis.close();
	        wczytaj.close();
        }
        catch (IOException e){
            System.out.println("Blad!");       
        }
	}
	public static void Usuwanie() {
		try {
			int i=0, j=0, x=0, io=0;
			String pom, id, idp;
			boolean zna=false;
			Scanner wczytaj = new Scanner(System.in);
			File file = new File(path);
			List<String> a = Files.readAllLines(file.toPath(), StandardCharsets.UTF_8);
			x=a.size();
			String[] Tablica = new String[x];
			System.out.println("Podaj identyfikator: ");
			idp = wczytaj.next();
			for(String line : a) {
				Tablica[i]=line;
				pom=Tablica[i];
				io=pom.indexOf(',');
				id=pom.substring(0, io);
				if(id.equals(idp)) {
					zna=true;
				}
				else {
					i++;
				}
			}
			if(zna) {
				System.out.println("Usunieto.");
				PrintWriter zapis = new PrintWriter(path);
				for(j=0;j<i;j++) {
					zapis.println(Tablica[j]);
				}
		        zapis.close();
			}
			else {
				System.out.println("Nie znaleziono uzytkownika.");
			}
			wczytaj.close();
        }
        catch (IOException e){
            System.out.println("Blad!");       
        }
	}
	public static void Wypisanie() {
		try {
			int i=0, j=-1, x=0, io=0;
			String pom, id, idp;
			String[] Uzytkownik = new String[7];
			Scanner wczytaj = new Scanner(System.in);
			File file = new File(path);
			List<String> a = Files.readAllLines(file.toPath(), StandardCharsets.UTF_8);
			x=a.size();
			String[] Tablica = new String[x];
			System.out.println("Podaj identyfikator: ");
			idp = wczytaj.next();
			for(String line : a) {
				Tablica[i]=line;
				pom=Tablica[i];
				io=pom.indexOf(',');
				id=pom.substring(0, io);
				if(id.equals(idp)) {
					j=i;
				}
				i++;
			}
			if(j>=0) {
				pom=Tablica[j];
				x=0;
				Uzytkownik = Dodatkowe.rozdzielenie(7, pom);
				System.out.println("ID: "+Uzytkownik[0]);
				System.out.println("Imie: "+Uzytkownik[1]);
				System.out.println("Nazwisko: "+Uzytkownik[2]);
				System.out.println("Wypozyczone ksiazki: ");
				if(Uzytkownik[3].length()>1) {
					System.out.println(Uzytkownik[3]);
					x++;
				}
				if(Uzytkownik[4].length()>1) {
					System.out.println(Uzytkownik[4]);
					x++;
				}
				if(Uzytkownik[5].length()>1) {
					System.out.println(Uzytkownik[5]);
					x++;
				}
				if(Uzytkownik[6].length()>1) {
					System.out.println(Uzytkownik[6]);
					x++;
				}
				if(x==0) {
					System.out.println("Brak.");
				}
				
			}
			else {
				System.out.println("Brak uzytkownika.");
			}
			wczytaj.close();
        }
        catch (IOException e){
            System.out.println("Blad!");       
        }
	}
}
