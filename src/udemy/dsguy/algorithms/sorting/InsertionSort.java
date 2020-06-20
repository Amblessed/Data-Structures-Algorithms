package udemy.dsguy.algorithms.sorting;

public class InsertionSort {

	//In Insertion sort algorithm we divide the given array into 2 parts: Sorted and Unsorted.
	//Then from the unsorted we pick the first element and find its correct position in sorted array.
	//Repeat till unsorted array is not empty

	public static void insertionSort(int [] A)
	{
		 for(int  i = 1 ; i<A.length;i++)
		 {
			 int  tmp=A[i], j=i;
		     while ( j>0 && A[j-1]>tmp )
		     {
		        A[j]=A[j-1];
		        j--;
		     }
		     A[j] = tmp;
		 }//end of for loop
	}//end of method
	
	
	public static void printArray(int []array)
	{
		for (int i = 0; i < array.length; i++)
		{
			System.out.print(array[i]+"  ");
		}
	}//end of method

}//end of class