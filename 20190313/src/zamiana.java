import java.util.Arrays;
import java.lang.Object;
import java.io.*;

public class zamiana {

	public static void zmien(String  a) {
		StringBuffer tekst = new StringBuffer(a.toLowerCase());
		int i=0, pom=0;
		char[] samo = {'a', 'e', 'y', 'u', 'i', 'o'};
		while(0<tekst.indexOf("h",1)) {
			pom=tekst.indexOf("h",1);
			tekst.replace(pom, pom+1, "");
		}
		
		System.out.print(tekst);		
	}
	public static void main(String[] args) {
		zmien("haaahhhhhh");
	}
}