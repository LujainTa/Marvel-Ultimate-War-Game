package model.abilities;

import java.util.ArrayList;

import model.world.Champion;
import model.world.Damageable;

public class HealingAbility extends Ability {
	private int healAmount;

	public HealingAbility(String name, int cost, int baseCoolDown, int castRange, AreaOfEffect area, int required,
			int healAmount) {
		super(name, cost, baseCoolDown, castRange, area, required);
		this.healAmount = healAmount;
	}
	
	public String toString() {
		return super.toString() + "Heal Amount: " + this.getHealAmount() + '\n';
	}
	
	public String toString2() {
		return "Ability Type: Healing Ability" + '\n' + "Heal Amount: " + this.getHealAmount() + '\n' + super.toString2();
	}

	public int getHealAmount() {
		return this.healAmount;
	}

	public void setHealAmount(int healAmount) {
		this.healAmount = healAmount;
	}

	public void execute(ArrayList<Damageable> targets) {
		int size = targets.size();

		for (int i = 0; i < size; i++) {
			if (targets.get(i) instanceof Champion) {
				int newHP = targets.get(i).getCurrentHP() + this.getHealAmount();
				targets.get(i).setCurrentHP(newHP);
			}
		}
	}
}
