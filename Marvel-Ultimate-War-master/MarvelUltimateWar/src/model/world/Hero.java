
package model.world;

import java.util.ArrayList;

import model.effects.Effect;
import model.effects.EffectType;
import model.effects.Embrace;

public class Hero extends Champion {

	public Hero(String name, int maxHP, int mana, int maxActions, int speed, int attackRange, int attackDamage) {
		super(name, maxHP, mana, maxActions, speed, attackRange, attackDamage);
	}

	public String toString2() {
		return "Type: Hero" + '\n' + super.toString2();
	}

	public void useLeaderAbility(ArrayList<Champion> targets) {
		Effect tmp = new Embrace(2);

		int size = targets.size();

		for (int i = 0; i < size; i++) {
			for (int j = targets.get(i).getAppliedEffects().size() - 1; j >= 0; j--) {
				if (targets.get(i).getAppliedEffects().get(j).getType() == EffectType.DEBUFF) {
					targets.get(i).getAppliedEffects().get(j).remove(targets.get(i));
					targets.get(i).getAppliedEffects().remove(j);
				}
			}
			tmp.apply(targets.get(i));
			targets.get(i).getAppliedEffects().add(tmp);
		}
	}
}
