package oopConcepts;

public class Nestedforloop {

	public static void main(String[] args) {
   
		
		for(int i=1;i<=10;i++)
		{
			for(int j=1;j<=10;j++)
			{ if(i==5||j==1||i==2&j==2||i==3&j==2||i==3&j==3||i==4&j==2||i==4&j==3||i==4&j==4){
				System.out.print("*");
			}else {
				System.out.print(".");
					
			}}
			System.out.println();
		}
	
	
	
	}
	
}