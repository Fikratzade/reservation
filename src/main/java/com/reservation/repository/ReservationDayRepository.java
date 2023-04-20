package com.reservation.repository;

import com.reservation.entity.ReservationDay;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservationDayRepository extends JpaRepository<ReservationDay,Long> {
}
