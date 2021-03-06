
		// Assignment: 1. Rotate the Image to Right -> 90 degrees
	 	//			   2. Rotate the Image to Left  -> 180 degrees
	 	//			   3. GrayScale the image
	 	//					for a pixel sum up all values and divide by 3
	 	//				    eg: for pixel1 -> 12+45+78/3 -> 45
	 	//					pixel1 = {45, 45, 45}
	 	//					do it for all pixels on the image
	 	// 			   Hint: Use For Loops :)
public class ImageRotate {

	public static void main(String[] args) {
		int[] pixel1 = {12, 45, 78};
	 	int[] pixel2 = {34, 12, 90};
	 	int[] pixel3 = {0, 234, 56};
	 	
	 	int[] pixel4 = {13, 46, 79};
	 	int[] pixel5 = {22, 35, 68};
	 	int[] pixel6 = {2, 55, 88};
	 	
	 	int[] pixel7 = {42, 95, 68};
	 	int[] pixel8 = {52, 55, 98};
	 	int[] pixel9 = {22, 85, 48};
	 	
	 	// Representation of an Image
	 	int[][][] image = {
	 						{pixel1, pixel2, pixel3},
	 						{pixel4, pixel5, pixel6},
	 						{pixel7, pixel8, pixel9},
	 					};
	 	/*
	 	[I@15db9742 [I@6d06d69c [I@7852e922 
		[I@4e25154f [I@70dea4e [I@5c647e05 
		[I@33909752 [I@55f96302 [I@3d4eac69

	 	int[][] newarr = {
	 			{12, 45, 78},
	 			{34, 12, 90},
	 			{0, 234, 56}
	 	};
	 	for(int i=0;i<3;i++) {
	 		for(int j=0;j<3;j++){
	 			System.out.print(newarr[i][j]+" ");
	 		}
	 		System.out.println();
	 	}
	 	System.out.println();

	 	for(int i=0;i<3;i++) {
	 		for(int j=2;j>=0;j--){
	 			System.out.print(newarr[j][i]+" ");
	 		}
	 		System.out.println();
	 	}
	 	System.out.println();*/
	 	System.out.println("Before rotating right.");
	 	for(int i=0;i<3;i++) {
	 		for(int j=0;j<3;j++){
	 			System.out.print(image[i][j]+" ");
	 		}
	 		System.out.println();
	 	}
	 	System.out.println();
	 	System.out.println("After rotating 90 degree right.");
	 	for(int i=0;i<3;i++) {
	 		for(int j=2;j>=0;j--){
	 			System.out.print(image[j][i]+" ");
	 		}
	 		System.out.println();
	 	}
	 	System.out.println();
	 	System.out.println("Before rotating right.");
	 	for(int i=0;i<3;i++) {
	 		for(int j=0;j<3;j++){
	 			for(int k=0;k<3;k++){
	 				System.out.print(image[i][j][k]+" ");
	 			}
	 			System.out.println();
	 		}
	 	}
	 	System.out.println();
	 	System.out.println("After rotating 90 degree right.");
	 	for(int i=0;i<3;i++) {
	 		for(int j=2;j>=0;j--){
	 			for(int k=2;k>=0;k--){
	 				System.out.print(image[j][k][i]+" ");
	 			}
	 		}
 			System.out.println();

	 	}
	 	System.out.println();
	 	System.out.println("After rotating 180 degree left.");
	 	for(int i=2;i>=0;i--) {
	 		for(int j=0;j<3;j++){
	 			for(int k=0;k<3;k++){
	 				System.out.print(image[j][k][i]+" ");
	 			}
	 		}
 			System.out.println();

	 	}
	 	System.out.println();
	 	System.out.println("Grey scal.");
	 	for(int i=0;i<3;i++) {
	 		for(int j=0;j<3;j++){
	 			int sum = 0;
	 			for(int x=0;x<3;x++){
	 				sum = sum + image[i][j][x];
	 			}
	 			for(int k=0;k<3;k++){
	 				image[i][j][k] = sum/3;
	 				System.out.print(image[i][j][k]+" ");
	 			}
	 			System.out.println();
	 		}
	 	}
	}

}
