package JavaTraining;

public class StaticMethodTest{
	
	public static void compute(int i, int j){
		System.out.println("int version");
	}
	
	public void computee(int i, int j){
		System.out.println("long version");
	}
	
	public static void main(String args[]){
		StaticMethodTest t = new StaticMethodTest();
		compute(10, 5);
		t.computee(4, 4);
	}	
}
