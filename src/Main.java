
public class Main {

	public static void main(String[] args) {

		// Use Math class methods
		double r = 3;
		double result = Math.PI * Math.pow(r, 2);
		System.out.println("Area of circle with radius 3: " + result);

		System.out.println(Math.pow(4, 2));
		System.out.println(Math.sqrt(Math.abs(-25)) + 4);

		// Making random numbers
		double rand = Math.random();
		System.out.println("Random Number: " + rand);

		// Now between 0 and 9
		rand = (int) (Math.random() * 10);
		System.out.println("Random Number 0-9: " + rand);

		// Now between 1 and 10
		rand = (int) (Math.random() * 10) + 1;
		System.out.println("Random Number 1-10: " + rand);

	}

}
