package sjsu.edu.salvador.hw4;

import java.util.ArrayList;
import java.util.Arrays;

public class Tester {

	public static void main(String[] args) 
	{
		ArrayList<Integer> multipleValue = new ArrayList<>(Arrays.asList(5, -1, 10, 0, 12, 15, 12, -3));
		ArrayList<String> twoValue = new ArrayList<>(Arrays.asList("Hello World", "Bye World"));
		ArrayList<Double> singleValue = new ArrayList<>(Arrays.asList(4.0));
	
		Pair<Integer> multiplePair = Utils.getMinMax(multipleValue);
		Pair<String> twoPair = Utils.getMinMax(twoValue);
		Pair<Double> singlePair = Utils.getMinMax(singleValue);
		
		System.out.println("Min value: " + multiplePair.getFirst() + ", Max value: " + multiplePair.getSecond());
		System.out.println("Min value: " + twoPair.getFirst() + ", Max value: " + twoPair.getSecond());
		System.out.println("Min value: " + singlePair.getFirst() + ", Max value: " + singlePair.getSecond());
	}
}
