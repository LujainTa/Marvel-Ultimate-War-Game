package views;

import java.util.ArrayList;

import engine.Game;
import engine.Player;
import engine.PriorityQueue;
import exceptions.AbilityUseException;
import exceptions.ChampionDisarmedException;
import exceptions.InvalidTargetException;
import exceptions.LeaderAbilityAlreadyUsedException;
import exceptions.LeaderNotCurrentException;
import exceptions.NotEnoughResourcesException;
import exceptions.UnallowedMovementException;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TextField;
import model.abilities.Ability;
import model.world.Champion;
import model.world.Direction;


public class Controller {

	private static Game game;
	Player playerOne;
	Player playerTwo;
	private static int c = 0;
	private static int c2 = 0;

	public void setNames(TextField playerOneName, TextField playerTwoName) {
		playerOne = new Player(playerOneName.getText());
		playerTwo = new Player(playerTwoName.getText());
	}

	public void setTeamOne(String championName) {
		try {
			game.loadAbilities("Abilities.csv");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			game.loadChampions("Champions.csv");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		ArrayList<Champion> availableChampions = game.getAvailableChampions();
		int size = availableChampions.size();
		
		if(playerOne.getTeam().size() == 3)
		{
			return;
		}
		
		for (int i = 0; i < size; i++) {
			if (availableChampions.get(i).getName().equals(championName))
			{
				playerOne.getTeam().add(availableChampions.get(i));
				break;
			}
		}
	}

	public void setTeamTwo(String championName) {
		try {
			game.loadAbilities("Abilities.csv");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			game.loadChampions("Champions.csv");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		ArrayList<Champion> availableChampions = game.getAvailableChampions();
		int size = availableChampions.size();
		
		if(playerTwo.getTeam().size() == 3)
		{
			return;
		}
		
		for (int i = 0; i < size; i++) {
			if (availableChampions.get(i).getName().equals(championName))
			{
				playerTwo.getTeam().add(availableChampions.get(i));
				break;
			}
		}
	}

	public void setTeamOneLeader(String championName)
	{
		try {
			game.loadAbilities("Abilities.csv");
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		try {
			game.loadChampions("Champions.csv");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(c == 1)
		{
			return;
		}
		c++;
		
		ArrayList<Champion> availableChampions = game.getAvailableChampions();
		int size = availableChampions.size();

		for (int i = 0; i < size; i++) {
			if (availableChampions.get(i).getName().equals(championName))
			{
				playerOne.setLeader(availableChampions.get(i));
				break;
			}
		}
	}
	
	public void setTeamTwoLeader(String championName)
	{
		try {
			game.loadAbilities("Abilities.csv");
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		try {
			game.loadChampions("Champions.csv");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(c2 == 1)
		{
			return;
		}
		c2++;
		
		ArrayList<Champion> availableChampions = game.getAvailableChampions();
		int size = availableChampions.size();

		for (int i = 0; i < size; i++) {
			if (availableChampions.get(i).getName().equals(championName))
			{
				playerTwo.setLeader(availableChampions.get(i));
				break;
			}
		}
		
		try {
			game = new Game(playerOne, playerTwo);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String getDetails(String championName)
	{
		try {
			game.loadAbilities("Abilities.csv");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			game.loadChampions("Champions.csv");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String s = "";
		
		for(int i = 0; i < game.getAvailableChampions().size(); i++)
		{
			if(game.getAvailableChampions().get(i).getName().equals(championName))
			{
				s = game.getAvailableChampions().get(i).toString();
				s = s + game.getAvailableChampions().get(i).getAbilities().get(0).toString() + game.getAvailableChampions().get(i).getAbilities().get(1).toString() + game.getAvailableChampions().get(i).getAbilities().get(2).toString();
				break;
			}
		}
		return s;
	}
	
	public String getChampionDetails2(String championName)
	{
		try {
			game.loadAbilities("Abilities.csv");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			game.loadChampions("Champions.csv");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String s = "";
		
		for(int i = 0; i < game.getAvailableChampions().size(); i++)
		{
			if(game.getAvailableChampions().get(i).getName().equals(championName))
			{
				s = game.getAvailableChampions().get(i).toString2();
				s = s + game.getAvailableChampions().get(i).getAbilities().get(0).toString2() + game.getAvailableChampions().get(i).getAbilities().get(1).toString2() + game.getAvailableChampions().get(i).getAbilities().get(2).toString2();
				for(int j = 0; j < game.getAvailableChampions().get(i).getAppliedEffects().size(); j++)
				{
					s = s + game.getAvailableChampions().get(i).getAppliedEffects().get(j).toString();
				}
				if(game.getAvailableChampions().get(i).getName().equals(playerOne.getLeader().getName()))
				{
					s = s + '\n' + "Status: Leader" + '\n' + "Leader Ability Used: " + game.isFirstLeaderAbilityUsed();
					break;
				}
				if(game.getAvailableChampions().get(i).getName().equals(playerTwo.getLeader().getName()))
				{
					s = s + '\n' + "Status: Leader" + '\n' + "Leader Ability Used: " + game.isSecondLeaderAbilityUsed();
					break;
				}
				break;
			}
		}
		return s;
	}
	
	public String getChampionDetails3(String championName)
	{
		try {
			game.loadAbilities("Abilities.csv");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			game.loadChampions("Champions.csv");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String s = "";
		
		for(int i = 0; i < game.getAvailableChampions().size(); i++)
		{
			if(game.getAvailableChampions().get(i).getName().equals(championName))
			{
				s = game.getAvailableChampions().get(i).toString2();
				s = s + game.getAvailableChampions().get(i).getAbilities().get(0).toString2() + game.getAvailableChampions().get(i).getAbilities().get(1).toString2() + game.getAvailableChampions().get(i).getAbilities().get(2).toString2();
				for(int j = 0; j < game.getAvailableChampions().get(i).getAppliedEffects().size(); j++)
				{
					s = s + game.getAvailableChampions().get(i).getAppliedEffects().get(j).toString();
				}
				break;
			}
		}
		return s;
	}
	
	public Object[][] getBoard()
	{
		return game.getBoard();
	}
	
	public PriorityQueue getTurnOrder() {
		return game.getTurnOrder();
	}
	
	public void updateMove(Direction d)
	{
		try {
			game.move(d);
		} catch (UnallowedMovementException | NotEnoughResourcesException e) {
			Alert alert = new Alert(AlertType.ERROR);
			if(e instanceof UnallowedMovementException)
			{
				alert.setHeaderText("Unallowed Movement Exception");
				alert.setContentText("You cannot move there!");
				alert.show();
			}
			if(e instanceof NotEnoughResourcesException)
			{
				alert.setHeaderText("Not Enough Resources Exception");
				alert.setContentText("You don't have enough resources!");
				alert.show();
			}
		}
	}
	
	public void endTurn() 
	{
		game.endTurn();
	}
	
	public void attack(Direction d)
	{
//		try {
//			game.attack(d);
//		} catch (NotEnoughResourcesException | ChampionDisarmedException e) {
//			Alert alert = new Alert(AlertType.ERROR);
//			if(e instanceof ChampionDisarmedException)
//			{
//				alert.setHeaderText("You are disarmed!");
//				alert.setContentText("You cannot attack!");
//				alert.show();
//			}
//			if(e instanceof NotEnoughResourcesException)
//			{
//				alert.setHeaderText("Not Enough Resources");
//				alert.setContentText("You don't have enough resources!");
//				alert.show();
//			}
//		}
		
		try {
			game.attack(d);
		} catch (NotEnoughResourcesException e) {
			Alert alert = new Alert(AlertType.ERROR);
			alert.setHeaderText("Not Enough Resources Exception");
			alert.setContentText(e.getMessage());
			alert.show();
		} catch (ChampionDisarmedException e) {
			Alert alert = new Alert(AlertType.ERROR);
			alert.setHeaderText("Champion Disarmed Exception");
			alert.setContentText(e.getMessage());
			alert.show();
		} catch (InvalidTargetException e) {
			Alert alert = new Alert(AlertType.ERROR);
			alert.setHeaderText("Invalid Target Exception");
			alert.setContentText(e.getMessage());
			alert.show();
		}
	}
	
	public void useLeaderAbility()
	{
//		try {
//			game.useLeaderAbility();
//		} catch (LeaderNotCurrentException | AbilityUseException | LeaderAbilityAlreadyUsedException e) {
//			Alert alert = new Alert(AlertType.ERROR);
//			if(e instanceof LeaderNotCurrentException)
//			{
//				alert.setHeaderText("Not leader!");
//				alert.setContentText("You are not the leader!");
//				alert.show();
//			}
//			if(e instanceof AbilityUseException)
//			{
//				alert.setHeaderText("Can not use ability!");
//				alert.setContentText("You cannot use the ability!");
//				alert.show();
//			}
//			if(e instanceof LeaderAbilityAlreadyUsedException)
//			{
//				alert.setHeaderText("Leader Ability Already Used!");
//				alert.setContentText("You already used the leader ability!");
//				alert.show();
//			}
//		}
		
		try {
			game.useLeaderAbility();
		} catch (LeaderNotCurrentException e) {
			Alert alert = new Alert(AlertType.ERROR);
			alert.setHeaderText("Leader Not Current Exception");
			alert.setContentText(e.getMessage());
			alert.show();
		} catch (LeaderAbilityAlreadyUsedException e) {
			Alert alert = new Alert(AlertType.ERROR);
			alert.setHeaderText("Leader Ability Already Used Exception");
			alert.setContentText(e.getMessage());
			alert.show();
		}
	}
	
	public Champion getCurrentChampion()
	{
		return game.getCurrentChampion();
	}
	
	public void castAbility(Ability a)
	{
		try {
			game.castAbility(a);
		} catch (NotEnoughResourcesException | AbilityUseException e) {
			if(e instanceof NotEnoughResourcesException)
			{
				Alert alert = new Alert(AlertType.ERROR);
				alert.setHeaderText("Not Enough Resources Exception");
				alert.setContentText(e.getMessage());
				alert.show();
			}
			if(e instanceof AbilityUseException)
			{
				Alert alert = new Alert(AlertType.ERROR);
				alert.setHeaderText("Ability Use Exception");
				alert.setContentText(e.getMessage());
				alert.show();
			}
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void castAbility(Ability a, Direction d)
	{
		try {
			game.castAbility(a, d);
		} catch (NotEnoughResourcesException e) {
			Alert alert = new Alert(AlertType.ERROR);
			alert.setHeaderText("Not Enough Resources Exception");
			alert.setContentText(e.getMessage());
			alert.show();
		} catch (AbilityUseException e) {
			Alert alert = new Alert(AlertType.ERROR);
			alert.setHeaderText("Ability Use Exception");
			alert.setContentText(e.getMessage());
			alert.show();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void castAbility(Ability a, int x, int y)
	{
		try {
			game.castAbility(a, x, y);
		} catch (NotEnoughResourcesException e) {
			Alert alert = new Alert(AlertType.ERROR);
			alert.setHeaderText("Not Enough Resources Exception");
			alert.setContentText(e.getMessage());
			alert.show();
		} catch (AbilityUseException e) {
			Alert alert = new Alert(AlertType.ERROR);
			alert.setHeaderText("Ability Use Exception");
			alert.setContentText(e.getMessage());
			alert.show();
		} catch (InvalidTargetException e) {
			Alert alert = new Alert(AlertType.ERROR);
			alert.setHeaderText("Invalid Target Exception");
			alert.setContentText(e.getMessage());
			alert.show();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
