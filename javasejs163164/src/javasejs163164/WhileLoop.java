package javasejs163164;

public class WhileLoop {

	public static void main(String[] args) {

		// while循环的特点,先判断,再循环
		int i = 1;
		int sum = 0;
		String exp = "";
		while (i <= 100) {
			exp += i;
			if (i != 100) {
				exp += "+";
			}
			sum += i;
			i++;
		}
		System.out.println(exp + "=" + sum);
	}

}
