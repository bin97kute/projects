package example_java_session9_1;

public class TestThread {

	public static void main(String[] args) {
		//VD về luồng
//		MyThread mt1 = new MyThread();
//		mt1.setName("Luồng 1");
//		MyThread mt2 = new MyThread();
//		mt2.setName("Luồng 2");
//		MyThread mt3 = new MyThread();
//		mt3.setName("Luồng 3");
		
//		mt1.start();
//		mt2.start();
		
//		MyThread2 mt1= new MyThread2();
//		
//		Thread th1=new Thread(mt1);
//		th1.setName("L1");
//		Thread th2=new Thread(mt1);
//		th2.setName("L2");
		
//		th1.start(); 
//		th2.start(); start() cho phép chạy ngẫu nhiên các luồng
//		th1.run(); //run() chạy theo tt thông thường
//		th2.run();
		Common cm=new Common();
		MyThread3 th3=new MyThread3(cm);
		MyThread4 th4=new MyThread4(cm);
		th3.start();
		th4.start();
	}

}
