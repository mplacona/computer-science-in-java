package sorters;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

import uk.co.placona.algorithms.sorters.ISort;
import uk.co.placona.algorithms.sorters.SelectionSort;

public class SelectionSortTests {
	private ISort selection;
	private int arr[] = {5,4,3,2,1,0};

	public SelectionSortTests() {
	}

	@Before
	public void setUp() throws Exception {
		selection = new SelectionSort(arr);
	}

	@Test
	public void testObjectIsCreated() {
		assertTrue(selection instanceof SelectionSort);
	}
	
	@Test
	public void testItemsSorted(){
		int[] arrToSort = this.arr.clone();
		
		// Expected array
		int[] arrExpected = arr.clone();
		Arrays.sort(arrExpected);
		
		SelectionSort  selection = new SelectionSort(arrToSort);
		selection.sort();
		assertArrayEquals(arrExpected, arrToSort);
	}

}
