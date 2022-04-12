package inheritence2;
class animal{
	void eat(){
		System.out.println("eating");
	}
}
class dog extends animal {
	void bark() {
		System.out.println("barking");
	}
	
}
class cat extends animal{
	void meow() {
		System.out.print("mewing");
	}
}

public class undu{
	public static void main(String arg[]) {
		
	cat c=new cat()	;
	c.meow();
	c.eat();
		
		
	}
}






