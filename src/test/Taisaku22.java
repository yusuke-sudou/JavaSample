package test;

public class Taisaku22 {

	public static void main(String[] args) {
		
		// countとsunの初期値を設定
		int count = 0;
		int sum = 0;
		
		// 1～10までのループ作成
		for (int i = 1; i <= 10; i++) {
			
			// if文を使い偶数の場合を抽出
			if (i % 2 == 0) {
				
				// 偶数が見つかるたびにcountを1つずつ増やしていく
				count++;
				// 偶数が見つかるたびにsumに値を加えていく
				sum += i ;
			}
		}
		
		// 表示はループの外にて
		System.out.println("偶数の数：" + count);
		System.out.println("偶数の合計：" + sum);
		

	}

}

// 1～10までの偶数の数と偶数の合計を表示

