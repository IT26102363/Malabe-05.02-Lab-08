import java.util.Scanner;
public class IT26102363Lab8Q4 {

    public static void main(String[] args) {
		
		int array [] = new int[8];
		int num;
		int studentid;
		
		Scanner input = new Scanner(System.in);
		
		
        for(int i=0; i<8; i++){
			System.out.print("Enter a Positive number (" + (i+1) + "/8): ");
			array[i] = input.nextInt();
			
		
			if(array[i]<=0){
				System.out.println("Please Enter only Positive numbers");
				i--;
				continue;
			}
			
			
		}
		System.out.println();
		System.out.print("Enter a Student ID to Search: ");
		studentid=input.nextInt();
		
		for(int i=0; i<array.length; i++){
			if(array[i]==studentid){
				System.out.println("Student ID is Available");
			}
		}
	}		
}
