package javasejs163164;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {

	/*	int i = 1;
		int sum = 0;
		do {
			sum += i;
			i++;
		} while (i <= 100);
		System.out.println(sum);*/
		
		Scanner input=new Scanner(System.in);
		String answer;
		do {
			System.out.println("吃早饭");
			System.out.println("吃午饭");
			System.out.println("吃晚饭");
			System.out.println("吃好了吗 ?");
			answer=input.next();

		} while (!answer.equals("y"));
		System.out.println("吃饱咯了");
	}

}
