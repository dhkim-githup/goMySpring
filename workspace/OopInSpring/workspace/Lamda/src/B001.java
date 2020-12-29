
public class B001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyTest mt = new MyTest();
		
		Runnable r = mt;
		
		r.run();		

	}
}	

   class MyTest implements Runnable{
		public void run() {
			System.out.println("Hello Lamda");
		}
	}


