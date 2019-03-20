import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.*;
public class zamiana {
	public static void zmien(String  a) {
		StringBuffer tekst = new StringBuffer(a.toLowerCase());
		int i=0, pom=0;
		boolean ok=false;
		char[] samo = {'a', 'e', 'y', 'u', 'i', 'o'};
		char[] spol = {'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'r', 's', 't', 'w', 'y', 'z'};
		while(0<tekst.indexOf("h",1)) {
			pom=tekst.indexOf("h",1);
			tekst.replace(pom, pom+1, "");
		}
		pom=0;
		for(i=0;i<tekst.length();i++)
		{
			ok=false;
			for(int j=0;j<samo.length;j++)
			{
				if(tekst.charAt(i)==samo[j]) {
					//System.out.println("tak");
					ok=true;
				}
			}
			if(ok&&pom>0) {
				tekst.replace(i, i+1, " ");
			}
			if(ok) {
				pom++;
			}
			if(!ok) {
				pom=0;
			}
		}
		while(0<tekst.indexOf(" ",0)) {
			pom=tekst.indexOf(" ",0);
			tekst.replace(pom, pom+1, "");
		}
		pom=0;
		for(i=0;i<tekst.length();i++)
		{
			ok=false;
			for(int j=0;j<spol.length;j++)
			{
				if(tekst.charAt(i)==spol[j]) {
					//System.out.println("tak");
					ok=true;
				}
			}
			if(ok&&pom>0) {
				tekst.replace(i, i+1, " ");
			}
			if(ok) {
				pom++;
			}
			if(!ok) {
				pom=0;
			}
		}
		while(0<tekst.indexOf(" ",0)) {
			pom=tekst.indexOf(" ",0);
			tekst.replace(pom, pom+1, "");
		}
		while(0<tekst.indexOf("i",0)) {
			pom=tekst.indexOf("i",0);
			tekst.replace(pom, pom+1, "e");
		}
		while(0<tekst.indexOf("y",1)) {
			pom=tekst.indexOf("y",1);
			tekst.replace(pom, pom+1, "e");
		}
		while(0<tekst.indexOf("p",1)) {
			pom=tekst.indexOf("p",1);
			tekst.replace(pom, pom+1, "b");
		}
		while(0<tekst.indexOf("k",1)) {
			pom=tekst.indexOf("k",1);
			tekst.replace(pom, pom+1, "c");
		}
		while(0<tekst.indexOf("s",1)) {
			pom=tekst.indexOf("s",1);
			tekst.replace(pom, pom+1, "c");
		}
		while(0<tekst.indexOf("t",1)) {
			pom=tekst.indexOf("t",1);
			tekst.replace(pom, pom+1, "d");
		}
		while(0<tekst.indexOf("j",1)) {
			pom=tekst.indexOf("j",1);
			tekst.replace(pom, pom+1, "g");
		}
		while(0<tekst.indexOf("n",1)) {
			pom=tekst.indexOf("n",1);
			tekst.replace(pom, pom+1, "m");
		}
		while(0<tekst.indexOf("w",1)) {
			pom=tekst.indexOf("w",1);
			tekst.replace(pom, pom+1, "v");
		}
		System.out.println(tekst);		
}
	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\st506\\Desktop\\nazwiska.txt");
		List<String> a = Files.readAllLines(file.toPath(), StandardCharsets.UTF_8);
		for(String line : a) {
			zmien(line);
		}
		//zmien("Kowalski");
		//zmien("Sierputowski");
	}

}