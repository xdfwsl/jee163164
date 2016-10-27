package javasejs163164;

import java.io.IOException;
import java.util.Scanner;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class JiaFa {

	public static void main(String[] args) {

		/*
		 * int x=10; double y=4.78; //double z=x+y; //double z=x; x=(int)y;
		 * System.out.println(x);
		 */
		/*
		 * int x=100;//准备加密的数 int jieGuo=(x*10+5)/2+(int)3.14159;//加密算法
		 * System.out.println(jieGuo);//输出结果
		 */
		// int x=(int)Math.random()*49+1;
		// System.out.println("请"+x+"号同学回答问题!");
		int count = 1;
		boolean flag = true;
		int max = 10;
		int n = 3;
		boolean jian = false;

		do {
			int[] x = new int[n]; // 变量数组
			int[] sum = new int[n];
			String exp = "";
			int result = 0;
			System.out.println("==========第" + count + "道==========");
			for (int i = 0; i < n; i++) {
				
				
				if(i==0){
					x[i] = (int) (Math.random() * max + 1 );// x是0到Max 10
					sum[i]=x[i];
					
					
				}
				else if (i > 0) {
					x[i] = (int) (Math.random() * (max-sum[i-1]) );// x是0到Max 10
					sum[i] += x[i]+sum[i-1];
					exp+="+";
					
				}
				exp+=x[i];//表达式
				
		

				// x[0]=(int)(Math.random()*max+1);//x是0到Max 10

				// x[1]=(int)(Math.random()*(max+1-x));//0到max 10
				// x[2]=(int)(Math.random()*(max+1-(x+y)));//0到max 10
			}
			// System.out.println(count);
			// System.out.println(x+"+"+y+"="+(x+y));
		//	System.out.print(x + "+" + y + "=");
			exp+="=";
			System.out.println(exp);
			
			
			Scanner input = new Scanner(System.in);
			if (input.nextInt() == sum[n-1]) {
				System.out.println("Good!");
				count++;
			} else {
				System.out.println("不对哟,正确答案是:");
				System.out.println(exp+"=" + sum[n-1]);
				flag = false;
				// System.out.println("不对哟,再试一次吧!");
				// System.out.print(x+"+"+y+"=");
			}

		} while (count < 16);

		if (flag) {
			System.out.println("恭喜,100分!");
			try {
				MusicTest.main(null);
			} catch (LineUnavailableException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (UnsupportedAudioFileException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			System.out.println("顺利过关,给你15个赞!!");
		}
	}

}
