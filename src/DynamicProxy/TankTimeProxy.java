package DynamicProxy;
public class TankTimeProxy implements Movable {

    Movable t;

    public TankTimeProxy(Movable t) {
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