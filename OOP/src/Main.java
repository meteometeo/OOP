import java.util.Scanner; 

public class Main {
	
	public static void main(String[] args) {
		Pen p = new Pen();
		
		System.out.println("The color is: " + p.color);
		System.out.println("The pen type is: " + p.type);
		System.out.println("The pen point is: " + p.point);
		
		while(true) {
			if (p.clicked) {
				Scanner scanner = new Scanner(System.in);
			    System.out.print("Do you want to unclick the pen? if yes type 'y' > ");
			    String input = scanner.nextLine().toLowerCase();
			    
			if (input.equals("y")) {
				p.unclick();
			} else {
				
			}
			
			if (p.clicked) {
				System.out.println("The pen is clicked");
			} else {
				System.out.println("The pen isn't clicked");
			}   
			
			}
			
			if (p.clicked == false) {
				Scanner scanner = new Scanner(System.in);
			    System.out.print("Do you want to click the pen? if yes type 'y' > ");
			    String input = scanner.nextLine().toLowerCase();
			    
			if (input.equals("y")) {
				p.click();
			} else {
				
			}
			
			if (p.clicked) {
				System.out.println("The pen is clicked");
			} else {
				System.out.println("The pen isn't clicked");
			}
		    
			}
		}
		
		

	}
}
