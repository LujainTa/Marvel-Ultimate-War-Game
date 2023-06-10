package model.abilities;

import java.util.ArrayList;

import model.effects.Effect;
import model.world.Champion;
import model.world.Damageable;

public class CrowdControlAbility extends Ability {

	private Effect effect;

	public CrowdControlAbility(String name, int cost, int baseCoolDown, int castRange, AreaOfEffect area, int required,
			Effect effect) {
		super(name, cost, baseCoolDown, castRange, area, required);
		this.effect = effect;
	}

	public String toString() {
		return super.toString() + this.getEffect().toString() + '\n';
	}

	public String toString2() {
		return "Ability Type: Crowd Control Ability" + '\n' + this.getEffect().toString() + super.toString2();
	}

	public Effect getEffect() {
		return effect;
	}

	public void execute(ArrayList<Damageable> targets) throws CloneNotSupportedException {
		int size = targets.size();
		Effect tmp = (Effect) effect.clone();

		for (int i = 0; i < size; i++) {
			if (targets.get(i) instanceof Champion) {
				tmp.apply((Champion) targets.get(i));
				((Champion) targets.get(i)).getAppliedEffects().add(tmp);
			}
		}
	}
}
