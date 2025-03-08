class NorthPole extends Block{
	private double iceThickness;
	private boolean isDaytime;

	public NorthPole(int t, int w, String s, double iceThickness, boolean isDaytime){
		super(t, w, s);
		this.iceThickness = iceThickness;
		this.isDaytime = isDaytime;
	}

	public double meltdown(double incTemp, int sunlightHours){
		return iceThickness -= incTemp * sunlightHours / 24;
	}

	public double freezeGround(double dropTemp){
		return iceThickness -= dropTemp / 2;
	}

	public void updateDescription(String s){
		super.updateDescription(s);
		System.out.println("North Pole's description is updated: " + s);
	}
}
