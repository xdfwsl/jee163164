package javasejs163164;

import java.util.Scanner;

public class PingJun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input=new Scanner(System.in);
		int i=1;
		int stuNum=4;
		int sum=0;
		while(i<=stuNum){
		      System.out.print("请输入学号" + i + "的成绩：");
		      int score = input.nextInt();
		      sum = sum + score;
		      i++; 
		}
		double avg = sum / stuNum ;	
		System.out.println(avg);
	}

}
