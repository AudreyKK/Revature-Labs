package newClassA;

public class NewClassA {
	
	public static int staticCount = 0;
	
	public int instanceCount = 0;
	
	public NewClassA() {
		staticCount++;
		this.instanceCount++;
	}

	public static void main(String[] args) {
		NewClassA.staticCount = 2494;
		NewClassA a = new NewClassA();
		
		
		System.out.println(a.instanceCount);
		System.out.println(NewClassA.staticCount);
		
		NewClassA a2 = new NewClassA();
		
		System.out.println(a2.instanceCount);
		System.out.println(NewClassA.staticCount);
		
		a.instanceCount = 15;
		
		System.out.println("object a instanceCount: " + a.instanceCount);
		System.out.println("object a2 instanceCount: " +  a2.instanceCount);
		
		System.out.println("class NewClassA staticCount: " + NewClassA.staticCount);

	}

}
