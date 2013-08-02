package sorters;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;
import uk.co.placona.algorithms.sorters.BubbleSort;
import uk.co.placona.algorithms.sorters.ISort;

public class BubbleSortTests {
	private ISort bubble;
	private int arr[] = {5,4,3,2,1,0};

	public BubbleSortTests() {
	}

	@Before
	public void setUp() throws Exception {
		bubble = new BubbleSort(arr);
	}

	@Test
	public void testObjectIsCreated() {
		assertTrue(bubble instanceof BubbleSort);
	}
	
	@Test
	public void testItemsSorted(){
		int[] arrToSort = this.arr.clone();
		
		// Expected array
		int[] arrExpected = arr.clone();
		Arrays.sort(arrExpected);
		
		BubbleSort bubble = new BubbleSort(arrToSort);
		bubble.sort();
		assertArrayEquals(arrExpected, arrToSort);
	}

}
