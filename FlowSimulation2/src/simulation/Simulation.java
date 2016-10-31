package simulation;


import sim.engine.*;
import gui.Display;

public class Simulation extends SimState{
	
	/**
	 * 
	 */
	private Display applet;
	private static final long serialVersionUID = 4286614024580166374L;

	public Simulation(long seed, Display applet){
		super(seed);
		this.applet = applet;
	}
	
	public void start(){
		
	}
}
