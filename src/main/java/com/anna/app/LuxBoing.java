package com.anna.app;

public class LuxBoing extends Boing {
	private SuperPilot sp;

	public LuxBoing(SuperPilot sp) {
		super();
		this.sp = sp;
	}

public LuxBoing(int passengers, SuperPilot sp){
super(passengers);
this.sp = sp;
}
public void fly(){
	super.fly();
	System.out.println("Lux Boing flying ... ");
	sp.work();
}

}
