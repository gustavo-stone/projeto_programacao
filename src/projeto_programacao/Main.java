package projeto_programacao;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		

		int y ;
		int a ;
		
		y = sc.nextInt();
		a = sc.nextInt();
		
		System.out.println("digite o primeiro valor:" + y );
		System.out.println("digite o segundo valor:" + a );
		
		if ((y % 2) == 0) {
			System.out.println("esse numero eh par");
		}
		else {
			System.out.println("esse numero eh impar");
		}
		if ((a % 2) == 0) 
			System.out.println("esse numero eh par");
		
		else 
			System.out.println("esse numero eh impar");
		

	}

}
