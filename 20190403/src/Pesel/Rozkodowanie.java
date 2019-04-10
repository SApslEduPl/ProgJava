package Pesel;

public class Rozkodowanie {
	public static void Dekoder(String numer) {
		String data;
		data = numer.substring(0, 5);
		System.out.print(data);
	}
}
