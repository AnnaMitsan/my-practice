package com.anna.app;

public class Bomber implements Airplane {
	public Bomber() {
	}

	public void fly() {
		System.out.println("Catch " + bombs + " bombs!!!");
		bomberPilot.bombing();
	}

	private int bombs;

	public int getBombs() {
		return bombs;
	}

	public void setBombs(int bombs) {
		this.bombs = bombs;
	}

	private BomberPilot bomberPilot;

	public void setBomberPilot(BomberPilot bomberPilot) {
		this.bomberPilot = bomberPilot;
	}
}
