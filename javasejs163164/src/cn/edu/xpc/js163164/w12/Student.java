package cn.edu.xpc.js163164.w12;

public class Student {
	public String name;

	int x=0;
	
	public void chi(){
		System.out.println(this.name+"去吃饭");
	
		x=10;
	}
	
	public void dayouxi(){
		System.out.println(this.name+"去打游戏");
		
	}
	
	public void xiakequgansha(){
	
		chi();
		dayouxi();
	}
	
	

}
