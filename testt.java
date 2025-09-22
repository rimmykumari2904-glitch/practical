package test3;

public class testt {
	public static void main(String[] args) {
		int a = 0;
		int b = 0;
		
		for(int num = 20; num<=30; num++) {
			if(num % 2 == 0) {
				a++;
			}
			
			if(num % 3 == 0) {
				b++;
			}
		}
		
		System.out.println("number divisible by 2:" +a);
		System.out.println("number divisible by 3:" +b);
	}

	
	
}

