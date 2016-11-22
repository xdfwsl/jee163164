package javasejs163164;

public class Mao {
	String mingZi;
	String yanSe;
	int nianLing;
	
	public void jiao(){
		System.out.println("喵喵");
		System.out.println("我的名字叫"+this.mingZi);
	}

	@Override
	public String toString() {
		return "我的名字是:"+this.mingZi+"我的年龄是:"+this.nianLing+"我的颜色是"+this.yanSe;
		
	}

	
	
	


}
