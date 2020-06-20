package udemy.dsguy.algorithms.sorting;

public class QuickSort {

	//Quick sort is a divide and conquer algorithm
	//At each step it finds "Pivot" and then makes sure that all the smaller elements are left of "Pivot" and all the bigger elements are right of "Pivot"
	//It does this recursively until the entire array is sorted
	//Unlike merge sort, it does not require an extra space.


	public static void quickSort(int[] array, int start, int end)
	{
		if (start < end)
		{
			int pivot = partition(array, start, end);
			quickSort(array, start, pivot-1 );
			quickSort(array, pivot + 1,end);
		}
	}//end of method

	
	public static int partition(int[] array, int p, int q)
	{
		System.out.println("");
		printArray(array);
		System.out.println("");
		int pivot = q;
		int i = p-1;
		for (int j = p; j <= q; j++)
		{
			System.out.println("array[j] is " + array[j] + " while array[pivot] is " + array[pivot]);
			if (array[j] <= array[pivot])
			{
				i++;
				int temp = array[i];
				array[i] = array[j];
				array[j] = temp;
			}
		}
		printArray(array);
		System.out.println("");
		return i;
	}//end of method
	
	
	public static void printArray(int []array)
	{
		for (int i = 0; i < array.length; i++)
		{
			System.out.print(array[i]+"  ");
		}
	}//end of method
	
}//end of class
