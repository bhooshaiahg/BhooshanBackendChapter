package section2;



import section1.question2.Bird;
import section1.question2.Constants;

public class Duck extends Bird {
	public boolean sing() {
		return true;
	}
	public boolean swim() {
		return true;
	}
	
	public static void main(String[] args) {
		Duck duck = new Duck();
		duck.says(Constants.duckSingMessage);
		
	}
	
}
