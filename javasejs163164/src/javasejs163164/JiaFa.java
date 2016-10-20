package javasejs163164;

import java.util.Scanner;

public class JiaFa {

	public static void main(String[] args) {
	
		/*int x=10;
		double y=4.78;
		//double z=x+y;
		//double z=x;
		x=(int)y;
		System.out.println(x);
*/
		/*
		 * int x=100;//准备加密的数
		int jieGuo=(x*10+5)/2+(int)3.14159;//加密算法
		System.out.println(jieGuo);//输出结果
		*/
		//int x=(int)Math.random()*49+1;
		//System.out.println("请"+x+"号同学回答问题!");
		int count=1;
		boolean flag=true;
		do {
			System.out.println("==========第"+count+"道==========");
			int x=(int)(Math.random()*9)+1;//x是1到9
			int y=(int)(Math.random()*(10-x)+1);
			//System.out.println(count);
		//	System.out.println(x+"+"+y+"="+(x+y));
			System.out.print(x+"+"+y+"=");
			Scanner input =new Scanner(System.in);
			if(input.nextInt()==x+y){
				System.out.println("Good!");
				count++;
			}
			else
			{
				System.out.println("不对哟,正确答案是:");
				System.out.println(x+"+"+y+"="+(x+y));
				flag=false;
				//System.out.println("不对哟,再试一次吧!");
				//System.out.print(x+"+"+y+"=");
			}
			
			
		} while (count<16);

		if(flag){
			System.out.println("恭喜,100分!得到一枚加法奖牌");
		}else{
		System.out.println("顺利过关,给你15个赞!!");
		}
	}

}
