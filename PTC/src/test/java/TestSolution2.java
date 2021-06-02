import PTC.solution1.PersonnalSolution;

import org.junit.Assert;
import org.junit.Before;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.List;


public class TestSolution2 {

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
		PersonnalSolution.partition(integerList,2);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testIllegalArgumentException()
	{
		PersonnalSolution.partition(integerList,0);
	}
	
	@Test
	public void testListwithSize2()
	{
		String expectedElement = "[[1, 2], [3, 4], [5]]";
		Assert.assertEquals(expectedResult, PersonnalSolution.partition(integerList,2).toString());
		Assert.assertTrue(PersonnalSolution.partition(integerList,2).size()== 3);
	}

    @Test
	public void testListwithSize3()
	{
		String expectedElement = "[[1, 2, 3], [4, 5]]";
		Assert.assertEquals(expectedResult, PersonnalSolution.partition(integerList,3).toString());
		Assert.assertTrue(PersonnalSolution.partition(integerList,3).size()== 2);
	}


    @Test
	public void testListwithSize1()
	{
		String expectedElement = "[[1], [2], [3], [4], [5]]";
		Assert.assertEquals(expectedResult, PersonnalSolution.partition(integerList,1).toString());
		Assert.assertTrue(PersonnalSolution.partition(integerList,1).size()== 5);
	}
	
	@Test
	public void testStringListe()
	{
		String expectedElement = "[[a], [b], [c], [d], [e]]";
		Assert.assertEquals(expectedResult, PersonnalSolution.partition(stringList,1).toString());
		Assert.assertTrue(PersonnalSolution.partition(stringList,1).size()== 5);
	}

}