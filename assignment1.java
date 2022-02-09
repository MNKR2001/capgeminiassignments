package threads;

public class oes implements Runnable{
	static Thread ot;
	static Thread et;

	public static void main(String[] args) {
		oes oe = new oes();

		ot = new Thread(oe, "ot");
		et = new Thread(oe, "et");

		ot.start();
		et.start();
	}


	public void run() {
		try {
			if (Thread.currentThread().getName().equals("ot")) 
				et.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		for (int i = 1; i <= 20; i++) {
			if (Thread.currentThread().getName().equals("et")) {
				if (i % 2 == 0) System.out.println(i);
			} 

			if (Thread.currentThread().getName().equals("ot")) {
				if (i % 2 == 1) System.out.println(i);
			}
		}
	}

}
