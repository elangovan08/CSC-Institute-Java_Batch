package multiThread;

 public class TestTwo  extends TestOne {

	protected String s ="Hello";
	
	
	protected void demo() {
		System.out.println("multiThread package");
	}
	
	
	public static void main(String[] args) {
		
		TestTwo obj2 = new TestTwo();
		
		obj2.start();
		
	}

	public void run() {
		System.out.println("Run by child");
	}
	
	
}
