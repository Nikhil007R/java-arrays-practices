import java.util.*;

class multiplicationTable{

        public static void main(String args[]){
		
		int arr[] = new int[10];
                Scanner sc = new Scanner(System.in);
			
		// take a number input
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		
		// traversing and storing answer in array 
		for(int i=1; i<=10; i++){
			arr[i] = num*i;
		}
		 
		for(int i=0; i<10; i++){
			System.out.println(num+" * "+i+1+" = " + arr[i]);
		}
        }
}

