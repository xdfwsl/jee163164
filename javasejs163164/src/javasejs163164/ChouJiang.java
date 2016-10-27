package javasejs163164;

import java.util.Scanner;

 /**
  * 这是计算163.164班的抽奖程序
  * @author 作者:李
  * @version 版本:2016-10-20
  * 
  */
 
public class ChouJiang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		int renShu=40;//班级人数
		int i=0;
		Scanner input=new Scanner(System.in);
	
		while (i<5) {
			System.out.println((int)(Math.random()*renShu+1));
			i++;
			
		}
		
		
		
	}

}
