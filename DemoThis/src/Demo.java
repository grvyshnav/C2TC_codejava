
public class Demo {
	
	void m() {
		System.out.println(this);
	}
public static void main(String ar[]) {
	Demo obj=new Demo();
	Demo obj1=new Demo();
	obj.m();
}

}
