package test2;

class parent{
	public void sub(int a) {
		System.out.println(a - a);
		
	}
}

class child extends parent{
	public void add(int a) {
		System.out.println(a+a);
	}


}



public class test {
	public static void main(String[] args) {
		child ch = new child();
		ch.add(2000);
	}
}	
	


