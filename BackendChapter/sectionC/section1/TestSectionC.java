package section1;

public class TestSectionC {
	public static void main(String[] args) {
		ButterFly butterFly = new ButterFly();
		butterFly.fly();
		System.out.println("A butterfly can fly:"+butterFly.fly());
		
		
		Caterpillar caterpillar = new Caterpillar();
		caterpillar.walk();
		System.out.println("A caterpillar cannot fly:"+caterpillar.fly());
		System.out.println("A caterpillar can walk (crawl):"+caterpillar.walk());
		
		Metamorphosis metamorphosis= new Metamorphosis();
		ButterFly butterFlyChange = metamorphosis.change(caterpillar);
		
		System.out.println("A new butterfly can fly:"+butterFlyChange.fly());
	}
}
