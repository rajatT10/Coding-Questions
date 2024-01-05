package useLambda;

public class UseOfLambda {
	
	public static void main(String[] args) {
		Dog d = new Dog();
		Printable printName = s -> System.out.println(s);
		printName.print(d.name);
	}
}
