class Bitshift{
	public static void main(String args[]){
		int a=6;
		int x=1;
	 	System.out.println("\033[H\033[2J");
		System.out.println("a = "+a);
		System.out.println("Shift left by 1 bits a<<1 : "+(a<<1));
		System.out.println("Shift right by 2 bits a>>2 : "+(a>>2));
		System.out.println("Shift left with zero fill by 29 bits x>>>29 : "+(x>>>29));
		System.out.println("Shift left with zero fill by 29 bits x>>>30 : "+(x>>>30));
		System.out.println("Shift left with zero fill by 29 bits x>>>31 : "+(x>>>31));
	}
}
