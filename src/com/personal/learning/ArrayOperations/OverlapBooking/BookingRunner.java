package com.personal.learning.ArrayOperations.OverlapBooking;

import java.util.ArrayList;

/**
 * Main class which adds the booking and then calls overlap method to find the number of overlap bookings..
 * @author swetavk
 *
 * @param <T>
 */


public class BookingRunner<T> {

	public static ArrayList<Bookings> Booking_list= new ArrayList<>();
	
	public static <T> void main(String args[])
	{
		
		
		
		Booking_list.add(new Bookings<Number>(1, 3));  // 1, 2, 3, 4
		Booking_list.add(new Bookings<Number>(4, 2));  // 4, 5, 6
		Booking_list.add(new Bookings<Number>(3, 5));  // 3, 4, 5, 6, 7, 8
		Booking_list.add(new Bookings<Number>(5, 2));  // 5, 6, 7
		Booking_list.add(new Bookings<Number>(6, 1));  // 6, 7
		Booking_list.add(new Bookings<Number>(19, 2)); 
		
		//Booking is .. 1, 2, 3, 4, 5
		
		System.out.println("Number of Bookings are "+ Booking_list.size());
		for(int i=0;i<Booking_list.size();i++)
		{
			System.out.println("Entry Date is "+ Booking_list.get(i).getBookings_entry_date()+ " Durations.."+Booking_list.get(i).getDuration());
		}
		
		FindOverLapNumber obj = new FindOverLapNumber();
		System.out.println("Total overlapped Booking.."+obj.findoverLap(Booking_list));
		
	}
	
}
