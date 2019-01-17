package com.personal.learning.ArrayOperations.OverlapBooking;


/**
 * 
 * 
 * @author swetavk
 *	This is a generic class Booking which has two generic type 
 *	1. Entry Date
 *	2. Duration.
 * @param <T>
 */

public class Bookings<T> {
	
	T entry_date;
	T duration;
	

	
	public Bookings(T i, T j) {
		this.entry_date=i;
		this.duration=j;
		
	}
	
	// Getters for entry date and Duration...
	T getBookings_entry_date()
	{
		return entry_date;
	}
	
	T getDuration()
	{
		return duration;
	}
	
	
	
	//Setters for Entry date and Durations...
	void setDuration(T duration)
	{
		this.duration=duration;
	}
	
	
	void setBooking_entry_date(T entry_date)
	{
		this.entry_date=entry_date;
	}
	
}
