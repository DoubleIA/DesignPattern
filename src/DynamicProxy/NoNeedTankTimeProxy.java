package DynamicProxy;

/**
 * 相同代码应该封装成方法。
 * 这个类不需要了
 * 
 */
public class NoNeedTankTimeProxy implements Movable {

	Movable t;
	
	public NoNeedTankTimeProxy(Movable t) {
		super();
		this.t = t;
	}
	
	

	@Override
	public void move() {
		long start = System.currentTimeMillis();
		System.out.println("Start time: " + start);
		t.move();
		long end = System.currentTimeMillis();
		System.out.println("Time: " + (end - start));
	}

	@Override
	public void stop() {
		long start = System.currentTimeMillis();
		System.out.println("Start time: " + start);
		t.stop();
		long end = System.currentTimeMillis();
		System.out.println("Time: " + (end - start));
	}

}
