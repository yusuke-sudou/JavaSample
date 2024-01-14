package test;

public class EvenNumberStats {

	public static void main(String[] args) {
		int count = 0;
		int sum = 0;
		// 偶数の個数と合計を格納するための変数を初期化
		
		for (int i = 2; i <= 10; i += 2) {
			// 変数iを2から始め、2ずつ増加させながら10以下範囲で繰り返すfor文
			count++;
			// 偶数が見つかるん度にcountを1増やし最終的には偶数の総数がcountに格納
			sum += i;
			// 偶数が見つかるたびにsumに値を加えているので、最終的には偶数の合計がsumに格納
		}
		
		System.out.println("偶数の個数: " + count);
		System.out.println("偶数の合計: " + sum);

	}

}

