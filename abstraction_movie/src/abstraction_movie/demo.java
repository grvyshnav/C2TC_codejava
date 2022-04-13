package abstraction_movie;

import java.util.Scanner;

abstract class movie{
	String title;
	abstract void setTitle(String s);
}
class myMovie extends movie{
	void setTitle(String s) {
		title=s;
		
	}
	String getTitle() {
		return title;
	}
}

public class demo {
	public static void main(String arg[]){
			Scanner s =new Scanner(System.in);
			String title=s.nextLine();
			myMovie m=new myMovie();
			m.setTitle(title);
			System.out.println("the title is : " +m.getTitle());
			
	}
}
