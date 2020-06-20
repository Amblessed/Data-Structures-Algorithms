package udemy.dsguy.algorithms.sorting;

public class HeapSort {
	//Heap Sort works by first organizing the data to be sorted into a special type of binary tree called a heap.
	//It then removes the topmost item(largest/smallest) and inserts it in current array. It keeps doing until the binary heap is not empty

	int[] arr = null;
	
	//Constructor
	public HeapSort(int[] arr) {
		this.arr = arr;
	}//end of method
	

	public void sort()
	{
		HeapArray hba = new HeapArray(arr.length); //We will reuse HeapByArray class to do sorting
		for(int i=0; i<arr.length;i++)
		{ //Insert in Heap
			hba.insertInHeap(arr[i]);
		}
		for(int i=0; i<arr.length;i++)
		{ //Extract from Heap and insert sorted data in current Array
			arr[i] = hba.extractHeadOfHeap();
		}
	}//end of method
	
	
	public void printArray() {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+"  ");
		}
	}//end of method

}//end of class