package javasejs163164;

import java.util.Scanner;



public class Test20161013 {

	public static void main(String[] args) {
		//以下三步是用来接收键盘输入的
		//链接：http://pan.baidu.com/s/1bpgLlEn 密码：rbhh
		Scanner input=new Scanner(System.in);
		System.out.println("请输入分数:");
		int x=input.nextInt();
		if(x>90){
			System.out.println("very good!");
		}else{
			System.out.println("再接再励!");
		}
	/*	if(x<=90){
			System.out.println("再接再励!");
		}
		
*/		
	

	}

}
