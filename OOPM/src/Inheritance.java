//base class or parent class
class Bicycle{
	public int gear;
	public int speed;
	
	public Bicycle(int gear,int speed){
		this.gear=gear;
		this.speed=speed;
	}
	public String display(){
		return ("No of gears are : "+gear+"\n"+"Speed of Bicycle : "+speed);
	}
}

class MountainBike extends Bicycle{
	public int height;
	
	public MountainBike(int gear,int speed,int height){
		super(gear, speed); // in-vooooooking base class constructor
		this.height=height;
	}
	public String display(){
		return(super.display()+"\n"+"Height is : "+height);
	}
}

class Inheritance{
	public static void main(String args[]){
		MountainBike muk = new MountainBike(3,45,130);
		System.out.println(muk.display());
	}
}
