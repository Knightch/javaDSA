package algorithm;

public class TimeComplexityDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double now = System.currentTimeMillis();
		
		TimeComplexityDemo demo = new TimeComplexityDemo();
		
		System.out.println(demo.findSum1stMethod(99999));
		System.out.println("Time taken - " + (System.currentTimeMillis()- now) + " millisecs.");
		
		System.out.println(demo.findSum2ndMethod(99999));
		System.out.println("Time taken - " + (System.currentTimeMillis()- now) + " millisecs.");

	}
	
	public int findSum1stMethod(int n) {
		return n * ( n + 1 ) / 2;
	}
	
	public int findSum2ndMethod(int n) {
		int sum = 0;
		for(int i =1; i<= n; i++) {
			sum = sum + i;
		}
		return sum;
	}

}
