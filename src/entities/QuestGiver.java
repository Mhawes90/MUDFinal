package entities;

public class QuestGiver extends NPC {
	// boolean to check to see if quest was given or not
	boolean gaveQuest;
//	String [] questDialogue={"Good day, Adventurer! I require your assistance.","Would you kindly return my house key to me?","It's made of brass. I'll reward you accordlingly!"};
	
	public QuestGiver(){
		setDescription("An upstanding looking townsfolk");
		gaveQuest = false;
	}
	
//	public String[] getQuestDialogue()
//	{
//		return questDialogue;
//	}
//
//	public void setQuestDialogue(String[] questDialogue)
//	{
//		this.questDialogue = questDialogue;
//	}

	public void interact(){//gives quest if not already given, repeats request if quest already given
		if (gaveQuest = false){
			giveQuest();
			gaveQuest = true;//could move to giveQuest
		}
		if (gaveQuest = true){
			repeatScript();
		}
	}
	
	public String giveQuest()
	{
//		for(int i=0; i<questDialogue.length;i++){//changed to string array and for loop -z
//			System.out.println(questDialogue[i]);
//		}
		return  "A villager approaches you: \n\"Good day, Adventurer! I require your assistance."
		+ "\nWould you kindly return my house key to me?\nIt's made of brass. I'll reward you accordlingly!\"";
	}
	
	public String repeatScript(){
		return "Have you found my key yet?";
	}
	
	public String finishQuest(){//endgame line
		return "You found it! Oh thank you, thank you, thank you!\nNow I can finally return home!\n\n";
	}
}
