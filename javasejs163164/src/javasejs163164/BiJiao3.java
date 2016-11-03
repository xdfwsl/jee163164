package javasejs163164;

import java.util.Scanner;

public class BiJiao3 {

	public static void main(String[] args) {

		int i = 0;
		boolean flag=true;//表示是否是全对!

		while (i < 10) {
			int x = (int) (Math.random() * 10 + 1);// x的范围是1-10
			int y = (int) (Math.random() * (11 - x));// y的范围是0-9
			int x2 = (int) (Math.random() * 10 + 1);// x的范围是1-10
			int y2 = (int) (Math.random() * (11 - x));// y的范围是0-9
			// int z = x2+y2;//(int) (Math.random() * 11);// z的范围是0-10
			//我现在要做的是随机产生加减法
/*			int op=(int)(Math.random()*2 );
			System.out.println(op);
			if(op==0){
				//加法
			}
			else{
				//减法
			}*/
			String fuHao = "";
			if (x + y > x2 + y2) {
				fuHao = ">";
			} else if (x + y == x2 + y2) {
				fuHao = "=";
			} else {
				fuHao = "<";
			}
			// System.out.println(x+"+"+y+fuHao+x2+"+"+y2);
			System.out.println(x + "+" + y + " ? " + x2 + "+" + y2);
			Scanner input = new Scanner(System.in);
			String answer = input.next();
			if (answer.equals(fuHao)) {
				System.out.println("你真棒！");
			} else {
				// 做错了
				System.out.println(x + "+" + y + fuHao + x2 + "+" + y2);
				System.out.println("继续努力!");
				flag = false;// 一旦做错了,就是不是全对了.
			}
			i++;
		}

		if (flag) {
			System.out.println("你太厉害了,奖励你一个金牌!!!!");
		}

	}

}
