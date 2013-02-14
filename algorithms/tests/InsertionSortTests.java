package tests;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

import sorters.ISort;
import sorters.InsertionSort;

public class InsertionSortTests {
	private ISort insertion;
	private int arr[] = {5,4,3,2,1,0};

	public InsertionSortTests() {
	}

	@Before
	public void setUp() throws Exception {
		insertion = new InsertionSort(arr);
	}

	@Test
	public void testObjectIsCreated() {
		assertTrue(insertion instanceof InsertionSort);
	}
	
	@Test
	public void testItemsSorted(){
		int[] arrToSort = this.arr.clone();
		
		// Expected array
		int[] arrExpected = arr.clone();
		Arrays.sort(arrExpected);
		
		InsertionSort insertion = new InsertionSort(arrToSort);
		insertion.sort();
		assertArrayEquals(arrExpected, arrToSort);
	}

}
