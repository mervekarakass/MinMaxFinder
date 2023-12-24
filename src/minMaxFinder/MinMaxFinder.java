package minMaxFinder;

import java.util.Scanner;

public class MinMaxFinder {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Kac adet sayi gireceksiniz? ");
		int n = scanner.nextInt();
		
		int [] numbers = new int [n];
		
		// sayilari kulanicidan al
		for (int i = 0; i < n; i++) {
			System.out.print("Sayi " + (i+1) + ": ");
			numbers [i] = scanner.nextInt();
		
		}
		
		// en buyuk ve en kucuk sayilari bul
		int min = numbers[0];
		int max = numbers[0];
		
		for (int i = 1; i < n; i++) {
			if (numbers[i] < min) {
				min = numbers [i];
				
			}
			
			if (numbers[i] > max) {
				max = numbers [i];
				
			}
			
		}
		
		// sonuclari ekrana yaz
		System.out.println("En kucuk sayi: " + min);
		System.out.println("En buyuk sayi: " + max);
		
		

	}

}
