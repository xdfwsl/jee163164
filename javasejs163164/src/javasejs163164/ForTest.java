package javasejs163164;

import java.util.Scanner;

public class ForTest {

	public static void main(String[] args) {

		/*
		 * for (int i = 0; i < 100; i++) { System.out.println("这是每"+(i+1)+"遍");
		 * }
		 */

		int score=0;
		Scanner input=new Scanner(System.in);
		int sum=0;
		String name="张三";
		for (int i = 0; i < 5; i++) { // 循环5次录入5门课成绩
			System.out.print("请输入5门功课中第" + (i + 1) + "门课的成绩： ");
			score = input.nextInt();
			sum = sum + score;
		}

		double avg = sum / 5; // 计算平均分
		System.out.println(name + "的平均分是：" + avg);

	}

}
