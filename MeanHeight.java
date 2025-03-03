import java.util.*;

class MeanHeight{

        public static void main(String args[]){

                Scanner sc = new Scanner(System.in);
		
		// declaring array of 11 size 
		int arr[] = new int[11];
		int mean = 0;
		
		// storing values in array: 
		System.out.println("Enter height of players in cm");
		for(int i=0; i<11; i++){
			arr[i] = sc.nextInt();
			mean += arr[i];
		}
		System.out.println("The mean height of present football team is " + mean/11);

        }
}
