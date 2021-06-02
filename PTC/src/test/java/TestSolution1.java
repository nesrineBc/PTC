import PTC.solution1.SimpleSolution;

import org.junit.Assert;
import org.junit.Before;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.List;


public class TestSolution1 {

	List<Integer> integerList;
	List<String> stringList;


	@Before	
	public void init() throws Exception
	{
		integerList = Arrays.asList(1,2,3,4,5);
		stringList = Arrays.asList("a","b","c","d","e");	
	}
	
	
	@Test(expected=NullPointerException.class)
	public void testNullPointerException()
	{
		integerList =null;
		SimpleSolution.partition(integerList,2);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testIllegalArgumentException()
	{
		SimpleSolution.partition(integerList,0);
	}
	
	@Test
	public void testListwithSize2()
	{
		String expectedElement = "[[1, 2], [3, 4], [5]]";
		List<Integer> liste = SimpleSolution.partition(integerList,2);
		Assert.assertEquals(expectedResult, liste.toString());
		Assert.assertTrue(liste.size()== 3);
	}

    @Test
	public void testListwithSize3()
	{
		String expectedElement = "[[1, 2, 3], [4, 5]]";
		List<Integer> liste = SimpleSolution.partition(integerList,3);
		Assert.assertEquals(expectedResult, liste.toString());
		Assert.assertTrue(liste.size()== 2);
	}


    @Test
	public void testListwithSize1()
	{
		String expectedElement = "[[1], [2], [3], [4], [5]]";
		List<Integer> liste = SimpleSolution.partition(integerList,1);
		Assert.assertEquals(expectedResult, liste.toString());
		Assert.assertTrue(liste.size()== 5);
	}
	
	@Test
	public void testStringListe()
	{
		String expectedElement = "[[a], [b], [c], [d], [e]]";
		List<Integer> liste = SimpleSolution.partition(stringList,1);
		Assert.assertEquals(expectedResult, liste.toString());
		Assert.assertTrue(liste.size()== 5);
	}

}