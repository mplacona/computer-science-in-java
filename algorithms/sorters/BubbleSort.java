package sorters;

import utils.Utils;

/**
 * @author Marcos
 * Purpose: To sort an array using Bubble sort
 * Method:  Starts at the beginning of the data set. It compares the first two elements, and if the first is greater than the second, 
 * 			it swaps them. It continues doing this for each pair of adjacent elements to the end of the data set. It then starts again with the first two 
 * 			elements, repeating until no swaps have occurred on the last pass
 * Visual:	http://upload.wikimedia.org/wikipedia/commons/c/c8/Bubble-sort-example-300px.gif
 */
public class BubbleSort extends Utils implements ISort  {
	private int arr[];
	
	public static void main(String[] args) {
		BubbleSort bubble = new BubbleSort(arrNumbers);
		bubble.sort();
		print(arrNumbers);
	}
	
	public BubbleSort(int arr[]){
		super();
		this.arr = arr;
	}
	
	@Override
	public void sort() {
		for(int i = arr.length - 1; i > 0; i--){
			for(int j = 0; j < arr.length - 1; j++){
				int tempA = arr[j];
				int tempB = arr[j+1];
				if(arr[j] > arr[j+1]){
					// swap values
					arr[j] = tempB;
					arr[j+1] = tempA;
				}
			}
		}
		
	}	

}
