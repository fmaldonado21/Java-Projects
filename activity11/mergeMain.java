//Francisco Maldonado & Jethro Libutan


package activity11;

import java.util.*;

public class mergeMain {
	
	private ArrayList<Integer> inputList;
	
	public static ArrayList<Integer> mergeSort(ArrayList<Integer> sortlist){
		int sizenum = sortlist.size();
		if (sizenum<2) {
			return sortlist;
		}
		
		ArrayList<Integer> left = new ArrayList<Integer>();
		ArrayList<Integer> right = new ArrayList<Integer>();
		ArrayList<Integer> sorted = new ArrayList<Integer>();
		int center = sortlist.size() / 2;
		Iterator<Integer> iterator = sortlist.iterator();
		int leftIndex = 0;
		
		while(iterator.hasNext() && leftIndex < center) {
			left.add(sortlist.get(leftIndex));
			leftIndex++;
		}
		while(iterator.hasNext() && leftIndex < sortlist.size()) {
			right.add(sortlist.get(leftIndex));
			leftIndex++;
		}
		
		mergeSort(left);
		mergeSort(right);
		
		return merge(left, right);
	}

	
	public static ArrayList<Integer> merge(ArrayList<Integer> left, ArrayList<Integer> right){
		ArrayList<Integer> arrList = new ArrayList<Integer>();
		
		int a = 0, b = 0;
		
		while(a < left.size() && b < right.size()) {
			if(left.get(a) <= right.get(b)) {
				arrList.add(left.get(a));
				a++;
			} else {
				arrList.add(right.get(b));
				b++;
			}
			arrList.addAll(a, left);
			arrList.addAll(b, right);
		}
		
		return arrList;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int cnt;
		String number;
		ArrayList<Integer> inputL = new ArrayList<Integer>();
		ArrayList<Integer> sort = new ArrayList<Integer>();
		
		System.out.println("Enter the number of integers to be sorted");
		cnt = Integer.parseInt(sc.nextLine());
		System.out.println("Enter the list of numbers separated by space");
		number = sc.nextLine();
		
		StringTokenizer st = new StringTokenizer(number, " ");
		
		while(st.hasMoreTokens()) {
			inputL.add(Integer.parseInt(st.nextToken()));
		}
		
		System.out.println("before sorting:");
		for(Integer num : inputL) {
			System.out.print(num + ", ");
		}
		System.out.println();
		
		sort = mergeSort(inputL);
		
		System.out.println("after sorting:");
		for(Integer num : sort) {
			System.out.print(num + ", ");
		}
		System.out.println();
		
		sc.close();

	}

}


//public static void mergeSort(ArrayList<Integer> inputList, int startIndex, int midIndex, int endIndex) {
//
//ArrayList<Integer> mergeSortlist = new ArrayList<Integer>();
//
//int leftIndex = startIndex;
//int rightIndex = midIndex+1;
//
//while(leftIndex <= midIndex && rightIndex <= endIndex) {
//	if(inputList.get(leftIndex)<=inputList.get(rightIndex)) {
//		mergeSortlist.add(inputList.get(leftIndex));
//		leftIndex++;
//	}
//	else {
//		mergeSortlist.add(inputList.get(rightIndex));
//		rightIndex++;
//	}
//}
//
//}
