package Projekt;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.List;
import java.util.Scanner;

public class Ksiazki {

	public static String path="C:\\Intel\\Intelmeme\\Biblioteka\\src\\Projekt\\PerPaPa.txt";
	public static void Dodawanie(){
		try {
			int i=0, j=0, x=0, io=0;
			String pom, tytul, autor, kategoria, ilosc;
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
			System.out.println("Podaj tytul: ");
			tytul=wczytaj.next();
			System.out.println("Podaj autor: ");
			autor=wczytaj.next();
			System.out.println("Podaj kategoria: ");
			kategoria=wczytaj.next();
			System.out.println("Podaj ilosc: ");
			ilosc=wczytaj.next();
			Tablica[i]="b"+io+","+tytul+","+autor+","+kategoria+","+ilosc+","+ilosc;
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
			int i=0, j=0, x=0, io=0, l=0;
			String pom="", id, idp;
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
					String[] Ksiazka = Dodatkowe.rozdzielenie(6, pom);
					if(Integer.parseInt(Ksiazka[4])>1) {
						l=Integer.parseInt(Ksiazka[4]);
						l--;
						Ksiazka[4]=l+"";
						Tablica[i]=Ksiazka[0]+","+Ksiazka[1]+","+Ksiazka[2]+","+Ksiazka[3]+","+Ksiazka[4]+","+Ksiazka[5];
						i++;
					}
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
				System.out.println("Nie znaleziono ksiazki.");
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
			String[] Uzytkownik = new String[6];
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
				Uzytkownik = Dodatkowe.rozdzielenie(6, pom);
				System.out.println("ID: "+Uzytkownik[0]);
				System.out.println("Tytul: "+Uzytkownik[1]);
				System.out.println("Autor: "+Uzytkownik[2]);
				System.out.println("Kategoria: "+Uzytkownik[3]);
				System.out.println("Ilosc ogolnie: "+Uzytkownik[4]);
				System.out.println("Ilosc w bibliotece: "+Uzytkownik[5]);
			}
			else {
				System.out.println("Brak Ksiazki.");
			}
			wczytaj.close();
        }
        catch (IOException e){
            System.out.println("Blad!");       
        }
	}
}
