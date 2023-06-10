package model.effects;

import model.world.Champion;
import model.world.Condition;

public class Root extends Effect {

	public Root(int duration) {
		super("Root", duration, EffectType.DEBUFF);
	}

	public void apply(Champion c) {
		if (c.getCondition() == Condition.INACTIVE)
			return;
		c.setCondition(Condition.ROOTED);
	}

	public void remove(Champion c) {
		if (c.getCondition() == Condition.INACTIVE)
			return;

		int size = c.getAppliedEffects().size();

		for (int i = 0; i < size; i++) {
			if (c.getAppliedEffects().get(i) instanceof Root)
				return;
			if (c.getAppliedEffects().get(i) instanceof Stun) {
				c.setCondition(Condition.INACTIVE);
				return;
			}
		}

		c.setCondition(Condition.ACTIVE);
	}
}
