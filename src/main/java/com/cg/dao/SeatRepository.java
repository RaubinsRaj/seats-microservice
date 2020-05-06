package com.cg.dao;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cg.entity.Seats;

public interface SeatRepository extends JpaRepository<Seats,Integer>{

	
	
	@Query("from Seats where busId=?1 and date=?2 ")
	Seats findSeatByBusIdAndDate(String busId,LocalDate date);
	
	@Query("from Seats where busId=?1")
	List<Seats> findSeatByBusId(String busId);
	
}
