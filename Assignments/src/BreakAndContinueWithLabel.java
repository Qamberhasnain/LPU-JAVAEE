
// Assignment: 1. Explore labels with break and continue in Java and write a program for the same

public class BreakAndContinueWithLabel {

	public static void main(String[] args) {
		System.out.println("Label1 has break statement to break loop when i equal to 5");
		Label1:
		      for(int i=0; i<10; i++){
		         if (i==5){
		        	 System.out.println();
		            break Label1;
		          }
		          System.out.println("Cab number: "+i );
		      }
		System.out.println("Label2 has continue statement to skip next line when i equal to 5");
		Label2:
		      for(int i=0; i<10; i++){
		         if (i==5){
		        	 System.out.println();
		            continue Label2;
		          }
		          System.out.println("Cab number: "+i );
		      }
	}

}
