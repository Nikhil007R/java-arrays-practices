import java.util.Scanner;

class YoungestAndTallest{

	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		// declare two arrays of age and height
		int[] ages = new int[3];
		int[] height = new int[3];

		// taking user input for both of them
		System.out.println("Enter age (should be less than 100): ");
		for(int i=0; i<ages.length; i++){
			System.out.println("Enter age: ");
			ages[i] = sc.nextInt();
		}

		System.out.println("Enter height in cm: ");
		for(int i=0; i<height.length; i++){
			height[i] = sc.nextInt();
		}

		int tallest = 0;
		int youngest = 100;
		
		// Looping through array and finding tallest and youngest.
		for(int i=0; i<3; i++){
			if(ages[i] < youngest){
				youngest = ages[i];
			}
			if(height[i] > tallest){
				tallest = height[i];
			}
		}

		System.out.println("The Youngest is having age " + youngest + " yrs old and the Tallest is " + tallest + " cm in height");
 	}
}
