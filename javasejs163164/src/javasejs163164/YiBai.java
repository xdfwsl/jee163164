package javasejs163164;

/**
 * 1+2+3...+100=5050
 * 
 * @author 李洪燕
 * @version 201610251640
 * 
 * 需要交作业
 */
public class YiBai {

	public static void main(String[] args) {

		int i = 1;
		int sum = 0;// 和

		while (i <= 100) {

			sum += i;// sum=sum+i;
			i++;// i=i+1;
		}
		System.out.println("sum=" + sum);
	}

}
