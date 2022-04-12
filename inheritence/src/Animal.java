class bird{
	void eat() {
		System.out.println("eating");
	}
}
class hen extends bird{
	void chirp() {
		System.out.println("chirpping");
	}
	
}

public class Animal  extends hen{
	public static void main(String[] arg) {
		Animal a=new Animal();
		a.eat();
		a.chirp();
		
		}

	
	}
		
		
		
	
	
	