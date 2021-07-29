package day05_loop;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int repet;
		System.out.println("반복 횟수 입력");
		repet = scan.nextInt();
		for(int i=0 ; i <repet; i++) {
			System.out.println(i+".반복");
		}
			
			//--------------------
			for(int i=10; i>0; i--) {
				System.out.println(i+".실행");
		}

			
		System.out.println("----2 증가 -----");
		for (int i =0; i<10 ; i+=2) { // i=i+2
			System.out.println(i+".실행");
		}
			
			
			
	}
}
