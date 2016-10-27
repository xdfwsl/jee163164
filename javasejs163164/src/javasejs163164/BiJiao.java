package javasejs163164;

import java.util.Scanner;

public class BiJiao {

	public static void main(String[] args) {

		int i = 0;
		boolean flag=true;//表示是否是全对!
		while (i < 3) {
			int x = (int) (Math.random() * 10 + 1);// x的范围是1-10
			int y = (int) (Math.random() * (11 - x));// y的范围是0-9
			int z = (int) (Math.random() * 11);// z的范围是0-10
			String fuHao = "";
			if (x + y > z) {
				fuHao = ">";
			} else if (x + y == z) {
				fuHao = "=";
			} else {
				fuHao = "<";
			}
			// System.out.println(x+"+"+y+fuHao+z);
			System.out.println(x + "+" + y + " ? " + z);
			Scanner input = new Scanner(System.in);
			String answer = input.next();
			if (answer.equals(fuHao)) {
				System.out.println("你真棒！");
			} else {
				//做错了
				System.out.println(x + "+" + y + fuHao + z);
				System.out.println("继续努力!");
				flag=false;//一旦做错了,就是不是全对了.
			}
			i++;
		}
		
		if(flag){
			 System.out.println("你太厉害了,奖励你一个金牌!!!!");
		}

	}

}
