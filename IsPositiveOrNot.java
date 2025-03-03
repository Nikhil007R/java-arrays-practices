import java.util.*;

class IsPositiveOrNot{

	public static void main(String args[]){
		int arr[] = new int[5];
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Numbers: ");
		for(int i=0; i<arr.length; i++){
			arr[i] = sc.nextInt();
		}

		for(int i=0; i<arr.length; i++){
			if(arr[i] > 0){
				if(arr[i] % 2 == 0){
					System.out.println("The number " + arr[i] + " is an even number");
				}else{
					System.out.println("The number " + arr[i] + " is an odd number");
				}
			}
			else if(arr[i] < 0){
				System.out.println("The number " + arr[i] + " is a negative number");
			}
			else{
				System.out.println("The number is Zero.");
			}
		}

	}
}
