package javasejs163164;

import java.util.Scanner;

public class Chifan {

	public static void main(String[] args) {

		String fan = "";

		Scanner input = new Scanner(System.in);
		System.out.println("晚上吃的什么呀?");
		for (int i = 0; i < 100; i++) {
			fan = input.next();
			if(fan.equals("苍蝇")){
				break;
			}
			//System.out.println("晚上吃的" + fan);
			System.out.println("晚上吃的什么呀?");
		}

	}

}
