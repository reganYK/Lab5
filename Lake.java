class Lake extends Block{
	private int depth;
	private int currentSpeed;

	public Lake(int t, int w, String s, int depth, int currentSpeed){
		super(t, w, s);
		this.depth = depth;
		this.currentSpeed = currentSpeed;
	}

	public int addDepth(int rainFlowRate){
		return depth += rainFlowRate;
	}

	public int evaporate(int sunlightHours){
		return depth -= sunlightHours;
	}

	public void updateDescription(String s){
		super.updateDescription(s);
		System.out.println("Lake's description is updated: " + s);
	}
}
