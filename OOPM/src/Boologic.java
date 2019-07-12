
public class Boologic {
	public static void main(String args[]){
		boolean a=true;
		boolean b=true;
		boolean c=a|b;
		boolean d=a&b;
		boolean e=a^b;
		boolean f=((!a&b)|(a&!b));
		boolean g=!a;
		System.out.println("\033[H\033[2J");
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		System.out.println("a|b = "+c);
		System.out.println("a&b = "+d);	
		System.out.println("a^b = "+e);
		System.out.println("((!a&b)|(a&!b)) = "+f);
		System.out.println("!a = "+g);
	}

}
