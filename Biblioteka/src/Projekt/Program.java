package Projekt;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		int choice = 0;
		while(choice!=5) {
			menu();
			choice = scanner.nextInt();
			switch(choice) {
			case 1:
				System.out.println("1");
				break;
			case 2:
				System.out.println("2");
				break;
			case 3:
				System.out.println("3");
				break;
			case 4:
				System.out.println("4");
				break;
			case 5:
				System.out.println("Do widzenia.");
				break;
			default:
				System.out.println("Nieznane");
				break;
			}
		}
	}

	private static void menu() {
		// TODO Auto-generated method stub
		System.out.println("Witamy w bibliotece");
		System.out.println("1.");
		System.out.println("2.");
		System.out.println("3.");
		System.out.println("4.");
		System.out.println("5.Wyjscie");
	}
}
