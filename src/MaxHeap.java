
/**
 * 
 * @author Brendan O'Dowd
 * @version 9/211/2018
 * 
 * CSCI 333
 * Homework 2
 * Adam Whitley
 *
 *
 *       This class contains methods that implement a Max Heap. 
 */

import java.util.Arrays;

public class MaxHeap {

	protected static int[] heapArray;
	protected static int heapSize;

	/**
	 * constructor method - creates a copy of the array and calls buildMaxHeap
	 * 
	 * @param array
	 *            an integer array representing the values to be in the heap
	 */
	public MaxHeap(int[] array) {
		heapArray = Arrays.copyOf(array, array.length);
		heapSize = array.length;
		buildMaxHeap();
	}

	/**
	 * gets the parent node at index
	 * 
	 * @param index
	 *            index to find parent of
	 * @return index of the parent node or -1 if index is out of bounds
	 */
	protected int parentOf(int index) {
		if (index == 1 || index > heapArray.length - 1)
			return -1;

		return (index + 1) / 2;
	}

	/**
	 * gets the left child at index
	 * 
	 * @param index
	 *            index to find left child of
	 * @return the index of the left child or -1 if the index given is out of bounds
	 */
	protected int leftChildOf(int index) {
		if (index > heapArray.length - 1)
			return -1;

		return (2 * index) + 1;
	}

	/**
	 * gets the right child at index
	 * 
	 * @param index
	 *            index to find right child of
	 * @return index of the right child or -1 if the index is out of bounds
	 */
	protected int rightChildOf(int index) {
		if (index > heapArray.length - 1)
			return -1;

		return (2 * index) + 2;
	}

	/**
	 * method to print the array
	 */
	public void printMaxHeap() {
		System.out.println(Arrays.toString(heapArray));
	}

	/**
	 * method to swap the values of two elements
	 * 
	 * @param first
	 *            first element to swap
	 * @param second
	 *            second element to swap
	 */
	private void swap(int first, int second) {
		int temp;
		temp = heapArray[first];
		heapArray[first] = heapArray[second];
		heapArray[second] = temp;
	}

	/**
	 * method to "fix" the subtree of the heap restoring max-heap property
	 * 
	 * @param index
	 *            index of tree to start the heapify
	 */
	protected void maxHeapify(int index) {
		int leftChild = leftChildOf(index);
		int rightChild = rightChildOf(index);
		int largest;

		if (leftChild < heapSize && heapArray[leftChild] > heapArray[index])
			largest = leftChild;
		else {
			largest = index;
		}

		if (rightChild < heapSize && heapArray[rightChild] > heapArray[largest]) {
			largest = rightChild;
		}

		if (largest != index) {
			swap(index, largest);
			maxHeapify(largest);
		}
	}

	/**
	 * method to buid the heap from a 'bottom up' approach
	 */
	protected void buildMaxHeap() {
		for (int i = heapSize / 2 - 1; i >= 0; i--) {
			maxHeapify(i);
		}
	}

	/**
	 * method that removes the root from the heap over and over, restoring the heap
	 * property each time
	 */
	public void heapsort() {
		int backupCopy = heapSize;
		for (int i = heapSize - 1; i >= 1; i--) {
			swap(0, i);
			heapSize--;
			maxHeapify(0);
		}
		heapSize = backupCopy;
	}
}
