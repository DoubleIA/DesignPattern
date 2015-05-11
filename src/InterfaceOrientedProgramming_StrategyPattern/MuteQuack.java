package InterfaceOrientedProgramming_StrategyPattern;

public class MuteQuack implements QuackBehavior {

	public void quack() {
		System.out.println("<< Silence >>");
	}

}
