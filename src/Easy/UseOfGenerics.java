package Easy;

public class UseOfGenerics {
	
	public static void main(String[] args) {
		int a = 25;
		int b = 15;
		Sum<Integer> sum = new Sum(a, b);
		System.out.println(sum.calculate());
	}

}

class Sum<T> {
	
	T number1;
	T number2;
	
	public Sum(T t1, T t2) {
		this.number1 = t1;
		this.number2 = t2;
	}
	
	public <K> T calculate(){
		return this.number1;
	}
}
