package CommandPattern;

public class GarageDoorUpCommand implements Command {
	GarageDoor door;
	
	public GarageDoorUpCommand(GarageDoor door) {
		this.door = door;
	}
	
	public void execute() {
		door.up();
	}

}
