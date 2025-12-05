package Day06;

class Movie{
	
	String title;
	String director;
	int year;
	
	public Movie(String title, String director, int year){
		this.title = title;
		this.director = director;
		this.year = year;
	}
	
	void printInfo() {
		System.out.println("영화: "+title+" 감독: "+director+" 개봉연도: "+year);
	}
	
}


public class Object02 {

	public static void main(String[] args) {
		
		Movie m = new Movie("기생충","봉준호",2019);
		m.printInfo();
		Movie y = new Movie("원령공주","지브리",1995);
		y.printInfo();
		Movie s = new Movie("몰라","몰라",2025);
		s.printInfo();
		
	}

}
