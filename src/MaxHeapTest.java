/**
 * @author Brendan O'Dowd
 * @version 9/11/2018
 * 
 * 
 * Class to test the method of MaxHeap.java by creating MaxHeap objects and calling various methods
 */

import java.util.Arrays;

public class MaxHeapTest {

	public static void main(String[] args) {

		int[] array1 = { 60, 25, 1, 22, 3, 24, 1, 44, 13, 15, 55, 40, 6 };
		MaxHeap heap1 = new MaxHeap(array1);

		System.out.println("The orignal array is: " + Arrays.toString(array1));
		System.out.print("Print Max Heap: ");
		heap1.printMaxHeap();
		heap1.heapsort();
		System.out.print("The sorted array is: ");
		heap1.printMaxHeap();
		System.out.println();

		int[] array2 = { 33, 25, 66, 6, 12, 2, 22, 14, 5, 88, 74 };
		MaxHeap heap2 = new MaxHeap(array2);

		System.out.println("The orignal array is: " + Arrays.toString(array2));
		System.out.print("Print Max Heap: ");
		heap2.printMaxHeap();
		heap2.heapsort();
		System.out.print("The sorted array is: ");
		heap2.printMaxHeap();
		System.out.println();

		int[] array3 = { 14, 16, 19, 99, 22, 215, 11, 13, 188 };
		MaxHeap heap3 = new MaxHeap(array3);

		System.out.println("The orignal array is: " + Arrays.toString(array3));
		System.out.print("Print Max Heap: ");
		heap3.printMaxHeap();
		heap3.heapsort();
		System.out.print("The sorted array is: ");
		heap3.printMaxHeap();
		System.out.println();

		int[] array4 = { 5, 8, 7, 6, 99, 4, 55, 33, 4 };
		MaxHeap heap4 = new MaxHeap(array4);

		System.out.println("The orignal array is: " + Arrays.toString(array4));
		System.out.print("Print Max Heap: ");
		heap4.printMaxHeap();
		heap4.heapsort();
		System.out.print("The sorted array is: ");
		heap4.printMaxHeap();
		System.out.println();

		int[] array5 = { 2, 33, 22, 55, 5, 66, 14, 46, 63, 62, 44, 19 };
		MaxHeap heap5 = new MaxHeap(array5);

		System.out.println("The orignal array is: " + Arrays.toString(array5));
		System.out.print("Print Max Heap: ");
		heap5.printMaxHeap();
		heap5.heapsort();
		System.out.print("The sorted array is: ");
		heap5.printMaxHeap();
		System.out.println();

	}
}