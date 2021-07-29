package day05_loop;

public class Ex04 {
	public static void main(String[] args) {

		int su = 1, sum = 0;
		for (; su <= 10;) {
			sum += su;
			su++;
		}
		System.out.println("1~10ÇÕ : " + sum);

		for (;;) {
			System.out.println("½ÇÇà");
		}

	}
}
