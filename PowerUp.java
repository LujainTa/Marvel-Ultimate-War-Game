package model.effects;

import model.abilities.DamagingAbility;
import model.abilities.HealingAbility;
import model.world.Champion;

public class PowerUp extends Effect {

	public PowerUp(int duration) {
		super("PowerUp", duration, EffectType.BUFF);
	}

	public void apply(Champion c) {
		int size = c.getAbilities().size();

		for (int i = 0; i < size; i++) {
			if (c.getAbilities().get(i) instanceof DamagingAbility) {
				DamagingAbility x = (DamagingAbility) c.getAbilities().get(i);
				int newDamageAmount = (int) (x.getDamageAmount() * 1.2);
				x.setDamageAmount(newDamageAmount);
			}
			if (c.getAbilities().get(i) instanceof HealingAbility) {
				HealingAbility x = (HealingAbility) c.getAbilities().get(i);
				int newHealAmount = (int) (x.getHealAmount() * 1.2);
				x.setHealAmount(newHealAmount);
			}
		}
	}

	public void remove(Champion c) {
		int size = c.getAbilities().size();

		for (int i = 0; i < size; i++) {
			if (c.getAbilities().get(i) instanceof DamagingAbility) {
				DamagingAbility x = (DamagingAbility) c.getAbilities().get(i);
				int newDamageAmount = (int) (x.getDamageAmount() / 1.2);
				x.setDamageAmount(newDamageAmount);
			}
			if (c.getAbilities().get(i) instanceof HealingAbility) {
				HealingAbility x = (HealingAbility) c.getAbilities().get(i);
				int newHealAmount = (int) (x.getHealAmount() / 1.2);
				x.setHealAmount(newHealAmount);
			}
		}
	}
}
