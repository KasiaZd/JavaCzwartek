package typy;
import java.io.*;

class TypyDanych{
	public static void main(String [] Args)
	{
		String imie;
		imie = "Katarzyna";
		System.out.println("Dzień dobry nazywam się: "+imie);
		
		int wiek;
		wiek = 20; 
		System.out.println("W tym roku kończę: "+ wiek + "lat");
		
		System.out.println("Zmienna typu liczbowego int zawiera się na 4-rech bajtach "
		 + "od -2 147 483 648 do 2 147 483 647 bitów"
		 + " 1 Byte =  8 Bit");
		
		System.out.println("Zmienna typu zmiennoprzecinkowego double zawiera się na 8-miu bajtach "
		 + "i może posiadać 15 miejsc po przecinku od -2^63 do (2^63)-1 "
		 + "Tj -9 223 372 036 854 775 808‬ do +9 223 372 036 854 775 807");
		
		System.out.println("Kolejnym ważnym typem danych jest long. Także jest typem całkowitym i "
		+ "zawiera się na 8-miu Bajtach czyli od -9 223 372 036 854 775 808‬ do +9 223 372 036 854 775 807");
		
		System.out.println("Kolejnym typem całkowitym jest short i zawiera się od -32 768 do 32 767");
		
		System.out.println("Byte od -128 do 127");
		
		
		int zmienna = 12;
		//int zmienna = 12.34; //Nie zadziała ponieważ int przyjmuje tylko liczby całkowite
		//int zmienna = "Ala ma kota"; //Nie zadziała ponieważ to string który jest nie reprezentowany w typie int
		System.out.println(zmienna);
		
		
		//String liczba = "Ala ma kota"; //Zadziała ponieważ String przyjmuje ciągi znaków
		//String liczba = "15"; //Zadziała ponieważ 15 traktowane jest tutaj jako ciąg znaków, a nie liczba
		//String liczba = 15; //Nie zadziała ponieważ String wymusza użycie cudzysłowiu
		String liczba = "7834984//'[;]]3Ala ma kota ~~"; //Działa ponieważ wszystko wpiszane do cudzysłowiu traktowane jest jako ciąg znaków.	
		System.out.println(liczba); 
		
		
		
		
	}
}
