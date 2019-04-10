package Projekt;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.List;
import java.util.Scanner;

public class Biblioteka {

	public static String UserPath="C:\\Intel\\Intelmeme\\Biblioteka\\src\\Projekt\\Papa.txt";
	public static String BookPath="C:\\Intel\\Intelmeme\\Biblioteka\\src\\Projekt\\PerPaPa.txt";
	public static void Wypozycz(){
		try {
			int i=0, j=-1, x=0, io=0, bool=0;
			String pom, id, idp, idk;
			String[] Uzytkownik = new String[7];
			Scanner wczytaj = new Scanner(System.in);
			File file = new File(UserPath);
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
				Uzytkownik = Dodatkowe.rozdzielenie(7, pom);
				if(Uzytkownik[3].equals("0")) {
					bool=3;
				}
				else if(Uzytkownik[4].equals("0")) {
					bool=4;
				}
				else if(Uzytkownik[5].equals("0")) {
					bool=5;
				}
				else if(Uzytkownik[6].equals("0")) {
					bool=6;
				}
				else {
					bool=0;
				}
				if((bool>=3)&&(bool<=6)) {
					System.out.println("Podaj id ksizki");
					idk=wczytaj.next();
					if(Dodatkowe.WolneKsiazki(idk)>0) {
						Uzytkownik[bool]=idk;
						Dodatkowe.Usuwanie(idk);
						System.out.println("Wypozyczono ksiazke.");
						PrintWriter zapis = new PrintWriter(UserPath);
						Tablica[j]=Uzytkownik[0]+","+Uzytkownik[1]+","+Uzytkownik[2]+","+Uzytkownik[3]+","+Uzytkownik[4]+","+Uzytkownik[5]+","+Uzytkownik[6];
						for(j=0;j<i;j++) {
							zapis.println(Tablica[j]);
						}
				        zapis.close();
					}
					else if(Dodatkowe.WolneKsiazki(idk)==0) {
						System.out.println("Brak ksiazki.");
					}
					if(Dodatkowe.WolneKsiazki(idk)==-1) {
						System.out.println("Brak ksiazki o danym id.");
					}
					if(Dodatkowe.WolneKsiazki(idk)==-2) {
						System.out.println("Blad wczytania pliku.");
					}
				}
				if(bool==0) {
					
				}
			}
			else {
				System.out.println("Brak uzytkownika.");
			}
        }
        catch (IOException e){
            System.out.println("Blad!");       
        }
		
	}
	public static void Oddaj(){//nieskonczone
		try {
			int i=0, j=-1, x=0, io=0, bool=0;
			String pom, id, idp, idk;
			String[] Uzytkownik = new String[7];
			Scanner wczytaj = new Scanner(System.in);
			File file = new File(UserPath);
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
				Uzytkownik = Dodatkowe.rozdzielenie(7, pom);
				if(Uzytkownik[3].equals("0")) {
					bool=3;
				}
				else if(Uzytkownik[4].equals("0")) {
					bool=4;
				}
				else if(Uzytkownik[5].equals("0")) {
					bool=5;
				}
				else if(Uzytkownik[6].equals("0")) {
					bool=6;
				}
				else {
					bool=0;
				}
				if((bool>=3)&&(bool<=6)) {
					System.out.println("Podaj id ksizki");
					idk=wczytaj.next();
					if(Dodatkowe.WolneKsiazki(idk)>0) {
						Uzytkownik[bool]=idk;
						Dodatkowe.Usuwanie(idk);
						System.out.println("Wypozyczono ksiazke.");
						PrintWriter zapis = new PrintWriter(UserPath);
						Tablica[j]=Uzytkownik[0]+","+Uzytkownik[1]+","+Uzytkownik[2]+","+Uzytkownik[3]+","+Uzytkownik[4]+","+Uzytkownik[5]+","+Uzytkownik[6];
						for(j=0;j<i;j++) {
							zapis.println(Tablica[j]);
						}
				        zapis.close();
					}
					else if(Dodatkowe.WolneKsiazki(idk)==0) {
						System.out.println("Brak ksiazki.");
					}
					if(Dodatkowe.WolneKsiazki(idk)==-1) {
						System.out.println("Brak ksiazki o danym id.");
					}
					if(Dodatkowe.WolneKsiazki(idk)==-2) {
						System.out.println("Blad wczytania pliku.");
					}
				}
				if(bool==0) {
					
				}
			}
			else {
				System.out.println("Brak uzytkownika.");
			}
        }
        catch (IOException e){
            System.out.println("Blad!");       
        }
	}
}