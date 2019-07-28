class Overload{
	void area (int length, int breadth){
		System.out.println("The Area of Rectangle is : "+(length*breadth));
	}
	double area (double length, double breadth){
		return 0.5*length*breadth;
	}
	void area (double radius ){
		System.out.println("The area of circle is : "+3.14*radius*radius);
	}
}

class OverloadDemo1{
	public static void main(String args[]){
		Overload obj = new Overload();
		obj.area(2,3); //will get the area of Rectangle
		System.out.println("Area of Triangle is : "+obj.area(4.5,5.9));
		obj.area(5); // will get the area of circle 	
	}
}
