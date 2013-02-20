package searchers;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import searchers.BinarySearch;

public class BinarySearchTests {

	public BinarySearchTests() {
	}

	@Test
	public void testContains() {
		// The array has already been sorted
		int[]a = {1, 2, 3, 4, 7, 9, 28, 34, 82};
		assertTrue(BinarySearch.contains(a, 1));
		assertTrue(BinarySearch.contains(a, 4));
		assertTrue(BinarySearch.contains(a, 7));
		assertTrue(BinarySearch.contains(a, 82));
	}

}
