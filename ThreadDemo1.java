class ThreadDemo1 extends Thread{
public void run(){
		System.out.println("Thread runn.....");
	}
	public static void main(String[] args){
		ThreadDemo1 td = new ThreadDemo1();
		td.start();
  }
}
