package Day05;

class Student{
	String name;
	int score;
	
	public Student(String name, int score) {
		this.name = name;
		this.score =score;
	}
	
	void getGrade() {
		if(score >= 90) {
			System.out.println(name + "의 학점은 A");
		} else if(score >= 80) {
			System.out.println(name + "의 학점은 B");
		} else if(score >= 70) {
			System.out.println(name + "의 학점은 C");
		} else {
			System.out.println(name + "의 학점은 D");
		}		
	}
	
}


public class Object04 {

	public static void main(String[] args) {
		
		Student s = new Student("joo", 90);
		s.getGrade();
	}

}
