import java.util.*;

//Assignment: Place the n-queens on the chessboard by taking input form the User
		//eg: User says row -> 1 and col -> 1 as input -> replace it with queen
		//a total of 4 inputs can be taken to place 4 queens in the chessboard
		//no queen can be placed in the same row again or same column again :)
		//Hint: use a do, while loop and make sure not to take more than 4 queens positions

public class NqueenChessBoard {

	public static void main(String[] args) {
		
		char blackSquare = '\u25A1';	// 1
		char whiteSquare = '\u25A0';	// 0
		char queen = '\u2655';
		
		Scanner sc = new Scanner(System.in);
		
		int count = 0;
		
		while(count < 4) {
			
			for(int i=0;i<8;i++) {
				System.out.println("enter row "+ (count+1) + ": ");
				int row = sc.nextInt();
				System.out.println("enter column "+ (count+1) +": ");
				int col = sc.nextInt();
				
				for(int j=0;j<8;j++) {
					
					if(i%2==0) {
						if(row == i && col == j) 
							System.out.print(queen+" ");
						else {
							char square = ( (j+1) % 2 == 0 )? blackSquare : whiteSquare;
							System.out.print(square+" ");
							}
						}
					else {
						if(row == i && col == j) 
							System.out.print(queen+" ");
						else {
						char square = (j % 2) == 0 ? blackSquare : whiteSquare;
						System.out.print(square+" ");
						}
					}
				}
				System.out.println();
			}
			count++;
		}

	}

}