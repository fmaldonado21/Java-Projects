package assg1_maldonadof21;

import java.util.*;

public class CountFamilies {
	
	public static void main(String[] args) {
		
		int numOfFams, incomes[], max = 0, belowTen = 0;
		Scanner kbd = new Scanner(System.in);
				
		System.out.print("Enter the number of families: ");
		numOfFams = kbd.nextInt();
		incomes = new int[numOfFams];
		
		for(int i = 0; i < numOfFams; i++) {
			System.out.print("Enter an income: ");
			incomes[i] = kbd.nextInt();
			if(incomes[i] > max) {
				max = incomes[i];
			}
		}
		System.out.println("\nthe maximum income: " + max);
		System.out.println("\nThe incomes of families making less than 10% of the maximum are: ");
		
		for(int i = 0; i < numOfFams; i++)
		{	
			if(incomes[i] < max * .1)
			{
				System.out.println(incomes[i]);
				belowTen++;
			}
		}
		
		System.out.println("For a total of " + belowTen + " families");
	}

}