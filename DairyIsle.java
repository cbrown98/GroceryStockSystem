package dairy;
import java.util.Scanner;
public class DairyIsle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int a;
		
		int eggs = 10;
		int milk = 10;
		int cheese = 10;
		int icecream = 10;
		int creamcheese = 10;
		int yogurt= 10;
		int lactosfreemilk = 10;
		
		
		
		System.out.println("Hello welcome to the online market");
		
		
		
			System.out.println("0: Quit");
			System.out.println("1: Prints List of Items in Dairy Isle");
				
			a = scan.nextInt();
			
			if (a == 1) {
				System.out.println("Egg Cartons: " + eggs);
				System.out.println("Milk Jugs: " + milk); 
				System.out.println("Cheese Tubs: " + cheese); 
				System.out.println("Icecream Tubs: " + icecream);
				System.out.println("Cream Cheese Tubs: " + creamcheese);
				System.out.println("Yogurt Cups: " + yogurt);
				System.out.println("Lactos-Free Milk Jugs: " + lactosfreemilk);
	        } else if (a==0) {
	            System.exit(0);
	        }
			
		
		
	}

}
