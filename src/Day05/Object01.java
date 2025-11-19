package Day05;

class Car{
	String brand;
	int speed;
	
	void drive() {
		System.out.println(brand + " 브랜드가 달립니다! 현재 속도 : " + speed + "km/h");
	}
	
	void stop() {
		speed = 0;
		System.out.println("속도 " + speed + "으로 만들고 브레이크! 멈췄습니다.");
	}
}

public class Object01 {
	
	public static void main(String[] args) {
		
		Car c = new Car();
		
		c.brand = "현대";
		c.speed = 135;
		
		c.drive();
		c.stop();
		
	}

}