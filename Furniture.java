abstract class Furniture{
	String colour;

	abstract void Function();

	abstract void Location();
}

class Bed extends Furniture{
	void Function(){
		System.out.println("Bed is used to sleep on.");
	}
	void Location(){
		System.out.println("Bed is located in the bedroom.");
	}
}

class Couch extends Furniture{
	void Function(){
		System.out.println("Couch is used to relax on.");
	}
	void Location(){
		System.out.println("Couch is located in the living room.");
	}
}

class Table extends Furniture{
	void Function(){
		System.out.println("Table is used to gather family members around to eat a meal.");
	}
	void Location(){
		System.out.println("Table is located in the dining room.");
	}
}
