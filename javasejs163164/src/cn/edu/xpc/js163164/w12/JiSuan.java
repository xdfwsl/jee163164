package cn.edu.xpc.js163164.w12;

public class JiSuan {
	int java;
	int wangYe;
	int yingYu;
	
	public int suanZongFen(){
		return java+wangYe+yingYu;
	}
	
	public void dyZongFen(){
		System.out.println(this.suanZongFen());
	}
	
	public int suanPingJun(){
		return suanZongFen()/3;
	}
	
	public void dyPingJun(){
		System.out.println(this.suanPingJun());
	}

}
