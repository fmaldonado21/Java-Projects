package assg8_maldonadof21;

import java.io.File;
import java.util.*;
import java.io.FileNotFoundException;

public class Simulation {
	
	public static int arriveTimetotal = 0;
	public static int transTimetotal = 0;
	public static int eventsNum = 0;
	public static int departureTimetotal = 0;
	public static boolean bool = true;
	
	public static void Arrival(Event newE, EventList eList, ArrayDeque<Event> bankQ) {
		//Removes first event 
		eList.remove();
		if(bankQ.isEmpty() && bool) {
			int eventTime = newE.getDuration() + newE.gettransTime();
			Event depart = new Event(eventTime);
			eList.insertEvent(depart);
			bool = false;
		}
		else {
			bankQ.offerLast(newE);
		}
		
		System.out.println(newE.toString());
		eventsNum++;
		arriveTimetotal += newE.getDuration();
		transTimetotal += newE.gettransTime();
	}
	
	public static void Departure(Event newE, EventList eList, ArrayDeque<Event> bankQ) {
		if(!bankQ.isEmpty()) {
			Event passenger = bankQ.peek();
			bankQ.poll();
			int EventTime = newE.getDuration() + passenger.gettransTime();
			Event departE = new Event(EventTime);
			eList.insertEvent(departE);
		}
		else {
			bool = true;
		}
		
		System.out.println(newE.toString());
		departureTimetotal += newE.getDuration();
	}

	public static void main(String[] args) {
		
		String filename = "assg8_input.txt";
		double avgWaitTime = 0;
		
		//making an empty queue
		ArrayDeque<Event> bank = new ArrayDeque<Event>();
		EventList eList = new EventList();
		Scanner in = null;
		
		System.out.println("Simulation Begins");
		
		//Reading the file and putting it in the bank queue
		try {
			in = new Scanner(new File(filename));
		}
		catch(FileNotFoundException e) {
			System.out.println("File Not Found!");
			System.exit(0);
		}
		
		while(in.hasNextLine()) {
			Event tmp = new Event(in.nextInt(), in.nextInt());
			eList.insertEvent(tmp);
			
		}
		
		in.close();
		while(!eList.isEmpty()) {
			//the new event goes at the beginning of the list
			Event newE = eList.retrieve();
			
			if(newE.arrive()) {
				Event passenger = newE; 
				System.out.println("Processing an arrival event at time: ");
				Arrival(passenger, eList, bank);
			}
			else {
				Event passenger = newE;
				eList.remove();
				System.out.println("Processing a departure event at time: ");
				Departure(passenger, eList, bank);
			}
		}
		
		avgWaitTime = (double)(departureTimetotal - transTimetotal - arriveTimetotal) / eventsNum;
		
		System.out.println("Simulation Ends");
		System.out.println("\nFinal Statistics:");
		System.out.println("Number of people processed: "+ eventsNum);
		System.out.println("Average time waited: " + avgWaitTime);

	}

}
