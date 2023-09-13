package MultiThreading;

public class $Join$isAlive {
	
	public static void main(String[] args) throws Exception {
		
		Thread t1 = new Thread(()->{
			for(int i = 0;i<5;i++) {
				System.out.println("Hi");
				try {Thread.sleep(1000);}catch(Exception e) {}
			}
		});
		Thread t2 = new Thread(()->{
			for(int i = 0;i<5;i++) {
				System.out.println("Hello");
				try {Thread.sleep(1000);}catch(Exception e) {}
			}
		});
		
		t1.start();
		try {Thread.sleep(10);}catch(Exception e) {}
		t2.start();
		
//		System.out.println(t1.isAlive()); true
//		System.out.println(t2.isAlive()); true
		
		t1.join();
		t2.join();
		
		System.out.println("Bye"); //main-thread
		
//		System.out.println(t1.isAlive()); false
//		System.out.println(t2.isAlive()); false
		
	}

}
