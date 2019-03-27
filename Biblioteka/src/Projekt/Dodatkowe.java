package Projekt;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.List;
import java.util.Scanner;

public class Dodatkowe {
	public static String UserPath="C:\\Intel\\Intelmeme\\Biblioteka\\src\\Projekt\\Papa.txt";
	public static String BookPath="C:\\Intel\\Intelmeme\\Biblioteka\\src\\Projekt\\PerPaPa.txt";
	public static String[] rozdzielenie(int l, String dane) {
		String[] tablica = new String[l];
		int i, j, io;
		for(i=0;i<l;i++) {
			if(dane.indexOf(",")>-1) {
				io=dane.indexOf(",");
				tablica[i]=dane.substring(0, io);
			}
			else {
				tablica[i]=dane.substring(0, dane.length());
			}
			if(dane.indexOf(",")>-1) {
				io=dane.indexOf(",");
				dane=dane.substring(io+1, dane.length());
			}
		}
		return tablica;
	}
	public static int WolneKsiazki(String dane) {
		int wynik=0;
		try {
			int i=0, j=-1, x=0, io=0;
			String pom, id, idp;
			String[] Uzytkownik = new String[6];
			Scanner wczytaj = new Scanner(System.in);
			File file = new File(BookPath);
			List<String> a = Files.readAllLines(file.toPath(), StandardCharsets.UTF_8);
			x=a.size();
			String[] Tablica = new String[x];
			idp = dane;
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
				wynik=Integer.parseInt(Uzytkownik[5]);
			}
			else {
				wynik=-1;
			}
        }
        catch (IOException e){
            wynik=-2;    
        }
		return wynik;
	}
	public static void Usuwanie(String dane) {
		try {
			int i=0, j=0, x=0, io=0, l=0;
			String pom="", id, idp;
			boolean zna=false;
			Scanner wczytaj = new Scanner(System.in);
			File file = new File(BookPath);
			List<String> a = Files.readAllLines(file.toPath(), StandardCharsets.UTF_8);
			x=a.size();
			String[] Tablica = new String[x];
			idp = dane;
			for(String line : a) {
				Tablica[i]=line;
				pom=Tablica[i];
				io=pom.indexOf(',');
				id=pom.substring(0, io);
				if(id.equals(idp)) {
					zna=true;
					String[] Ksiazka = Dodatkowe.rozdzielenie(6, pom);
						l=Integer.parseInt(Ksiazka[5]);
						l--;
						Ksiazka[5]=l+"";
						Tablica[i]=Ksiazka[0]+","+Ksiazka[1]+","+Ksiazka[2]+","+Ksiazka[3]+","+Ksiazka[4]+","+Ksiazka[5];
						i++;
				}
				else {
					i++;
				}
			}
			if(zna) {
				PrintWriter zapis = new PrintWriter(BookPath);
				for(j=0;j<i;j++) {
					zapis.println(Tablica[j]);
				}
		        zapis.close();
			}
        }
        catch (IOException e){
            System.out.println("Blad!");       
        }
	}
}
