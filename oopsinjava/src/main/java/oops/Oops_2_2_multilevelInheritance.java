package oops;

public class Oops_2_2_multilevelInheritance {
	
	// grandparent -> father extends grandparent -> child extends father
	// Child can inherit properties from parent and grandparent
	
	public static class Animal{
		String kindOfAnimal;
		int legsNumber;
		public void animalDetails() {
			System.out.println(kindOfAnimal+" has "+legsNumber+" legs");
		}
	}
	public static class Lion extends Animal{
		boolean hunted;
		String name;
		public void canHunt() {
			System.out.println(name+" can hunt "+hunted);
		}
	}
	public static class Cub extends Lion{
		int weight;
		String color;
		public void newBorn() {
			System.out.println("i am "+weight+" kgs");
		}
	}
	public static void main(String[] args) {
		Cub c = new Cub();
		// properties of own
		c.weight=5;
		c.color="yellow";
		c.newBorn();
		// properties of parent
		c.hunted=false;
		c.name="Tiger cub";
		c.canHunt();
		// properties of grand parent
		c.legsNumber = 4;
		c.kindOfAnimal="Lion";
		c.animalDetails();
	}

}
