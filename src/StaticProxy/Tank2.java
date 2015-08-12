package StaticProxy;

public class Tank2 extends Tank {

	/**
	 * 继承方式非常差，不灵活
	 */
	@Override
	public void move() {
		long start = System.currentTimeMillis();
		super.move();
		long end = System.currentTimeMillis();
		System.out.println("Time: " + (end - start));
	}

}
