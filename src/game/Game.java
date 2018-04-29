package game;

/*
 * by Jonathan Lee and Mark Hawes
 * Version too high to count
 */

public class Game extends Commands
{

	public void playGame()
	{
//		selectAClass(null);
//		initialStats();
//		addStartItems();
		while (!event.isComplete() && player.getHealth() > 0)
		{
			event.getEvent(player);
			if (!event.isComplete() && player.getHealth() > 0)
				chooseCommand();
		}
		if(event.isComplete() == true)
		System.out.println("Congratulations! Thank you for playing!");
	}
	
	public void initialStats(){
		System.out.println("Name: " + player.getName() + "\nDescription: " + player.getDescription() + "\nHealth: "
				+ player.getHealth() + "\nHit Rating: " + player.getHitRating() + "\nDodge Chance: "
				+ player.getDodgeChance());
		System.out.println();
	}
	
	public void addStartItems(){
		player.backpack.addConsumableToInventory(healthPotion);
		player.backpack.addEquippableToInventory(ironSword);
		player.backpack.addEquippableToInventory(leatherArmor);
	}
	
}