package model.effects;

import model.world.Champion;

public abstract class Effect implements Cloneable {
	private String name;
	private int duration;
	private EffectType type;

	public Effect(String name, int duration, EffectType type) {
		this.name = name;
		this.duration = duration;
		this.type = type;
	}

	public String toString() {
		return "Effect Type: " + this.getType() + '\n' + "Effect Name: " + this.getName() + '\n' + "Effect Duration: " + this.getDuration()
				+ '\n';
	}

	public String getName() {
		return this.name;
	}

	public int getDuration() {
		return this.duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public EffectType getType() {
		return this.type;
	}

	public abstract void apply(Champion c);

	public abstract void remove(Champion c);

	public Object clone() throws CloneNotSupportedException {
		Effect effect = (Effect) super.clone();
		effect.name = this.getName();
		effect.duration = this.getDuration();
		effect.type = this.getType();
		return effect;
	}
}