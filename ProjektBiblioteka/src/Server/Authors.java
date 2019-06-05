package Server;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.List;

public class Authors {
	public static String[][] Wypis() throws IOException {
        File fbooks = new File("Authors.csv");
        int x, i, pom=0, j;
        String lineC=",,", pomS = null;
        if(!fbooks.exists()) {
            fbooks.createNewFile();
        }
        List<String> a = Files.readAllLines(fbooks.toPath(), StandardCharsets.UTF_8);
		x=a.size();
		String[][] dane = new String[x][4];
		i=0;
		for(String line : a) {
			lineC=line;
			for(j=0;j<3;j++) {
			pom = lineC.indexOf(",");
			pomS = lineC.substring(0,pom);
			lineC=lineC.substring(pom+1,lineC.length());
			dane[i][j]=pomS;
			}
			dane[i][3]=lineC.substring(0, lineC.length()-1);
			i++;
		}
		return dane;
    }
	public static String[] Naglowek() throws IOException {
        String[] dane = {"id","imie","nazwisko","epoka"};
		return dane;
    }
	public static void Dodawanie(String[] dane) throws IOException {
			System.out.println(dane[0]);
			String[][] Lista = Wypis();
			int i, n=Lista.length, pom;
			PrintWriter zapis = new PrintWriter("Authors.csv");
			pom = Integer.parseInt(Lista[n-1][0].substring(1));
			for(i=0;i<n;i++) {
				zapis.println(Lista[i][0]+","+Lista[i][1]+","+Lista[i][2]+","+Lista[i][3]+";");
			}
			zapis.println("a"+(pom+1)+","+dane[0]+","+dane[1]+","+dane[2]+";");
	        zapis.close();
	}
	public static void Usuwanie(String dane) throws IOException {
		if(!dane.isEmpty()) {
			String[][] Lista = Wypis();
			int i, n=Lista.length;
			PrintWriter zapis = new PrintWriter("Authors.csv");
			for(i=0;i<n;i++) {
				if(!dane.contentEquals(Lista[i][0])){
				zapis.println(Lista[i][0]+","+Lista[i][1]+","+Lista[i][2]+","+Lista[i][3]+";");
				}
			}
	        zapis.close();
		}
	}
}