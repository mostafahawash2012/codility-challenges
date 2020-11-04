package JavaTraining;

public class InhertanceTest {

	static class TextInput {
		String output = "";

		void add(char c) {
			output += c;
		}

		String getValue() {
			return output;
		}
	}

	static class NumericInput extends TextInput {
		
		@Override
		void add(char c) {
			if (Character.isDigit(c))
				output += c;
		}
	}
	
	public static void main(String[] args) {
		TextInput input = new NumericInput();
		input.add('1');
		input.add('a');
		input.add('0');
		System.out.println(input.getValue());
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