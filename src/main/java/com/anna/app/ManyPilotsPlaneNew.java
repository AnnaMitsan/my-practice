package com.anna.app;

import java.util.Map;

public class ManyPilotsPlaneNew implements Airplane {

	public ManyPilotsPlaneNew() {
	}

	public void fly() {
		for (String key : bomberPilots.keySet()) {
			System.out.print(key + ": ");
			System.out.println();
			BomberPilot bomberPilot = bomberPilots.get(key);
			bomberPilot.bombing();
		}
	}

	private Map<String, BomberPilot> bomberPilots;

	public void setBomberPilots(Map<String, BomberPilot> bomberPilots) {
		this.bomberPilots = bomberPilots;
	}

}
