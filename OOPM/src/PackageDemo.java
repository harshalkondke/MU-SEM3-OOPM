
import package1.ClassA;

class ClassB extends ClassA {
	int n=20;
	void displayB(){
		System.out.println("Inside class B");
		System.out.println("m = "+m);
		System.out.println("n = "+n);
	}
}

class PackageDemo{
	public static void main(String args[]){
		ClassB B = new ClassB();
		B.displayA();
		B.displayB();
	}
}

/*
for this program make new directory inside the directory u already are.
name that new directory as your package name
in new directory create .java file of class that are present in your package
come to your privious directory and run your .JAVA file that contains main method
*/

//this code will be in my package directory


/*
package package1;
public class ClassA{
	protected int m=10;
	public void displayA(){
		System.out.println("inside class A");
		System.out.println("m = "+m);	
	}
}
*/
