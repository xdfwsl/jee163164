package javasejs163164;

public class Dog {
	String mingZi;//狗名
	int nianLing;
	String yanSe;
	
	public void jiao() {
		System.out.println("汪汪!");
	}
	


	public static void main(String[] args) {
		Dog dog=new Dog();//类名 对象名 = new 和类名同名的构造方法()
		dog.jiao();
	}
}
