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
		char square = ' ';
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Chess board before placing queens.\n");
		
		for(int i=0;i<8;i++) {
			for(int j=0;j<8;j++) {
				if(i%2==0) {
					square = ( (j+1) % 2 == 0 )? blackSquare : whiteSquare;
					System.out.print(square+" ");
				}else {
					square = (j % 2) == 0 ? blackSquare : whiteSquare;
					System.out.print(square+" ");
				}
				
			}
			System.out.println();
		}
		
		int count = 0;
		
		while(count < 4) {
			int queen_no = count +1; 
			System.out.println("enter row "+ queen_no + ": ");
			int row = sc.nextInt();
			System.out.println("enter column "+queen_no+": ");
			int col = sc.nextInt();
			for(int i=0;i<8;i++) {
				for(int j=0;j<8;j++) {
					if(i%2==0) {
						if(i == row && j == col){
							square = queen;
						}
						else{
						square = ( (j+1) % 2 == 0 )? blackSquare : whiteSquare;
						}
						System.out.print(square+" ");
					}else {
						if(i == row && j == col){
							square = queen;
						}
						else{
						square = (j % 2) == 0 ? blackSquare : whiteSquare;
						}
						System.out.print(square+" ");
					}
					
				}
				System.out.println();
			}
			
			count++;
		}

	}

}