package sjsu.edu.salvador.hw4;

import java.util.ArrayList;

public class Utils 
{
	static <T extends Comparable<T>> Pair<T> getMinMax(ArrayList<T> arr)
	{
		T min = arr.get(0);
		T max = arr.get(0);
		
		if(arr.size() == 0)
			return new Pair<T>(null, null);
		
		else if(arr.size() == 1)
			return new Pair<T>(min, max);
		else
		{
			for(int i = 0; i < arr.size(); i++)
			{
				if(arr.get(i) instanceof Comparable)
				{
					if(arr.get(i).compareTo(min) < 0)
						min = arr.get(i);
					if(arr.get(i).compareTo(max) > 0)
						max = arr.get(i);
				}
			}
			return new Pair<T>(min, max);
		}
	}
}
