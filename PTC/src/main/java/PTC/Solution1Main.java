package PTC;

import PTC.solution.SimpleSolution;

import java.util.Arrays;
import java.util.List;


public class Solution1Main{
    
    public static void main(String[] args)
    {
        List<Integer> myList = Arrays.asList(1,2,3,4,5);
        List<String> myListString = Arrays.asList("a","b","c","d","e");
        
        List<List<Integer>> lists1 = SimpleSolution.partition(myList,2);
        List<List<Integer>> lists2 = SimpleSolution.partition(myList,3);
        List<List<Integer>> lists3 = SimpleSolution.partition(myList,1);
        
        List<List<String>> stringList = SimpleSolution.partition(myListString,1);
        
        
        System.out.println(lists1);
        System.out.println(lists2);
        System.out.println(lists3);


        System.out.println(stringList);


    }
}