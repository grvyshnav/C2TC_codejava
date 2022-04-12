
public class Employee {
	int salary;
	String name;
	Employee(int salary,String name){
		this.salary=salary;
		this.name=name;
	}
		 void display(){
			System.out.println(+salary+name);
			
		
	}

	public static void main(String[] args) {
		
		Employee obj1=new Employee(12345,"ram");
		Employee obj2=new Employee(1345,"umer");
		obj1.display();
		obj2.display();
		

	

	
}
}
