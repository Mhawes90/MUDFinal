package test;

import entities.Fighter;
import entities.Mage;
import events.Combat;
import game.Game;
import utilities.Utilities;
import world.Location;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fighter fighter = new Fighter("Grognak", new Location(0, 0));
		Utilities util = new Utilities();
		//Combat combat = new Combat(fighter, util.generateMonster());
		Game mygame = new Game();
		
		mygame.playGame();
	}

}
