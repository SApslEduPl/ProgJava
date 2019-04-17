package Pesel;

import java.io.IOException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner wczytaj = new Scanner(System.in);
		ProcessBuilder pb = new ProcessBuilder("Notepad.exe");
		pb.start();
		System.out.print("Podaj ");
		//a = wczytaj.next();
		wczytaj.close();
	}

}
