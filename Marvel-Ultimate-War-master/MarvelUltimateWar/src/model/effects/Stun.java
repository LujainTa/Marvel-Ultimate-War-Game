package model.effects;

import model.world.Champion;
import model.world.Condition;

public class Stun extends Effect {

	public Stun(int duration) {
		super("Stun", duration, EffectType.DEBUFF);
	}

	public void apply(Champion c) {
		c.setCondition(Condition.INACTIVE);
	}

	public void remove(Champion c) {
		int size = c.getAppliedEffects().size();

		for (int i = 0; i < size; i++) {
			if (c.getAppliedEffects().get(i) instanceof Stun)
				return;
			if (c.getAppliedEffects().get(i) instanceof Root) {
				c.setCondition(Condition.ROOTED);
				return;
			}
		}

		c.setCondition(Condition.ACTIVE);
	}
}
