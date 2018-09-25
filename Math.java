import java.util.Scanner;
public class Math {

	public static void main(String[] args) {
			int firstnum;
			int secondnum;
			Scanner first = new Scanner(System.in);
			Scanner second = new Scanner(System.in);
			
			System.out.println("Write the first number:");
			firstnum = first.nextInt();
			
			System.out.println("Write the second number:");
			secondnum = second.nextInt();
			
			int result = firstnum+secondnum;
			
			System.out.println("The result of the sum is: " + result);
			
			result = firstnum-secondnum;
			
			System.out.println("The result of the rest is: " + result);
			
			result = firstnum*secondnum;
			
			System.out.println("The result of the multiplication is: " + result);
			
			result = firstnum/secondnum;
			
			System.out.println("The result of the division is: " + result);
			

	}

}
