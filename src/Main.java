import java.util.ArrayList;


public class Main {
	
	public static void main(String args[]) {
		
		System.out.println("Welcome to the application");
		
		ArrayList<Cat> cats = new ArrayList<Cat>();
		
		Cat didi = new Cat("Didi", -10);
		didi.color = "Tiger with White";
		didi.characteristic.add("Stupid");
		didi.characteristic.add("Lazy");
		didi.characteristic.add("饞嘴");
		didi.characteristic.add("Chicken");
		didi.characteristic.add("Big Mouth");
		cats.add(didi);
		
		Cat meimei = new Cat("MeiMei", 20);
		meimei.color = "Tiger with tiny bit of White";
		meimei.characteristic.add("Petite");
		meimei.characteristic.add("Scared");
		meimei.characteristic.add("Jumper");
		cats.add(meimei);
		
		for(Cat cat : cats) {
			System.out.println("!!!!!!!!!!!!!!!!!!");
			System.out.println("Welcome to the world, kitty. Your name is: " + cat.name);
			System.out.println("You have " + cat.legs + " legs.");
			if(cat.iq > 10) {
				System.out.println("You are not stupid");
			} else {
				System.out.println("You are very stupid");
			}
			System.out.println("You are in " + cat.color + " color.");
			for(int i = 0; i < cat.characteristic.size(); i++) {
				System.out.println("Your charactersitc #" + (i + 1) + ": " + cat.characteristic.get(i));
			}
			System.out.println("Have fun in this new world and live with us!!!!!!!");
		}
	}

}
