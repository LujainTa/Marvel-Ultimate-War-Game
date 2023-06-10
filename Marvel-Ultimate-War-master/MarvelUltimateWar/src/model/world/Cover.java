package model.world;

import java.awt.*;
import java.util.Random;

public class Cover implements Damageable {
	private int currentHP;
	private Point location;

	public Cover(int x, int y) {
		this.location = new Point(x, y);
		this.currentHP = (int) (Math.random() * (1000 - 100)) + 100;
	}

	public int getCurrentHP() {
		return this.currentHP;
	}

	public void setCurrentHP(int currentHP) {
		this.currentHP = currentHP;
		if (currentHP < 0)
			this.currentHP = 0;
	}

	public Point getLocation() {
		return this.location;
	}
}
