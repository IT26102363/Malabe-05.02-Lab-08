import java.util.Scanner;
public class IT26102363Lab8Q3 {

    public static void main(String[] args) {
		
		int array [] = new int[6];
		int num;
		int max;
		
		Scanner input = new Scanner(System.in);
		
		max=0;
		
        for(int i=0; i<6; i++){
			System.out.print("Enter a Positive number (" + (i+1) + "/6): ");
			array[i] = input.nextInt();
			
		
			if(array[i]<=0){
				System.out.println("Please Enter only Positive numbers");
				i--;
				continue;
			}
			
				if(max<array[i]){
					max=array[i];
				}
			
		}
		System.out.println();
		System.out.print("Array Content:");
		System.out.println();
		for(int a=0; a<6; a++){
			System.out.print(array[a] + " ");
		}
		System.out.println();
		System.out.print("The Maximum Number Entered: " + max);
	}		
}