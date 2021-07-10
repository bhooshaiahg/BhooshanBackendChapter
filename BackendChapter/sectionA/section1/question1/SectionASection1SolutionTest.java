package section1.question1;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class SectionASection1SolutionTest {
	private Bird bird;

	@Before
	public void setUp() throws Exception {
		bird = new Bird();
	}
	@Test
	public void testSing() {
		bird.sing();
	}
	@Test
	public void testFly() {
		bird.fly();
	}
	@Test
	public void testWalk() {
		bird.walk();
	}
}
