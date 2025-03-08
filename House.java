class House{
	private ArrayList<Furniture> furnitureList;

	public House(){
		furnitureList = new ArrayList<>();
	}

	public void displayFurniture(){
		for (Furniture f : furnitureList){
			f.Function();
			f.Location();
			System.out.println();
		}
	}
}
