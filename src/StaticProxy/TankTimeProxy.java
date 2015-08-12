package StaticProxy;

public class TankTimeProxy implements Movable {

	Movable t;
	
	public TankTimeProxy(Movable t) {
		super();
		this.t = t;
	}

	@Override
	public void move() {
		long start = System.currentTimeMillis();
		t.move();
		long end = System.currentTimeMillis();
		System.out.println("Time: " + (end - start));
	}

}
