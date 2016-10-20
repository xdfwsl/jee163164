package javasejs163164;

import java.util.Scanner;

/**
 * 
 * 这是一个switch的小程序
 * 
 * @author 李洪燕
 * @version 2016-10-20
 * 
 */


public class T1020 {

	public static void main(String[] args) {

	/*	Scanner input = new Scanner(System.in);
		System.out.println("咱们晚上吃什么呀?0:面条,1.馒头2.不吃");
		int x = input.nextInt();

		switch (x) {
		case 0:
			System.out.println("吃面条吧!");
			break;
		case 1:
			System.out.println("吃馒头吧!");
			break;
		case 2:
			System.out.println("减肥吧!");
			break;
		default:
			break;
		}*/
		
/*		int x=98;
		
		if(x>90){
			System.out.print("优秀");
		}
		else if(x>80){
			System.out.print("良");
		}*/
		
		/**
		 * 求班级的平均分
		 */
		
		double pingJun=0; //声明一个double类型的变量,将来存平均分
		int zongFen=0;//总分
		int renShu=5;//班级人数
		
		int i=1;//计数器
		Scanner input=new Scanner(System.in);
		while (i<=renShu) {
			System.out.println("请输入"+i+"号同学的成绩");
			int fenShu=input.nextInt();//把i号同学的成绩存进去
			//zongFen=zongFen+fenShu;
			zongFen+=fenShu;//总分
			i++;

		}
		pingJun=zongFen/renShu;
		System.out.println("平均分是"+pingJun);
		
	}

}
