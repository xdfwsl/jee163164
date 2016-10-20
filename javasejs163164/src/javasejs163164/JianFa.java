package javasejs163164;

import java.util.Scanner;

public class JianFa {

	public static void main(String[] args) {
		int count=1;
		boolean flag=true;
		do {
			System.out.println("==========第"+count+"道==========");
			int x=(int)(Math.random()*10)+1;//x是1到10
			int y=(int)(Math.random()*x+1);
			//System.out.println(count);
		//	System.out.println(x+"+"+y+"="+(x+y));
			System.out.print(x+"-"+y+"=");
			Scanner input =new Scanner(System.in);
			if(input.nextInt()==x-y){
				System.out.println("Good!");
				count++;
			}
			else
			{
				System.out.println("不对哟,正确答案是:");
				System.out.println(x+"-"+y+"="+(x-y));
				flag=false;
				//System.out.println("不对哟,再试一次吧!");
				//System.out.print(x+"+"+y+"=");
			}
			
			
		} while (count<16);

		if(flag){
			System.out.println("恭喜,100分!得到一枚减法奖牌");
		}else{
		System.out.println("顺利过关,给你15个赞!!");
		}

	}

}
