package JavaTraining.JavaTraining;

public class Test {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class V {
	int type = 0;

	V(int t) {
		type = t;
	}
}

class C extends V {
	int cc = 0;

	C(int c, int v) {
		super(v);
		cc = c;
	}

	C(int c) {
		this(c, 3);
	}
}