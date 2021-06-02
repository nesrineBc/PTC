package PTC;

import PTC.solution.PersonnalSolution;

import java.util.Arrays;
import java.util.List;


public class Solution2Main{
    
    public static void main(String[] args)
    {
        List<Integer> myList = Arrays.asList(1,2,3,4,5);
        List<String> myListString = Arrays.asList("a","b","c","d","e");
        
        List<List<Integer>> lists1 = PersonnalSolution.partition(myList,2);
        List<List<Integer>> lists2 = PersonnalSolution.partition(myList,3);
        List<List<Integer>> lists3 = PersonnalSolution.partition(myList,1);
        
        List<List<String>> stringList = PersonnalSolution.partition(myListString,1);
        
        
        System.out.println(lists1);
        System.out.println(lists2);
        System.out.println(lists3);


        System.out.println(stringList);


    }
}