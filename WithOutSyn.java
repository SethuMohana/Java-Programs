class Table {
synchronized public void printTable(int n){
		for(int i=1;i<=10;i++){
			System.out.println(n*i);
		try{
			Thread.sleep(400);
		}catch(Exception e){
			System.out.println(e);
		}
	}
}
}
class TableDemo extends Thread{
	Table t;
	//Thread td = new Thread(t);
	TableDemo(Table t){
		this.t=t;
}
	public void run(){
		t.printTable(5);
	
	}
}
class TableDemo2 extends Thread{
	Table t;
	//Thread td = new Thread(t);
	TableDemo2(Table t){
		this.t=t;
}
	public void run(){
		t.printTable(100);
	
	}
}
public class WithOutSyn{
	public static void main(String[] args){
		Table t = new Table();
		TableDemo  td = new TableDemo(t);
		TableDemo2 td1 = new TableDemo2(t);
		td.start();
		td1.start();
	}
}


