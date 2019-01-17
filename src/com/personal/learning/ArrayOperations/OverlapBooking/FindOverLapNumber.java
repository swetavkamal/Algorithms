package com.personal.learning.ArrayOperations.OverlapBooking;

import java.util.ArrayList;
import java.util.HashSet;


/**
 * 
 * This class has the methos which will find the number of overlapped bookings 
 * For example : if we have below bookings
 * 		
	(1, 3));  // 1, 2, 3, 4
	(4, 2));  // 4, 5, 6
	(3, 5));  // 3, 4, 5, 6, 7, 8

	We have first booking from 1 to three days 1,2,3,4
	Second booking 4 to 4,5,6th
	Third from 3 to 5 days .. 3,4,5,6,7,8
	
	We have three overlapps here.  4 of first +  and 4 of second  + 4/5 of third
 * 
 * @author swetavk
 *
 */



public class FindOverLapNumber {
	
	public  HashSet<Integer> hs = new HashSet<>();
	int overlapp_bookings=0;
	public  int findoverLap(ArrayList<Bookings> al)
	{
	
		System.out.println("\n\nTotal number of bookings are "+al.size());
		
		for(int i =0; i< al.size();i++)
		{
			int flag=0;

			for(int j=0; j<= (int) al.get(i).getDuration();j++)
			{

				if(hs.contains(((int) al.get(i).entry_date)+j) && flag == 0)
				{
				//	System.out.println("increasing overlapping counter");
					overlapp_bookings++;
					flag=1;

				}
				else
					hs.add(((int) al.get(i).entry_date)+j);
				
			}

			
			
		}
		
		return overlapp_bookings;
	}

}
