package recursiveAlgorithms;

public class RecursiveAlgorithms {

	public static void main(String[] args) {
		int input = 5;
		
		RecursiveAlgorithms rA = new RecursiveAlgorithms();
		
		System.out.println(rA.factorial(input));

	}

	public int factorial(int num) {
		if (num == 0) {
			return 0;
		}else if (num == 1) {
			return 1;
		}else {
			return factorial(num -1) * num;
		}
	}
}
