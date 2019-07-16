import java.io.*;
class Box {
	double width;
	double height;
	double depth;
	Box(){
		width=10;
		height=20;
		depth=30;
		System.out.println("The height of box is : "+height);
		System.out.println("The width of box is : "+width);
		System.out.println("The depth of box is : "+depth);
	}
	Box(double width, double height, double depth){
		this.width=width;
		this.height=height;
		this.depth=depth;	
	}
	Box(Box obj){
		width=obj.width;
		depth=obj.depth;
		height=obj.height;
	}
	double volume(){
		return width*height*depth;
	}
}


class ConstructorDemo{
	public static void main(String args[]){
		Box obj1 = new Box();
		System.out.println("The volume of box1 is : "+obj1.volume());
		Box obj2 = new Box(120,30,45);
		System.out.println("The volume of box2 is : "+obj2.volume());
		Box obj3 = new Box(obj1);
		System.out.println("The volume of box3 is : "+obj3.volume());
	}
}
