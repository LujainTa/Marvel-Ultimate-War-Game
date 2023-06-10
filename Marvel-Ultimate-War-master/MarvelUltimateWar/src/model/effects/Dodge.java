package model.effects;

import model.world.Champion;

public class Dodge extends Effect {

	public Dodge(int duration) {
		super("Dodge", duration, EffectType.BUFF);
	}

	public void apply(Champion c) {
		int speed = (int) (c.getSpeed() * 1.05);
		c.setSpeed(speed);
	}

	public void remove(Champion c) {
		int speed = (int) (c.getSpeed() / 1.05);
		c.setSpeed(speed);
	}
}
