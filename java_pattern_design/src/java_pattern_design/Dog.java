package java_pattern_design;

public class Dog extends Animal{
	public void digHole(){
		System.out.println("Dug a hole");
	}
	
	public Dog(){
		super();
		
		setSound("Bark");
	}
	
	public void changeVar(int randNum){
		
		randNum = 12;
		
		System.out.println("randNum in the method: " + randNum);
	}
	
	private void bePrivate(){
		System.out.println("just a private method");

	}
	
	public void accessPrivate(){
		bePrivate();
	}
}
