/**
 * TODO: Add your file header
 * Name:
 * ID:
 * Email:
 * Sources used: Put "None" if you did not have any external help
 * Some example of sources used would be Tutors, Zybooks, and Lecture Slides
 * 
 * 2-4 sentence file description here
 */

 //IMPORTANT: Do not change the headers!

import static org.junit.Assert.*;

import org.junit.*;
import org.omg.CORBA.OBJECT_NOT_EXIST;


/**
 * TODO: Add your class header (1-2 sentences)
 */
public class MyArrayListHiddenTester {

	private MyArrayList testList, nullArrayList, fullArrayList;

	Integer[] nullList = null;
	Integer[] fullList = {4, 5, 6, 7, 8, 9};
	/**
	 * This sets up the test fixture. JUnit invokes this method before
	 * every testXXX method. The @Before tag tells JUnit to run this method
	 * before each test */
	@Before
	public void setUp() throws Exception {
		nullArrayList = new MyArrayList<Integer>(nullList);
		fullArrayList = new MyArrayList<Integer>(fullList);
	}

	/**
	 * Aims to test the constructor when the input argument
	 * is not valid
	 */
	@Test
	public void testConstructorInvalidArg(){
		boolean exceptionThrown = false;
		try {
			testList = new MyArrayList(-2);
  		}
  		catch (IllegalArgumentException e) {
			exceptionThrown = true;
  		}
		assertTrue("Except thrown for illegalArgument", exceptionThrown);
	}

	/**
	 * Aims to test the constructor when the input argument
	 * is null
	 */
	@Test
	public void testConstructorNullArg(){
		assertEquals("Check that no-arg constructor behavior follows", 5, 
			nullArrayList.data.length);
		assertEquals("Check that no-arg constructor size 0", 0, 
			nullArrayList.size);
	}

	/**
	 * Aims to test the append method when an element is added to a full list
	 * Check reflection on size and capacity
	 */
	@Test
	public void testAppendAtCapacity(){
		fullArrayList.append(10);

		assertEquals("Check that append increments size", 7, 
			fullArrayList.size);
		assertEquals("Check that capacity is changed", 12, 
			fullArrayList.data.length);
		assertEquals("check the correct element", 4, 
			fullArrayList.data[0]);
		assertEquals("check the correct element", 10, 
			fullArrayList.data[6]);
		assertEquals("check the correct element", null, 
			fullArrayList.data[11]);
	}

	/**
	 * Aims to test the prepend method when a null element is added
	 * Checks reflection on size and capacity
	 * Checks whether null was added successfully
	 */
	@Test
	public void testPrependNull(){
		fullArrayList.prepend(null);

		assertEquals("Check that append increments size", 7, 
			fullArrayList.size);
		assertEquals("Check that capacity is changed", 12, 
			fullArrayList.data.length);
		assertEquals("check the correct element", null, 
			fullArrayList.data[0]);
		assertEquals("check the correct element", 9, 
			fullArrayList.data[6]);
		assertEquals("check the correct element", null, 
			fullArrayList.data[11]);
	}
	
	/**
	 * Aims to test the insert method when input index is out of bounds
	 */
	@Test
	public void testInsertOutOfBound(){
		boolean exceptionThrown = false;
		try {
			fullArrayList.insert(-2, 3);;
  		}
  		catch (IndexOutOfBoundsException e) {
			exceptionThrown = true;
  		}
		assertTrue("Except thrown for IndexOutOfBounds", exceptionThrown);
	}

	/**
	 * Insert multiple (eg. 1000) elements sequentially beyond capacity -
	 * Check reflection on size and capacity
	 * Hint: for loop could come in handy
	 */
	@Test
	public void testInsertMultiple(){
		fullArrayList.insert(2, 99);
		assertEquals("should insert 99 to the list", 99, fullArrayList.data[2]);
		assertEquals("should increment size", 7, fullArrayList.size);
		assertEquals("capacity of the list should change when" + 
			"insert one elem", 12, fullArrayList.data.length);
		assertEquals("should move 6 in the list", 6, fullArrayList.data[3]);
		fullArrayList.insert(2, 44);
		assertEquals("should insert 44 to the list", 44, fullArrayList.data[2]);
		assertEquals("should increment size", 8, fullArrayList.size);
		assertEquals("capacity of the list should not change when" + 
			"insert one elem", 12, fullArrayList.data.length);
		assertEquals("should move 99 in the list", 99, fullArrayList.data[3]);
		for (int i = 0; i < 6; i++) {
			fullArrayList.insert(2, 11 + i);
		}
		assertEquals("should insert 16 to the list", 16, fullArrayList.data[2]);
		assertEquals("should increment size", 14, fullArrayList.size);
		assertEquals("capacity of the list should change when" + 
			"insert one elem", 24, fullArrayList.data.length);
		assertEquals("should move 15 in the list", 15, fullArrayList.data[3]);
	}

	/**
	 * Aims to test the get method when input index is out of bound
	 */
	@Test
	public void testGetOutOfBound(){
		
	}

	/**
	 * Aims to test the set method when input index is out of bound
	 */
	@Test
	public void testSetOutOfBound(){
		
	}


	/**
	 * Aims to test the remove method when input index is out of bound
	 */
	@Test
	public void testRemoveOutOfBound(){
		
	}

	/**
	 * Aims to test the expandCapacity method when 
	 * requiredCapacity is strictly less than the current capacity
	 */
	@Test
	public void testExpandCapacitySmaller(){
	   
	}

	/**
	 * Aims to test the expandCapacity method when 
	 * requiredCapacity is greater than double(2x) the current capacity
	 */
	@Test
	public void testExpandCapacityExplode(){
		
	}
	

}
