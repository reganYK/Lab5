class ActiveVolcano extends Block{
	private String eruptionState;
	private double lavaFlowRate;

	public ActiveVolcano(int t, int w, String s, String eruptionState, double lavaFlowRate){
		super(t, w, s);
		this.eruptionState = eruptionState;
		this.lavaFlowRate = lavaFlowRate;
	}

	public void erupt(){
		eruptionState = "Erupting";
		lavaFlowRate = 1000.0;
		System.out.println("The volcano has been erupted with a lava flow rate of " + lavaFlowRate);
	}

	public void coolDown(){
		eruptionState = "Dormant";
		lavaFlowRate = 0.0;
		System.out.println("The volcano has now cooled down");
	}

	public void affectingNearby(Block b){
		if (eruptionState.equals("Eruption"){
			System.out.println("The lava is affecting a nearby block!");
		} else {
			System.out.println("The volcano is dormant. No nearby blocks are effected.");
		}
	}

	public void updateDescription(String s){
		super.updateDescription(s);
		System.out.println("Volcano's description is updated: " + s);
	}
}
