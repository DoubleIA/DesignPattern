package DynamicProxy;

public class Client {
	public static void main(String[] args) throws Exception {
		
//		Tank t = new Tank();
//		TankTimeProxy ttp = new TankTimeProxy(t);
//		Movable m = ttp;
//		m.move();
//		动态代理不需要看到代理类的名字。
		
		Movable m = (Movable) Proxy.newProxyInstance();
		m.move();
		m.stop();
	}
}
