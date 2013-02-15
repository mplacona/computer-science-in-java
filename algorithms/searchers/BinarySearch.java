package searchers;

public class BinarySearch {

	public static boolean contains(int[] arr, int criteria) {
		// check the length before we do anything
		if(arr.length == 0){
			return false;
		}
		
		int 	low = 0,
				high = arr.length-1;
		
		while(low <= high){
			// find the middle of the array
			int middle = (low + high) / 2;
			if(criteria > arr[middle]){
				low = middle + 1;
			}
			else if(criteria < arr[middle]){
				high = middle -1;
			}
			else{
				return true;
				// Drat! couldn't find it this time
			}
		}
		return false;
	}

}
