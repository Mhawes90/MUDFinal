package entities;

// a generic character, just because
public class Useless extends NPC {

	public Useless(){
		setDescription("A townsfolk, no idea why they are here...");
	}
	
	public void interact(){
		System.out.println("It's become clear you do not speak their language.");
	}
	
}