package com.flightApp.dto;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.ElementCollection;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class BookingDto {
	
	private String pnrNumber;

	private String flightName;
	
	private String flightId;

	private String date;
	
	private LocalDate bookingDate;
	
	private String startTime;

	private String endTime;

	private String source;

	private String destination;

	private String name;

	private String email;

	private int totalSeats;

	private String mealType;
	
	private String status;
	
	@ElementCollection
	private List<Passengers> passengersDto = new ArrayList<>();

}
