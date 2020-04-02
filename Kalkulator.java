package kalkulator;
import java.io.*;
import java.lang.*;
import java.util.*;
import java.util.Scanner;

class Kalkulator 
{
	public static void main(String [] Args) {
		double liczba1;
		double liczba2;
		char znak;
		Scanner wejscie = new Scanner(System.in);
		
		System.out.println("Podaj pierwszą liczbę: " );
		liczba1 = wejscie.nextDouble();
		System.out.println("Podaj drugą liczbę: ");
		liczba2 = wejscie.nextDouble();
		
		System.out.println("Aby dodać wciśnij + ");
		System.out.println("Aby odjąć wciśnij - ");
		System.out.println("Aby pomnożyć wciśnij * ");
		System.out.println("Aby podzielić wciśnij / ");

		znak = wejscie.next().charAt(0);
		switch(znak) //Przełączamy się pomiędzy zadaniami
		{
			case '+':
			{
				System.out.println(liczba1+liczba2);
				break;
			}
			case '-':
			{
				System.out.println(liczba1-liczba2);
				break;
		
			}
			case '*':
			{
				System.out.println(liczba1*liczba2);
				break;
		
			}
			case '/':
			{
				if(liczba2 != 0)
				{
					System.out.println(liczba1/liczba2);
					break;
				}
				else 
				{
					System.out.println("Nie dzielimy przez 0!");
				}
		
			}
		}
		
	}
}
