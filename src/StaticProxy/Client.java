package StaticProxy;

public class Client {
	public static void main(String[] args) {
		
		Tank t = new Tank();
		TankTimeProxy ttp = new TankTimeProxy(t);
		TankLogProxy tlp = new TankLogProxy(ttp);
		tlp.move();
		
	}
}
