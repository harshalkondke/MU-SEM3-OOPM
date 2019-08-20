import java.util.Scanner;
class Scanner_Armstrong{
	public static void main(String args[]){
		int n,b,sum=0,a;
		Scanner s =new Scanner(System.in);
		System.out.println("\033[H\033[2J");
		System.out.println("Enter the value of n : ");
		n=s.nextInt();
		System.out.println("the First N armstrong no are :");
		for(int i=1;i<=n;i++){
			a=i;
			while(a>0){
				b=a%10;
				sum=sum+(b*b*b);
				a=a/10;
			}
			if(sum==i)
				System.out.println(i+" ");
			sum=0;
			
		}
	}
}
