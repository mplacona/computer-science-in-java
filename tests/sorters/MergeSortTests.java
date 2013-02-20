package sorters;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

import sorters.MergeSort;
import sorters.ISort;

public class MergeSortTests {
	private ISort merge;
	private int arr[] = {5,4,3,2,1,0};

	public MergeSortTests() {
	}

	@Before
	public void setUp() throws Exception {
		merge = new MergeSort(arr);
	}

	@Test
	public void testObjectIsCreated() {
		assertTrue(merge instanceof MergeSort);
	}
	
	@Test
	public void testItemsSorted(){
		int[] arrToSort = this.arr.clone();
		
		// Expected array
		int[] arrExpected = arr.clone();
		Arrays.sort(arrExpected);
		
		MergeSort merge = new MergeSort(arrToSort);
		merge.sort();
		assertArrayEquals(arrExpected, arrToSort);
	}

}
