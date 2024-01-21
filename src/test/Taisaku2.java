package test;

public class Taisaku2 {

	public static void main(String[] args) {
		int count = 0;
		int sum = 0;
		for (int i = 2; i <= 10; i+=2) {
			count++;
			sum +=i;
		}
		System.out.println("偶数の数：" + count);
		System.out.println("偶数の合計：" + sum);

	}

}
