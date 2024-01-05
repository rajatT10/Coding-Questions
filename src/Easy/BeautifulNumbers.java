package Easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class BeautifulNumbers {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter wr = new PrintWriter(System.out);
		int T = Integer.parseInt(br.readLine().trim());

		for (int t_i = 0; t_i < T; t_i++) {

			String[] str = br.readLine().split(" ");
			int l = Integer.parseInt(str[0]);
			int r = Integer.parseInt(str[1]);

			long out_ = solve(l, r);
			System.out.println(out_);

		}
		wr.close();
		br.close();
	}

	static long solve(int l, int r) {
		// Your code goes here
		long sum = 0;
		for (long i = l; i <= r; i++) {
			if (findTotalOfDigit(i))
				sum += i;
		}
		return sum;
	}

	private static boolean findTotalOfDigit(long l) {
		long sum = 0;
		if (l == 1)
			return true;
		else {
			while (l > 0) {
				long lastDigit = l % 10;
				sum += lastDigit * lastDigit;
				l = l / 10;
			}
		}
		if (sum >= 10) {
			return findTotalOfDigit(sum);
		} else if (sum < 10 && sum == 1) {
			return true;
		}
		return false;
	}
}