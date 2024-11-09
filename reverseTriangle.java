import java.util.Scanner;
public class reverseTriangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter row and col");
		int row = sc.nextInt();
		int col = sc.nextInt();
		int count = col+2;
		
		for (int i = row; i >= 1; i--) {
			for (int j = 1; j<=i ; j++) 
				System.out.print(count);
			count--;
			System.out.println();
		}
	}

}