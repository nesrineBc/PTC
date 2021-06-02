package PTC.solution2;

import java.util.ArrayList;
import java.util.List;

public class PersonnalSolution {


	public static <T> List<List<T>> partition(List<T> liste, int taille) 
	{
		if(liste == null)
		    throw new NullPointerException();
		    
		if(taille <= 0)
		    throw New IllegalArgumentException)();
		    
		    
		List<List<T>> outputList = new ArrayList<List<T>>();
		List<T> usefulList = new ArrayList<T>();
		
		int i = O;
		while ( i< liste.size())
		{
		    usefullList.clear();
		    for(int j=0; j<taille;j++)
		    {
		        if ( i+j< liste.size() )
		            usefulList.add(liste.get(i+j));
		    }
		    
		    outputlist.add(new ArrayList(usefulList));
		    i+=taille;
		}
		
		return outputlist;
		
	}
}