import java.io.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws Exception {
		int N = Integer.parseInt(br.readLine());

		int cnt = N;

		for (int i = 0; i < N; i++) {
			boolean[] check = new boolean[26];
			String s = br.readLine();
			check[s.charAt(0) - 'a'] = true;

			for (int j = 1; j < s.length(); j++) {

				if (s.charAt(j) != s.charAt(j - 1)) {
					if (check[s.charAt(j) - 'a']) {
						cnt--;
						break;
					} else {
						check[s.charAt(j) - 'a'] = true;
					}
				}

			}
		}
		System.out.println(cnt);
	}

}


