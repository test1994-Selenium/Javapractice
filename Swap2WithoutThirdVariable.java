package GenericPrograms;

public class Swap2WithoutThirdVariable {

	public static void main(String[] args) {
	
		int a=6;
		int b=4;
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		 
		System.out.println("value of a = "+a);
		System.out.println("value of b = "+b);

	}

}
