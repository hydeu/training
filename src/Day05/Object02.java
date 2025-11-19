package Day05;

class Person{
	String name;
	int age;
	
	//생성자
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	void introduce() {
		System.out.println("안녕하세요, 저는 " + name + ", 나이는 " + age + "살 입니다.");
	}
}

public class Object02 {

	public static void main(String[] args) {

		Person p = new Person("joo", 31);		
		p.introduce();
	}
}