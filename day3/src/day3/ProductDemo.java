package day3;
import java.util.*;

public class ProductDemo {

	public static void main(String[] args) {
		Product p1 = new Product();
		//Product p2 = new Product(100,"mouse",500.2f);
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the details: ");
		int id =s.nextInt();
		s.nextLine();
		String name = s.nextLine();
		float pri = s.nextFloat();
		
		Product p3 = new Product(id,name,pri);
		
		
		
		System.out.println(p1);
		//System.out.println(p2);
		System.out.println(p3);

	}

}
