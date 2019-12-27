package sample;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class game {

	public static void main(String[] args) {
		System.out.println("[1] アメリカの首都はどこ？");
		System.out.println("[2] 1:ニューヨーク");
		System.out.println("[3] 2:ワシントン");
		System.out.println("[4] 3:ロサンジェルス");
		System.out.println("[5] 4:答えを番号で入力してね＝＞");
		InputStreamReader inputStreamReader =  new InputStreamReader(System.in);
		BufferedReader bufferdReader = new BufferedReader(inputStreamReader);
		int answer = 0;
		String message = "間違いです";
		try {
			String buf = bufferdReader.readLine();
			answer = Integer.parseInt(buf);
		}catch(Exception exception) {
			answer = 0;
			message = "答えを番号で入力";
		}
		if(answer == 2) {
			message = "正解";
		}
		System.out.println(message);
	}
}




