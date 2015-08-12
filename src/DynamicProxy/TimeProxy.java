package DynamicProxy;
public class TimeProxy implements Movable {

    Movable t;

    public TimeProxy(Movable t) {
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