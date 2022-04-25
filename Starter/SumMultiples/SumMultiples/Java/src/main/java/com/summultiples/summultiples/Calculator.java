package com.summultiples.summultiples;
import java.util.*;

public class Calculator 
{
    public static int Sum(int value)
    {
        int sum = 0;
	HashMap<Integer,Integer> numbers = new HashMap<Integer,Integer>();

	for(int i=2; i<value; i=i+2)
	{
		numbers.put(i,i);
		sum=sum+i;
	}

	for(int i=5; i<value; i=i+5)
	{
		if(!numbers.containsKey(i))
		{
			numbers.put(i,i);
			sum=sum+i;
		}
	}

        return sum;
    }

}
