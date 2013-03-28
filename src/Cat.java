import java.util.ArrayList;
import java.util.List;


public class Cat {
	
	public String name;
	public int legs;
	public int iq;
	public String color;
	public List<String> characteristic;
	
	public Cat(String name, int iq) {
		this.name = name;
		this.legs = 4;
		this.iq = iq;
		this.color = "White";
		this.characteristic = new ArrayList<String>();
	}
}
