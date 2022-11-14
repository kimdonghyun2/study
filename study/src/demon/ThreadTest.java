package demon;

public class ThreadTest {
	
	public static void main(String[] args) {
		
		MainThread mainThread = new MainThread();
		DemonThread demonThread = new DemonThread();
		
		demonThread.setDaemon(true);
		
		mainThread.start();
		demonThread.start();
	}
}

class MainThread extends Thread{
	
	@Override
	public void run() {
		for (int i = 1; i <= 3; i++) {
			System.out.println("나는 메인 스레드 " + i);
		}
	}
}

class DemonThread extends Thread{
	
	int cnt = 1;
	@Override
	public void run() {
		while(true) {
			System.out.println("나는 데몬 스레드 " + cnt);
			cnt++;
		}
	}
}
