class ThreadDemoImp implements Runnable{
	public void run(){
		System.out.println("Thread running...................");
	}
public static void main(String[] args){
	ThreadDemoImp tdi = new ThreadDemoImp();
	Thread t = new  Thread(tdi);
	t.start();
	}
}
