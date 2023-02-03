//Francisco Maldonado & Ari Laughlin

package activity12;

import java.util.*;
import java.io.*;

public class TreeSortTest {
	
	
	public static ArrayList<City> treeSort(ArrayList<City> Cities) {
		
		BinarySearchTree<City, String> cityTree = new BinarySearchTree<City, String>();
		
		for(City c : Cities) {
			cityTree.insert(c);
		}
		
		TreeIterator<City> tI = new TreeIterator<City>(cityTree);
		ArrayList<City> sortedCity = new ArrayList<City>();
		
		
		while(tI.hasNext()) {
			sortedCity.add(tI.next());
		}
		
		return sortedCity;
		}

	public static void main(String[] args) {
		
		Scanner file = null;
		
		String fname = "activity12_City.txt";
		
		try {
			file = new Scanner(new File(fname));
		}
		catch(FileNotFoundException e) {
			System.out.println("File not found!");
		}
	}

}
