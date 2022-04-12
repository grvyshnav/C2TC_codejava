class animal{
	void eat() {
		System.out.println("eating");
		
	}
}

class dog extends animal{
	void bark() {
		System.out.println("barking");
		}
	}

public class demo3 {
	public static void main(String arg[]){
	dog d=new dog();
System .out .println(d instanceof animal );
	
	}
	
	
	

}
