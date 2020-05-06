package com.cg.controller;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cg.dao.SeatRepository;
import com.cg.entity.Bus;
import com.cg.entity.Seats;


@RestController
public class SeatController {

	@Autowired
	private SeatRepository seatRepository;
	
	@GetMapping(path="seats/checkStatusOfSeats/busId/{busId}/date/{date}")
	public List<String> SeatStatus(@PathVariable String busId,@PathVariable String date)
	{
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate date1=LocalDate.parse(date,formatter);
		
		Seats seat=seatRepository.findSeatByBusIdAndDate(busId, date1);
		if(seat!=null)
		{
			List<String> status=new ArrayList<String>();
			status.add(seat.getSeat1());
			status.add(seat.getSeat2());
			status.add(seat.getSeat3());
			status.add(seat.getSeat4());
			status.add(seat.getSeat5());
			return status;
//			if(seat.getSeat1().equals("occupied")&&seat.getDate().equals(LocalDate.now()))
//			{
//				return "seat is occupied!! search for another seat";
//			}
//			else if(seat.getSeat1().equals("occupied")&& !seat.getDate().equals(LocalDate.now()))
//			{
//				return "seat is occupied!! search for another seat";
//			
//			}
//			else if(seat.getSeat1().equals("available"))
//			{
//				seat.setSeat1("Occupied");
//				seatRepository.save(seat);
//				return "booking done successfully";
//			}
		}
		else
		{
			Seats newSeat=new Seats();
			newSeat.setDate(date1);
			newSeat.setBusId(busId);
			newSeat.setSeat1("Available");
			newSeat.setSeat2("Available");
			newSeat.setSeat3("Available");
			newSeat.setSeat4("Available");
			newSeat.setSeat5("Available");
			seatRepository.save(newSeat);
			List<String> status=new ArrayList<String>();
			status.add(newSeat.getSeat1());
			status.add(newSeat.getSeat2());
			status.add(newSeat.getSeat3());
			status.add(newSeat.getSeat4());
			status.add(newSeat.getSeat5());
			return status;		
		}
				
	}
	
	@GetMapping(path="seats/bookSeat/busId/{busId}/date/{date}/seat/{seatNo}")
	public String SeatBooking(@PathVariable String busId,@PathVariable String date,@PathVariable String seatNo)
	{
		
		if(seatNo.equals("Seat1"))
		{
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
			LocalDate date1=LocalDate.parse(date,formatter);
			Seats existingSeat=seatRepository.findSeatByBusIdAndDate(busId, date1);
			if(existingSeat.getSeat1().equals("available"))
			{
				existingSeat.setSeat1("occupied");
				 seatRepository.save(existingSeat);
				 return "booking done successfully";
			}
			else
			{
				return "sorry!!!the seat is occupied......select another seat or date of travel";
			}
			
		}
	
		if(seatNo.equals("Seat2"))
		{
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
			LocalDate date1=LocalDate.parse(date,formatter);
			Seats existingSeat=seatRepository.findSeatByBusIdAndDate(busId, date1);
			if(existingSeat.getSeat2().equals("available"))
			{
				existingSeat.setSeat2("occupied");
				 seatRepository.save(existingSeat);
				 return "booking done successfully";
			}
			else
			{
				return "sorry!!!the seat is occupied......select another seat or date of travel";
			}
			
		}
		if(seatNo.equals("Seat3"))
		{
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
			LocalDate date1=LocalDate.parse(date,formatter);
			Seats existingSeat=seatRepository.findSeatByBusIdAndDate(busId, date1);
			if(existingSeat.getSeat3().equals("available"))
			{
				existingSeat.setSeat3("occupied");
				 seatRepository.save(existingSeat);
				 return "booking done successfully";
			}
			else
			{
				return "sorry!!!the seat is occupied......select another seat or date of travel";
			}
			
		}
		if(seatNo.equals("Seat4"))
		{
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
			LocalDate date1=LocalDate.parse(date,formatter);
			Seats existingSeat=seatRepository.findSeatByBusIdAndDate(busId, date1);
			if(existingSeat.getSeat4().equals("available"))
			{
				existingSeat.setSeat4("occupied");
				 seatRepository.save(existingSeat);
				 return "booking done successfully";
			}
			else
			{
				return "sorry!!!the seat is occupied......select another seat or date of travel";
			}
			
		}
		if(seatNo.equals("Seat5"))
		{
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
			LocalDate date1=LocalDate.parse(date,formatter);
			Seats existingSeat=seatRepository.findSeatByBusIdAndDate(busId, date1);
			if(existingSeat.getSeat5().equals("available"))
			{
				existingSeat.setSeat5("occupied");
				 seatRepository.save(existingSeat);
				 return "booking done successfully";
			}
			else
			{
				return "sorry!!!the seat is occupied......select another seat or date of travel";
			}
			
		}
		return null;
		
	}
	
	
	
}
