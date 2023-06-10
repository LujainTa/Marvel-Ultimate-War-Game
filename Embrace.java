package model.effects;

import model.world.Champion;

public class Embrace extends Effect {

	public Embrace(int duration) {
		super("Embrace", duration, EffectType.BUFF);
	}

	public void apply(Champion c) {
		int newHP = (int) (c.getCurrentHP() + (c.getMaxHP() * 0.2));
		c.setCurrentHP(newHP);

		int newMana = (int) (c.getMana() * 1.2);
		c.setMana(newMana);

		int newSpeed = (int) (c.getSpeed() * 1.2);
		c.setSpeed(newSpeed);

		int newAttackDamage = (int) (c.getAttackDamage() * 1.2);
		c.setAttackDamage(newAttackDamage);
	}

	public void remove(Champion c) {
		int newSpeed = (int) (c.getSpeed() / 1.2);
		c.setSpeed(newSpeed);

		int newAttackDamage = (int) (c.getAttackDamage() / 1.2);
		c.setAttackDamage(newAttackDamage);
	}
}
