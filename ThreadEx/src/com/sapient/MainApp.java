package com.sapient;

class Data {
	private int value;

	public void getValue() {
		System.out.println(value);
	}

	public void setValue(int value) {
		this.value = value;
	}
}

class Runner implements Runnable {
	Data data;
	Thread secondthread;

	public Runner() {
		data = new Data();
	}

	public void run() {
		Thread currThread;
		int i = 0;
		for (i = 0; i < 10; i++) {
			if (!secondthread.isAlive()) {
				secondthread.start();
			}
			currThread = Thread.currentThread();
			if (currThread.getName().equals("Producer"))

			{
				System.out.println(currThread);
				synchronized (data) {
					data.setValue(i + 1);
					data.notify();
					try {
						data.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					if(i==9)
					{
						data.notify();
					}
				}
			}

			else if (currThread.getName().equals("consumer")) {
				System.out.print(currThread);
				synchronized (data) {
					data.getValue();
					data.notify();
					try {
						
							data.wait();
						

					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				}

			}
		}

	}

	public void getsecondThread(Thread secondthread) {
		this.secondthread = secondthread;

	}
}

public class MainApp {
	public static void main(String[] args) {
		Runner runner = new Runner();
		Thread firstthread = new Thread(runner, "Producer");
		Thread secondthread = new Thread(runner, "consumer");
		firstthread.start();
		runner.getsecondThread(secondthread);
		try {
			secondthread.join();
			firstthread.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("end");

	}

}
