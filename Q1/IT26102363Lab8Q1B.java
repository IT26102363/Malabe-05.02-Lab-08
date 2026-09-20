import java.util.Scanner;

public class IT26102363Lab8Q1B {
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		int myarray[] = new int[5];
		
		for(int i=0; i<myarray.length; i++){
			System.out.print("Enter Number " + (i+1) + ":");
			myarray[i]=input.nextInt();
			
		}
		System.out.println("myArray Contents:");
		
		for(int a=myarray.length - 1; a>=0; a--){
			System.out.print(myarray[a] + " ");
			
		}
		System.out.println();
		System.out.println("EvenArray Contents:");
		for(int i=0; i<myarray.length; i++){
			double element=myarray[i];
			double even = element % 2;
			if(even==0){
				System.out.print(myarray[i] + " ");
			}
		}
	}
}