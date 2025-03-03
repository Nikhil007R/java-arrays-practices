import java.util.Scanner;

class CanVote{
	
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
	
		int arr[] = new int[10];
		
		for(int i=0; i<10; i++){
			System.out.println("Enter age of " + i + "th student: ");
			int age = sc.nextInt();
			arr[i] = age;
			if(age >= 18){
				System.out.println("The student with the age " + age + " can vote. ");
			}else{
				System.out.println("The student with the age "+ age +" cannot vote. ");
			}
		}
	}

}
