package Projekt;

import java.util.*;

public class Program {

	public static void main(String[] args){
		int a, b, c, d;
		boolean koniec=true;
		while(koniec) {
			System.out.println("Witam w bibliotece.");
			System.out.println("Menu:");
			System.out.println("1. Operacje na uzytkownikach.");
			System.out.println("2. Operacje na ksiazkach.");
			System.out.println("3. Wypozyczenia i zwroty.");
			System.out.println("4. Wyjscie.");
			System.out.print("Wybor: ");
			Scanner wczytaj = new Scanner(System.in);
			a = wczytaj.nextInt();
			switch(a) {
			case 1:
				System.out.println("Operacje na uzytkownikach:");
				System.out.println("1. Dodaj uzytkownika.");
				System.out.println("2. Usun uzytkownika.");
				System.out.println("3. Status uzytkownika.");
				System.out.println("Dowolna liczba cofnij.");
				System.out.print("Wybor: ");
				b = wczytaj.nextInt();
				switch(b) {
				case 1:
					Uzytkownicy.Dodawanie();
					System.out.println("Nacisnij ENTER aby kontynuowac...");
			          new java.util.Scanner(System.in).nextLine();
					break;
				case 2:
					Uzytkownicy.Usuwanie();
					System.out.println("Nacisnij ENTER aby kontynuowac...");
			          new java.util.Scanner(System.in).nextLine();
					break;
				case 3:
					Uzytkownicy.Wypisanie();
					System.out.println("Nacisnij ENTER aby kontynuowac...");
			          new java.util.Scanner(System.in).nextLine();
					break;
				default:
					break;
				}
				break;
			case 2:
				System.out.println("Operacje na ksiazkach:");
				System.out.println("1. Dodaj ksiazke.");
				System.out.println("2. Usun ksiazke.");
				System.out.println("3. Wyszukaj ksiazki.");
				System.out.println("Dowolna liczba cofnij.");
				c = wczytaj.nextInt();
				switch(c) {
				case 1:
					Ksiazki.Dodawanie();
					System.out.println("Nacisnij ENTER aby kontynuowac...");
			          new java.util.Scanner(System.in).nextLine();
					break;
				case 2:
					Ksiazki.Usuwanie();
					System.out.println("Nacisnij ENTER aby kontynuowac...");
			          new java.util.Scanner(System.in).nextLine();
					break;
				case 3:
					Ksiazki.Wypisanie();
					System.out.println("Nacisnij ENTER aby kontynuowac...");
			          new java.util.Scanner(System.in).nextLine();
					break;
				default:
					break;
				}
				break;
			case 3:
				System.out.println("Wypozyczenia i zwroty:");
				System.out.println("1. Wypozyczenie ksiazki.");
				System.out.println("2. Zwrot ksiazki.");
				System.out.println("Dowolna liczba cofnij.");
				d = wczytaj.nextInt();
				switch(d) {
				case 1:
					Biblioteka.Wypozycz();
					System.out.println("Nacisnij ENTER aby kontynuowac...");
			          new java.util.Scanner(System.in).nextLine();
					break;
				case 2:
					Biblioteka.Oddaj();
					System.out.println("Nacisnij ENTER aby kontynuowac...");
			          new java.util.Scanner(System.in).nextLine();
					break;
				default:
					break;
				}
				break;
			case 4:
				System.out.println("Do widzenia.");
				koniec = false;
				break;
			default:
				System.out.println("Brak opcji!");
				break;
			}
			wczytaj.close();
		}
	}
}
/*
File file = new File("C:\\Users\\st506\\Desktop\\nazwiska.txt");
List<String> a = Files.readAllLines(file.toPath(), StandardCharsets.UTF_8);
for(String line : a) {
	zmien(line);
}
*/
