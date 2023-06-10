package model.world;

import java.awt.*;
import java.util.ArrayList;

import model.abilities.Ability;
import model.effects.Effect;

public abstract class Champion implements Damageable, Comparable {
	private String name;
	private int maxHP;
	private int currentHP;
	private int mana;
	private int maxActionPointsPerTurn;
	private int currentActionPoints;
	private int attackRange;
	private int attackDamage;
	private int speed;
	private ArrayList<Ability> abilities;
	private ArrayList<Effect> appliedEffects;
	private Condition condition;
	private Point location;
	

	public Champion(String name, int maxHP, int mana, int maxActions, int speed, int attackRange, int attackDamage) {
		this.name = name;
		this.maxHP = maxHP;
		this.currentHP = maxHP;
		this.mana = mana;
		this.maxActionPointsPerTurn = maxActions;
		this.currentActionPoints = maxActionPointsPerTurn;
		this.speed = speed;
		this.attackRange = attackRange;
		this.attackDamage = attackDamage;
		this.condition = Condition.ACTIVE;
		appliedEffects = new ArrayList<>();
		abilities = new ArrayList<>();
	}

	public String toString() {
		return "Name: " + this.getName() + '\n' + "Max HP: " + this.getMaxHP() + '\n' + "Mana: " + this.getMana() + '\n'
				+ "Max Actions: " + this.getMaxActionPointsPerTurn() + '\n' + "Speed: " + this.getSpeed() + '\n'
				+ "Attack Range: " + this.getAttackRange() + '\n' + "Attack Damage: " + this.getAttackDamage() + '\n';
	}

	public String toString2() {
		return "Name: " + this.getName() + '\n' + "Current HP: " + this.getCurrentHP() + '\n' + "Mana: "
				+ this.getMana() + '\n' + "Speed: " + this.getSpeed() + '\n' + "Max Action Points: "
				+ this.getMaxActionPointsPerTurn() + '\n' + "Current Action Points : " + this.getCurrentActionPoints()
				+ '\n' + "Attack Damage: " + this.getAttackDamage() + '\n' + "Attack Range: " + this.getAttackRange()
				+ '\n' + '\n';
	}

	public String getName() {
		return this.name;
	}

	public int getMaxHP() {
		return this.maxHP;
	}

	public int getCurrentHP() {
		return this.currentHP;
	}

	public void setCurrentHP(int currentHP) {
		if (currentHP > this.maxHP)
			this.currentHP = this.maxHP;
		else if (currentHP < 0)
			this.currentHP = 0;
		else
			this.currentHP = currentHP;
	}

	public int getMana() {
		return this.mana;
	}

	public void setMana(int mana) {
		this.mana = mana;
	}

	public int getMaxActionPointsPerTurn() {
		return this.maxActionPointsPerTurn;
	}

	public void setMaxActionPointsPerTurn(int maxActionPointsPerTurn) {
		this.maxActionPointsPerTurn = maxActionPointsPerTurn;
	}

	public int getCurrentActionPoints() {
		return this.currentActionPoints;
	}

	public void setCurrentActionPoints(int currentActionPoints) {
		if (currentActionPoints > this.maxActionPointsPerTurn)
			this.currentActionPoints = this.maxActionPointsPerTurn;
		else if (currentActionPoints < 0)
			this.currentActionPoints = 0;
		else
			this.currentActionPoints = currentActionPoints;
	}

	public int getAttackRange() {
		return this.attackRange;
	}

	public int getAttackDamage() {
		return this.attackDamage;
	}

	public void setAttackDamage(int attackDamage) {
		this.attackDamage = attackDamage;
	}

	public int getSpeed() {
		return this.speed;
	}

	public void setSpeed(int currentSpeed) {
		if (currentSpeed < 0)
			this.speed = 0;
		else
			this.speed = currentSpeed;
	}

	public ArrayList<Ability> getAbilities() {
		return this.abilities;
	}

	public ArrayList<Effect> getAppliedEffects() {
		return this.appliedEffects;
	}

	public Condition getCondition() {
		return this.condition;
	}

	public void setCondition(Condition condition) {
		this.condition = condition;
	}

	public Point getLocation() {
		return this.location;
	}

	public void setLocation(Point location) {
		this.location = location;
	}

	public void insertAbility(Ability ability) {
		this.abilities.add(ability);
	}

	public int compareTo(Object o) {
		if (this.getSpeed() > ((Champion) o).getSpeed())
			return -1;
		else if (this.getSpeed() < ((Champion) o).getSpeed())
			return 1;
		else
			return this.getName().compareTo(((Champion) o).getName());
	}

	public abstract void useLeaderAbility(ArrayList<Champion> targets);
}
