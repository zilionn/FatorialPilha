package view;

import java.util.Scanner;

import controller.FatController;

public class Principal {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		FatController fat = new FatController();
		int num = 0;
		
		do {
			System.out.print("Digite um número entre 0 - 10: ");
			num = sc.nextInt();
			
		}while(num < 0 || num > 10);
		
		System.out.println("O fatorial do número é: " + fat.fatorial(num));
		
		sc.close();
	}

}
