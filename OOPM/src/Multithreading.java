class A extends Thread {
	public void run(){
		for(int i=1;i<=10;i++){
			System.out.println(i);
			try{
				Thread.sleep(500);
			}catch(InterruptedException e){
				System.out.println("Threat A interrupted");
			}
			System.out.println();
		}	
	}	
}

class B extends Thread {
	public void run(){
		for(char i=65;i<=74;i++){
			System.out.println(i);
			try{
				Thread.sleep(500);
			}catch(InterruptedException e){
				System.out.println("Threat B interrupted");
			}
			System.out.println();
		}	
	}	
}

class Multithreading{
	public static void main(String args[]){
		System.out.println("\033[H\033[2J"); // to clear screen or terminal
		A a = new A();
		a.start(); //.start is used for starting the thread or we can say that calling run function
		B b = new B();
		b.start();
		try{
			a.join(); //it is used to wait the thread a until thread b runs.. same for b
			b.join();
		}catch(InterruptedException e){		
			System.out.println("main thread interrupted");
		}
		
	}
}
