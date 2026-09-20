import java.util.Scanner;

public class IT26102363Lab8Q1 {
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		int myarray[] = new int[5];
		
		for(int i=0; i<myarray.length; i++){
			System.out.print("Enter Number " + (i+1) + ":");
			myarray[i]=input.nextInt();
			
		}
		System.out.println("Array in Reverse Order:");
		
		for(int a=myarray.length - 1; a>=0; a--){
			System.out.print(myarray[a] + " ");
			
		}
	}
}