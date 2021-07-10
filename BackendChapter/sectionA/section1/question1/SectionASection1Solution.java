package section1.question1;

class Animal {
	void walk() {
		System.out.println("I am walking");
	}
}

class Bird extends Animal {
	void fly() {
		System.out.println("I am flying");
	}
	void sing() {
		System.out.println("I am singing");
	}
}

public class SectionASection1Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bird bird = new Bird(); 
		 bird.walk();
		 bird.fly();
		/* here below line throws compile time error as there is no sing method implemented in Bird class, 
			To resolve this and to answer Section1 question, Yes we can implement sing() method in Bird class
			Added sing() method in Bird class and able to run this now successfully
		*/		 
		 bird.sing() ;
	}

}
