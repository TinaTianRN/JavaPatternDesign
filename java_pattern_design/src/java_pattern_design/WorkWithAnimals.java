package java_pattern_design;

public class WorkWithAnimals {
	
	int justANum = 10;

	public static void main(String[] args) {
		Dog fido = new Dog();
		
		fido.setName("Fido");
		System.out.println(fido.getName());
		
		fido.digHole();
		
		fido.setWeight(-1);
		
		int randNum = 10;
		
		fido.changeVar(randNum);
		
		System.out.println("randNum after method call:" + randNum);
		
		changeObjectName(fido);
		System.out.println("dog name after method call:" + fido.getName());
		
		
		Animal doggy = new Dog();
		Animal kitty = new Cat();
		
		System.out.println("doggy says:" + doggy.getSound());
		System.out.println("kitty says:" + kitty.getSound());
		
		Animal[] animal = new Animal[4];
		animal[0] = doggy;
		animal[1] = kitty;
		
		System.out.println("doggy says:" + animal[0].getSound());
		System.out.println("kitty says:" + animal[1].getSound());
		
		speakAnimal(doggy);
		
		// digHole is not the type of Animal 
		// doggy.digHole();
		// doggy cast to a Dog object
		((Dog)doggy).digHole();
		
		// main is a static method, you cannot use a static variable or function in static method
		// System.out.println(justANum);
		// sayHello();
		
		// cannot call private method even created in a subclass
		// fido.bePrivate();
		fido.accessPrivate();
		

	}
	
	// static can be called without instance
	public static void changeObjectName(Dog fido){
		fido.setName("Mercus");
	}
	
	public static void speakAnimal(Animal randAnimal){
		System.out.println("Animal says:" + randAnimal.getSound());		
	}
	
	public void sayHello(){
		System.out.println("hello");

	}

}
