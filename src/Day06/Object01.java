package Day06;

class Dog{
	
	String name;
	int age;
	
	public Dog(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	
	void bark() {
		System.out.println("멍멍! 나는 "+name+ ", "+age+"살!");
	}
	
	void info() {
		System.out.println("강아지 정보 : "+name+", 나이 " + age);
	}
	
	
	
}

public class Object01 {
	
	public static void main(String[] args) {
	
		Dog d = new Dog("초코", 3);
		d.bark();
		d.info();
		
	}

}
