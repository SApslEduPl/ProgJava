import java.util.Arrays;

import java.io.*;

public class zadanie1 {

	public static void Oblicz(int a, int b, int c, int d) {

		int[] tab = {a, b, c, d};

		int i, j, p1=0, p2=9;

		boolean koniec=true;

		String c1 = "brak",c2 = "brak",c3 = "brak",c4 = "brak";

		for(i = 2, koniec = true;(i >=0)&&(koniec); i--) {

			for(j = 0; (j<tab.length)&&(koniec);j++) {

				if(tab[j]==i) {

					c1=tab[j]+"";

					koniec=false;

					p1=tab[j];

					tab[j]=-1;

				}

			}

		}

		if(p1==2) {

			p2=3;

		}

		else {

			p2=9;

		}
		
		for(i = p2, koniec = true;(i >=0)&&(koniec); i--) {

			for(j = 0; (j<tab.length)&&(koniec);j++) {

				if(tab[j]==i) {

					c2=tab[j]+"";

					koniec=false;

					tab[j]=-1;

				}

			}

		}

		for(i = 5, koniec = true;(i >=0)&&(koniec); i--) {

			for(j = 0;(j<tab.length)&&(koniec);j++) {

				if(tab[j]==i) {

					c3=tab[j]+"";

					koniec=false;

					tab[j]=-1;

				}

			}

		}

		for(i = 9, koniec = true;(i >=0)&&(koniec); i--) {

			for(j = 0;(j<tab.length)&&(koniec);j++) {

				if(tab[j]==i) {

					c4=tab[j]+"";

					koniec=false;

					tab[j]=-1;

				}

			}

		}

		if((c1=="brak")||(c2=="brak")||(c3=="brak")) {

			System.out.println("Z podanych cyfr nie da sie utworzyc godziny.");

		}

		else {

		System.out.println(c1+c2+":"+c3+c4);

		}

	}

	

	public static void main(String[] args) {

		

		Oblicz(3, 5, 7, 2);
		Oblicz(1, 2, 3, 4);
		Oblicz(9, 9, 9, 9);
		Oblicz(0, 0, 0, 0);
		Oblicz(3, 3,3, 3);
	}



}

