package t03_state;

// 상태를 확인할 스레드
public class TargetThread extends Thread{
	
	@Override
	public void run() {
		// RUNNABLE
		for(long i = 0; i < 30000000000L; i++);
		
		try {
			sleep(1500); // 1.5초동안 TIMED_WAITTING
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		// RUNNABLE
		for(long i = 0; i < 30000000000L; i++);
		
		// TERMINATED
		
	} // end run

}















