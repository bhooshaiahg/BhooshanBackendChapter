package section1.question2;

abstract public class AbstractClassAnimal implements IFly, ISing, ISwim, IWalk {

	@Override
	public boolean walk() {
		return true;
	}

	@Override
	public boolean swim() {
		return true;

	}
	public void says(String msg) {
		System.out.println(msg);
	}
	public abstract boolean sing();

	public abstract boolean fly();

}
