package test3;

public class arry {
	private int[] numbers;
	
	public arry(int[]arr) {
		this.numbers = arr;
	}
	
	public void displayArray() {
		System.out.println("array elements:  ");
		for(int num: numbers) {
			System.out.println(num + " ");
		}
	}
	
	
	public static void main(String[] args) {
		int[] myArray = {10,20,40,50,60};
		arry obj = new arry(myArray);
		obj.displayArray();
	}

}
