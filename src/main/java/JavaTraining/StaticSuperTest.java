package JavaTraining;

class One {

	public static void process() {
		System.out.print("Parent");
	}
}

class Two extends One {
	public static void process() {
		// super.process(); // ERROR Cannot use super/this in a static context
		One.process();
		System.out.print("Child");
	}
}

public class StaticSuperTest {

	public static void main(String args[]) {

		One one = new Two();
		Two.process();
		System.out.println(new Boolean("true"));
	}

}
