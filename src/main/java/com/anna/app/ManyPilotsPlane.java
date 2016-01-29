package com.anna.app;

import java.util.Collection;

public class ManyPilotsPlane implements Airplane {

	public ManyPilotsPlane() {
	}

	public void fly() {
System.out.println("I have many pilots!!");
for(BomberPilot pilot:bomberPilots){
	pilot.bombing();
}
	}

	private Collection<BomberPilot> bomberPilots;
	public void setBomberPilots(Collection<BomberPilot> pilots){
		this.bomberPilots=pilots;
	}
}
