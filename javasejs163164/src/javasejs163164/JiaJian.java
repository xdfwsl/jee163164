package javasejs163164;

import java.io.IOException;
import java.util.Scanner;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class JiaJian {

	static int count = 1;
	static boolean flag = true;

	public static void main(String[] args) {

		do {
			System.out.println("==========第" + count + "道==========");
			int sj = (int) (Math.random() * 2);
			if (sj == 0) {
				jia();
			} else {
				jian();
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

	private static void jia() {

		int max=10; //最大和数
		int n=3;//连N
		boolean jian=false;
		int[] x=new int[n]; //变量数组
		int[] sum=new int[n-1];
		
		x[0] = (int) (Math.random() * 9) + 1;// x是1到9
		x[1] = (int) (Math.random() * (10 - x[0]) + 1);// y是1到9
		// System.out.println(count);
		// System.out.println(x+"+"+y+"="+(x+y));
		System.out.print(x[0] + "+" + x[1] + "=");
		Scanner input = new Scanner(System.in);
		if (input.nextInt() == x[0] + x[1]) {
			System.out.println("Good!");
			count++;
		} else {
			System.out.println("不对哟,正确答案是:");
			System.out.println(x[0] + "+" + x[1] + "=" + (x[0] + x[1]));
			flag = false;
			// System.out.println("不对哟,再试一次吧!");
			// System.out.print(x+"+"+y+"=");
		}

	}

	private static void jian() {

		int x = (int) (Math.random() * 10) + 1;// x是1到10
		int y = (int) (Math.random() * x + 1);
		// System.out.println(count);
		// System.out.println(x+"+"+y+"="+(x+y));
		System.out.print(x + "-" + y + "=");
		Scanner input = new Scanner(System.in);
		if (input.nextInt() == x - y) {
			System.out.println("Good!");
			count++;
		} else {
			System.out.println("不对哟,正确答案是:");
			System.out.println(x + "-" + y + "=" + (x - y));
			flag = false;
			// System.out.println("不对哟,再试一次吧!");
			// System.out.print(x+"+"+y+"=");
		}

	}

}
