package model.abilities;

import java.util.ArrayList;

import model.world.Damageable;

public class DamagingAbility extends Ability {

	private int damageAmount;

	public DamagingAbility(String name, int cost, int baseCoolDown, int castRange, AreaOfEffect area, int required,
			int damageAmount) {
		super(name, cost, baseCoolDown, castRange, area, required);
		this.damageAmount = damageAmount;
	}

	public String toString() {
		return super.toString() + "Damage Amount: " + this.getDamageAmount() + '\n';
	}

	public String toString2() {
		return "Ability Type: Damaging Ability" + '\n' + "Damage Amount: " + this.getDamageAmount() + '\n' + super.toString2();
	}
	
	public int getDamageAmount() {
		return this.damageAmount;
	}

	public void setDamageAmount(int damageAmount) {
		this.damageAmount = damageAmount;
	}

	public void execute(ArrayList<Damageable> targets) {
		int size = targets.size();

		for (int i = 0; i < size; i++) {
			int newHP = targets.get(i).getCurrentHP() - this.getDamageAmount();
			targets.get(i).setCurrentHP(newHP);
		}
	}
}
