import java.util.*;

class MaximumUptoTen{

        public static void main(String args[]){

                Scanner sc = new Scanner(System.in);
		
		// Declare and Assign Array 
		int  arr[] = new int[10];
		
		// declare a sum which will store summation value
		int sum = 0;

		int count = 0;
		
		// traversing ans storing values in array:
		while(count != 10){
			System.out.println("Enter a number: ");
			int num = sc.nextInt();
			if(num <= 0){
				break;
			}
			arr[count] = num;
			count++;
		}
		
		// traversing array and printing and updating sum
		for(int i=0; i<arr.length; i++){
			System.out.println(arr[i]);
			sum += arr[i];
		}
		System.out.println("Sum is " + sum);
        }
}
