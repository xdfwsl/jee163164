package cn.edu.xpc.js163164.w12;

public class XueSheng {
	int xueHao;
	String xingMing;

	
	public String deDaoMingZi(){
		return this.xingMing;
	}
	
	public void daYinMingZi(){
		System.out.println(this.deDaoMingZi());
	}
	@Override
	public String toString() {
		return "XueSheng [xueHao=" + xueHao + ", xingMing=" + xingMing + "]";
	}

	

}
