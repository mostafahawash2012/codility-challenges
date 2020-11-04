package JavaTraining;

public class OutterClass {
	public int count(int i) {
		return 0;
	}

	/* static */
	class InnerClass extends OutterClass {

		public int count(int i) {
			return 1;
		}

	}

	public static void main(String[] args) {
		OutterClass one = new OutterClass();
		InnerClass inner = one.new InnerClass();
		/* InnerClass inner = new InnerClass(); */
		inner.count(0);
	}

}
