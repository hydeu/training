package Day05;

class Bus {
	String brand;
	int speed;
	
	public Bus(String brand, int speed) {
		this.brand = brand;
		this.speed = speed;
	}
	
	void run() {
		System.out.println(brand + "차량이 " + speed + "km/h 속도로 달립니다");
	}
	
	void stop() {
		speed = 0;
		System.out.println(brand + "차량이 " + speed + "가 되었습니다.");
	}
	
}


public class Object02a {
	
	public static void main(String[] args) {
		
		Bus c = new Bus("hyundai",50);
		c.run();
		c.stop();
	}
	
}
