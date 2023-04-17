package com.bookingcalendar.repository;

import com.bookingcalendar.model.ReservationDay;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservationDayRepository extends JpaRepository<ReservationDay,Long> {
}
