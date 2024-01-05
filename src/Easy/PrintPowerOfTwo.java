package Easy;

public class PrintPowerOfTwo {

	public static void main(String[] args) {
		long N = 50;
		int i=0;
		double power = 0;
		while(power<N) {
			power = Math.pow(2, i);
			System.out.println(power);
			i++;
		}
	}
}
