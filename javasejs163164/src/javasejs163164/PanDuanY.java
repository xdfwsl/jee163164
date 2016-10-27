package javasejs163164;

import java.util.Scanner;

public class PanDuanY {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("表演得怎么样 ？(y/n):");
		String answer = input.next();

		while (! answer.equals("y")) {

				System.out.println("早上5点开始练声 ！");
				System.out.println("上午练习钢琴 ！");
				System.out.println("下午到声乐老师家练习唱歌 ！");
		              System.out.println("晚上练习舞蹈基本功!"); 
				System.out.print("表演得怎样 ？(y/n):");
				answer = input.next();
		}

		System.out.println("圆满完成 ！");


	}

}
