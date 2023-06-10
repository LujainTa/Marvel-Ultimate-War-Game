package model.abilities;

import java.util.ArrayList;

import model.world.Damageable;

public abstract class Ability {
	private String name;
	private int manaCost;
	private int baseCooldown;
	private int currentCooldown;
	private int castRange;
	private int requiredActionPoints;
	private AreaOfEffect castArea;

	public Ability(String name, int cost, int baseCoolDown, int castRange, AreaOfEffect area, int required) {
		this.name = name;
		this.manaCost = cost;
		this.baseCooldown = baseCoolDown;
		this.castRange = castRange;
		this.castArea = area;
		this.requiredActionPoints = required;
	}

	public String toString() {
		return '\n' + "Ability Name: " + this.getName() + '\n' + "Mana Cost: " + this.getManaCost() + '\n'
				+ "Base Cooldown: " + this.getBaseCooldown() + '\n' + "Cast Range: " + this.getCastRange() + '\n'
				+ "Area Of Effect: " + this.getCastArea() + '\n' + "Required Action Points: "
				+ this.getRequiredActionPoints() + '\n';
	}

	public String toString2() {
		return "Ability Name: " + this.getName() + '\n' + "Area Of Effect: " + this.getCastArea() + '\n'
				+ "Cast Range: " + this.getCastRange() + '\n' + "Mana: " + this.getManaCost() + '\n' + "Action Costs: "
				+ this.getRequiredActionPoints() + '\n' + "Current Cooldown: " + this.getCurrentCooldown() + '\n'
				+ "Base Cooldown: " + this.getBaseCooldown() + '\n' + '\n';
	}

	public String getName() {
		return this.name;
	}

	public int getManaCost() {
		return this.manaCost;
	}

	public int getBaseCooldown() {
		return this.baseCooldown;
	}

	public int getCurrentCooldown() {
		return this.currentCooldown;
	}

	public void setCurrentCooldown(int currentCooldown) {
		if (currentCooldown > this.baseCooldown)
			this.currentCooldown = this.baseCooldown;
		else if (currentCooldown < 0)
			this.currentCooldown = 0;
		else
			this.currentCooldown = currentCooldown;
	}

	public int getCastRange() {
		return this.castRange;
	}

	public int getRequiredActionPoints() {
		return this.requiredActionPoints;
	}

	public AreaOfEffect getCastArea() {
		return this.castArea;
	}

	public abstract void execute(ArrayList<Damageable> targets) throws CloneNotSupportedException;
}
