package applicatioon;

public class App {

	public static void main(String[] args) {
		// Do while executes at least once, even if the condition is false

		int count = 0;

		do {
			System.out.println("Count" + count);

			//count++;
			// Can increment inside the conditional below
		} while (count++ < 10);
	}

}
