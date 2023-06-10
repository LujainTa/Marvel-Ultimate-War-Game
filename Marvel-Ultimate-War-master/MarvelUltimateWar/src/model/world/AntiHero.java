package model.world;

import java.util.ArrayList;

import model.effects.Effect;
import model.effects.Stun;

public class AntiHero extends Champion {

	public AntiHero(String name, int maxHP, int mana, int maxActions, int speed, int attackRange, int attackDamage) {
		super(name, maxHP, mana, maxActions, speed, attackRange, attackDamage);
		super.setCurrentHP(maxHP);
	}

	public String toString2() {
		return "Type: AntiHero" + '\n' + super.toString2();
	}

	public void useLeaderAbility(ArrayList<Champion> targets) {
		Effect tmp = new Stun(2);
		int size = targets.size();

		for (int i = 0; i < size; i++) {
			tmp.apply(targets.get(i));
			targets.get(i).getAppliedEffects().add(tmp);
		}

	}
}
