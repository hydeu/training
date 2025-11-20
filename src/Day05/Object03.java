package Day05;

class Car2{
	String brand;
	int speed;
	
	
	public Car2(String brand, int speed) {
		this.brand = brand;
		this.speed = speed;
	}
	
	void setSpeed(int s) {
		s = speed;
	}
	
	void accelerate() {
		speed += 10;
	}
	
	void break2() {
		speed = 0;
	}
	
	void info() {
		System.out.println("브랜드 : " + brand + ", 속도 : " + speed + "km/h");
	}
	
}

public class Object03 {
	
	public static void main(String[] args) {
	
		Car2 c2 = new Car2("현대", 30);
		c2.accelerate();
		c2.accelerate();
		c2.info();
	}

}
