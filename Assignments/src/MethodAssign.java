		// Assignment: 1. Sort the same arrays using the algos: 
		//					1.1 Bubble Sort
		//					1.2 Insertion Sort
public class MethodAssign {
	
	void printArray(int[] array) { 
		
		for(int element : array) {
			System.out.print(element+" ");
		}
	}
	void insertionSort(int[] arr){
		int n = arr.length;
		for(int i=1;i<n;++i){
			int key = arr[i];
			int j = i-1;
			while(j>=0 && arr[j]>key){
				arr[j+1] = arr[j];
				j -= 1;
			}
			arr[j+1]=key;
		}
	}
	void bubbleSort(int[] arr){
		int n = arr.length;
		for(int i=0;i<n-1;i++){
			for(int j=0;j<n-i-1;j++){
				if(arr[j]>arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		
		int[] productPrices = {1200, 4500, 3200, 4300, 1500};
		int[] covidCases = {512433, 734667, 346762, 989823, 877873, 97632, 142331};
		int[] scores = {70, 88, 12, 34, 56, 80, 90, 95, 34, 35, 16};

		
		MethodAssign ob = new MethodAssign();
		System.out.println("*****Arrays sorted by Bubble Sort Algorithm****");
		System.out.println("Orignal array: ");
		ob.printArray(productPrices);
		System.out.println("\nSorted array: ");
		ob.bubbleSort(productPrices);
		ob.printArray(productPrices);
		System.out.println("\nOrignal array: ");
		ob.printArray(covidCases);
		System.out.println("\nSorted array: ");
		ob.bubbleSort(covidCases);
		ob.printArray(covidCases);
		System.out.println("\nOrignal array: ");
		ob.printArray(scores);
		System.out.println("\nSorted array: ");
		ob.bubbleSort(scores);
		ob.printArray(scores);
		System.out.println("\n************End**************");
		System.out.println();
		int[] wheatproductPrices = {1200, 4500, 3200, 4300, 1500};
		int[] indiacovidCases = {512433, 734667, 346762, 989823, 877873, 97632, 142331};
		int[] ausscores = {70, 88, 12, 34, 56, 80, 90, 95, 34, 35, 16};
		System.out.println("*****Arrays sorted by Bubble Sort Algorithm****");
		System.out.println("Orignal array: ");
		ob.printArray(wheatproductPrices);
		System.out.println("\nSorted array: ");
		ob.insertionSort(wheatproductPrices);
		ob.printArray(wheatproductPrices);
		System.out.println("\nOrignal array: ");
		ob.printArray(indiacovidCases);
		System.out.println("\nSorted array: ");
		ob.insertionSort(indiacovidCases);
		ob.printArray(indiacovidCases);
		System.out.println("\nOrignal array: ");
		ob.printArray(ausscores);
		System.out.println("\nSorted array: ");
		ob.insertionSort(ausscores);
		ob.printArray(ausscores);
		System.out.println("\n************End**************");
	}

}
