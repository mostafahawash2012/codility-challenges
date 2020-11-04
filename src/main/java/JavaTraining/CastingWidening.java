package JavaTraining;

public class CastingWidening {

	int i = 5;
	long l = 50;
	char c = 'a';
	float f = 0.5f;
	double d = 32.4323;
	String s = "b";
	

	 
	 public static void main(String args[]) {
		 CastingWidening a = new CastingWidening();
		 a.print('a'); // cast the a char to int value of 97
	 }
	 
	 void print(int j) {
//	 	 i = l;
		 l = i;
//		 c = s;
//		 s = c;
	//   f = d;
		 d = f;
		 i = (int) l;
		 l = c;
		 f = i;
		 d = i;
//		 i = f;
	//   i = d;
		System.out.println(j);// prints 97
	}

}

