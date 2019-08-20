import java.util.Scanner;
class Scanner_Fibo{
	public static void main(String args[]){
		int n,a=0,b=0,c=1;
		Scanner s = new Scanner(System.in);
		System.out.println("\033[H\033[2J");
		System.out.println("Enetr the value of n :");
		n=s.nextInt();
		System.out.println("First N elements of Fabonacci series are : ");
		for(int i = 1;i<=n;i++){
			a=b;
			b=c;
			c=a+b;
			System.out.println(a+" ");
		}
	}
}
