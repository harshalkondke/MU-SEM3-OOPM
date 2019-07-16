
public class CommandLineArgument {
		public static void main(String args[]){
			int n,d,rev=0,i;
			System.out.println("\033[H\033[2J");
			n=Integer.parseInt(args[0]);
			i=n;
			while(n!=0){
				d=n%10;
				rev=rev*10+d;
				n=n/10;
			}
			System.out.println("The given no "+i+" Words is :");
			while(rev!=0){
				d=rev%10;
				rev=rev/10;
				switch(d){
					case 1 : System.out.print("one "); break;
					case 2 : System.out.print("two "); break;
					case 3 : System.out.print("three "); break;
					case 4 : System.out.print("four "); break;
					case 5 : System.out.print("five "); break;
					case 6 : System.out.print("six "); break;
					case 7 : System.out.print("seven "); break;
					case 8 : System.out.print("eight "); break;
					case 9 : System.out.print("nine "); break;
					case 0 : System.out.print("zero "); break;			

				}
			}
		}
}
